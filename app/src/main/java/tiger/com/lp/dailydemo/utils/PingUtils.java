package tiger.com.lp.dailydemo.utils;


import androidx.annotation.NonNull;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/23 0023
 * @description
 */

public class PingUtils {
    private InetAddress address;
    private int timeOutMillis = 1000;
    private int delayBetweenScansMillis = 0;
    private int times = 1;
    private boolean cancelled = false;

    private PingUtils() {
    }

    public static PingUtils onAddress(@NonNull String address) throws UnknownHostException {
        PingUtils ping = new PingUtils();
        InetAddress ia = InetAddress.getByName(address);
        ping.setAddress(ia);
        return ping;
    }

    public static PingUtils onAddress(@NonNull InetAddress ia) {
        PingUtils ping = new PingUtils();
        ping.setAddress(ia);
        return ping;
    }

    public PingUtils setTimeOutMillis(int timeOutMillis) {
        if (timeOutMillis < 0) {
            throw new IllegalArgumentException("Times cannot be less than 0");
        } else {
            this.timeOutMillis = timeOutMillis;
            return this;
        }
    }

    public PingUtils setDelayMillis(int delayBetweenScansMillis) {
        if (delayBetweenScansMillis < 0) {
            throw new IllegalArgumentException("Delay cannot be less than 0");
        } else {
            this.delayBetweenScansMillis = delayBetweenScansMillis;
            return this;
        }
    }

    public PingUtils setTimes(int noTimes) {
        if (noTimes < 0) {
            throw new IllegalArgumentException("Times cannot be less than 0");
        } else {
            this.times = noTimes;
            return this;
        }
    }

    private void setAddress(InetAddress address) {
        this.address = address;
    }

    public void cancel() {
        this.cancelled = true;
    }
}
