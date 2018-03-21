package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
        Process p = Runtime.getRuntime().exec("ping -c 4 " + "www.baidu.com");
        BufferedReader buf = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String str = new String();
        while((str=buf.readLine())!=null){
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
}
