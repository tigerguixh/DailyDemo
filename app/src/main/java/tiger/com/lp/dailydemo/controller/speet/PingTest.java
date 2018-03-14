package tiger.com.lp.dailydemo.controller.speet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author erdigurbuz
 */
public class PingTest extends Thread {

    HashMap<String, Object> result = new HashMap<>();
    String server = "";
    int count;
    double instantRtt = 0;
    double avgRtt = 0.0;
    boolean finished = false;
    boolean started = false;

    public PingTest(String serverIpAddress, int pingTryCount) {
        this.server = serverIpAddress;
        this.count = pingTryCount;
    }

    public double getAvgRtt() {
        return avgRtt;
    }

    public double getInstantRtt() {
        return instantRtt;
    }

    public boolean isFinished() {
        return finished;
    }

    @Override
    public void run() {
        try {
            Process p =null;
            ProcessBuilder ps = new ProcessBuilder("ping", "-c " + count, this.server);

            ps.redirectErrorStream(true);
            Process pr = ps.start();

            p = Runtime.getRuntime().exec("/system/bin/ping -c 4 "+"hljspeed1.chinanetcenter.com");

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            String output = "";
            while ((line = in.readLine()) != null) {
                if (line.contains("icmp_seq")) {
                    instantRtt = Double.parseDouble(line.split(" ")[line.split(" ").length - 2].replace("time=", ""));
                }
                if (line.startsWith("rtt ")) {
                    avgRtt = Double.parseDouble(line.split("/")[4]);
                    break;
                }
                System.out.println("line: " + line);
            }
            pr.waitFor();
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        finished = true;
    }

}
