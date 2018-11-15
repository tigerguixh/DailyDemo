package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.content.Context;
import android.net.DhcpInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/21 0021
 * @description
 */

public class PingActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StringBuffer stringBuilder = new StringBuffer();
        //ping("220.181.57.216", 5, stringBuilder);

        //Log.e("PingActivity",stringBuilder.toString());
        new NetPing().execute();

        getIpAddress("http://media8111.tadu.com");
        getLocalDNS();
        getWifiNetInfo(this);
    }

    public String Ping(String str) {
        String resault = "";
        Process p;
        try {
            //ping -c 3 -w 100  中  ，-c 是指ping的次数 3是指ping 3次 ，-w 100  以秒为单位指定超时间隔，是指超时时间为100秒
            p = Runtime.getRuntime().exec("ping -c 3 -w 100 " + str);
            int status = p.waitFor();

            InputStream input = p.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(input));
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = in.readLine()) != null){
                buffer.append(line);
            }
            System.out.println("Return ============" + buffer.toString());

            if (status == 0) {
                resault = "success";
            } else {
                resault = "faild";
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return resault;
    }

    private class NetPing extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {
            String s = "";
            /*s = Ping("www.baidu.com");
            Log.i("ping", s);*/

            try{
                testPing();
            } catch (Exception e) {

            }
            return s;
        }
    }

    public void testPing() throws Exception{
        String lost = new String();
        String delay = new String();
        Process p = Runtime.getRuntime().exec("ping -c 4 " + "ydtest.ds365.com");
        BufferedReader buf = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String str = new String();
        while((str=buf.readLine())!=null){
            System.out.println("ping结果: " + str);
            if(str.contains("packet loss")){
                int i= str.indexOf("received");
                int j= str.indexOf("%");
                System.out.println("丢包率:"+str.substring(i+10, j+1));
//                  System.out.println("丢包率:"+str.substring(j-3, j+1));
                lost = str.substring(i+10, j+1);
            }
            if(str.contains("avg")){
                int i=str.indexOf("/", 20);
                int j=str.indexOf(".", i);
                System.out.println("延迟:"+str.substring(i+1, j));
                delay =str.substring(i+1, j);
                delay = delay+"ms";
            }
        }
    }

    public static boolean ping(String host, int pingCount, StringBuffer stringBuffer) {
        String line = null;
        Process process = null;
        BufferedReader successReader = null;
//        String command = "ping -c " + pingCount + " -w 5 " + host;
        String command = "ping -c " + pingCount + " " + host;
        boolean isSuccess = false;
        try {
            process = Runtime.getRuntime().exec(command);
            if (process == null) {
                Log.e("PingActivity", "ping fail:process is null.");
                append(stringBuffer, "ping fail:process is null.");
                return false;
            }
            successReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = successReader.readLine()) != null) {
                Log.e("PingActivity",line);
                append(stringBuffer, line);
            }
            int status = process.waitFor();
            if (status == 0) {
                Log.e("PingActivity","exec cmd success:" + command);
                append(stringBuffer, "exec cmd success:" + command);
                isSuccess = true;
            } else {
                Log.e("PingActivity","exec cmd fail.");
                append(stringBuffer, "exec cmd fail.");
                isSuccess = false;
            }
            Log.e("PingActivity","exec finished.");
            append(stringBuffer, "exec finished.");
        } catch (IOException e) {
            Log.e("PingActivity", e.getMessage());
        } catch (InterruptedException e) {
            Log.e("PingActivity",e.getMessage());
        } finally {
            Log.e("PingActivity","ping exit.");
            if (process != null) {
                process.destroy();
            }
            if (successReader != null) {
                try {
                    successReader.close();
                } catch (IOException e) {
                    Log.e("PingActivity",e.getMessage());
                }
            }
        }
        return isSuccess;
    }

    private static void append(StringBuffer stringBuffer, String text) {
        if (stringBuffer != null) {
            stringBuffer.append(text + "\n");
        }
    }

    public static void getIpAddress(final String host) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String ip = "";
                try {
                    InetAddress inetAddress = InetAddress.getByName(Uri.parse(host).getHost());
                    ip = inetAddress.getHostAddress();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void getLocalDNS(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Process cmdProcess = null;
                BufferedReader reader = null;
                String dnsIP = "";
                try {
                    cmdProcess = Runtime.getRuntime().exec("getprop net.dns1");
                    reader = new BufferedReader(new InputStreamReader(cmdProcess.getInputStream()));
                    dnsIP = reader.readLine();
                } catch (IOException e) {
                } finally{
                    try {
                        reader.close();
                    } catch (IOException e) {
                    }
                    cmdProcess.destroy();
                }

                getLocalIpAddress();
                getLocalDns("dns1");
            }
        }).start();
    }

    public static String getLocalIpAddress() {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface
                    .getNetworkInterfaces(); en.hasMoreElements();) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf
                        .getInetAddresses(); enumIpAddr.hasMoreElements();) {
                    InetAddress inetAddress = enumIpAddr.nextElement();
                    if (!inetAddress.isLoopbackAddress()) {
                        return inetAddress.getHostAddress().toString();
                    }
                }
            }
        } catch (SocketException ex) {
        }
        return null;
    }
    public static Map<String,String> getWifiNetInfo(Context context){
        Map<String,String> wifiInfo = new HashMap<>();
        WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        if(wifi  != null){
            DhcpInfo info = wifi.getDhcpInfo();
            wifiInfo.put("wifi-dns", intToIp(info.dns1) + ";" + intToIp(info.dns2));
            wifiInfo.put("wifi-gateway", intToIp(info.gateway));
            wifiInfo.put("wifi-ip", intToIp(info.ipAddress));
            wifiInfo.put("wifi-netmask", intToIp(info.netmask));
            wifiInfo.put("wifi-leaseTime", String.valueOf(info.leaseDuration));
            wifiInfo.put("wifi-dhcpServer", intToIp(info.serverAddress));
        }
        return wifiInfo;
    }

    public static String intToIp(int addr) {
        return  ((addr & 0xFF) + "." +
                ((addr >>>= 8) & 0xFF) + "." +
                ((addr >>>= 8) & 0xFF) + "." +
                ((addr >>>= 8) & 0xFF));
    }

    public static String getLocalDns(String dns) {
        Process process = null;
        String str = "";
        BufferedReader reader = null;
        try {
            process = Runtime.getRuntime().exec("getprop net." + dns);
            reader = new BufferedReader(new InputStreamReader(
                    process.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                str += line;
            }
            reader.close();
            process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                process.destroy();
            } catch (Exception e) {
            }
        }
        return str.trim();
    }



}
