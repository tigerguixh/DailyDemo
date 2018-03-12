package tiger.com.lp.dailydemo.designpatterns.chain;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/9 0009
 * @description
 */

public class Request implements Parcelable {
    private String name;
    private String reason;
    private int days;
    private String groupLeaderInfo;
    private String managerInfo;
    private String departmentHeaderInfo;
    private String customInfo;

    public Request(Builder builder) {
        this.name = builder.name;
        this.reason = builder.reason;
        this.days = builder.days;
        this.groupLeaderInfo = builder.groupLeaderInfo;
        this.managerInfo = builder.managerInfo;
        this.departmentHeaderInfo = builder.departmentHeaderInfo;
        this.customInfo = builder.customInfo;
    }

    public static class Builder{
        private String name;
        private String reason;
        private int days;
        private String groupLeaderInfo;
        private String managerInfo;
        private String departmentHeaderInfo;
        private String customInfo;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDays(int days) {
            this.days = days;
            return this;
        }

        public Builder groupLeaderInfo(String groupLeaderInfo) {
            this.groupLeaderInfo = groupLeaderInfo;
            return this;
        }

        public Builder setManagerInfo(String managerInfo) {
            this.managerInfo = managerInfo;
            return this;
        }

        public Builder setDepartmentHeaderInfo(String departmentHeaderInfo) {
            this.departmentHeaderInfo = departmentHeaderInfo;
            return this;
        }

        public Builder setCustomInfo(String customInfo) {
            this.customInfo = customInfo;
            return this;
        }

        public Request builder() {
            return new Request(this);
        }

        public Builder newRequest(Request request) {
            this.name = request.name;
            this.reason = request.reason;
            this.days = request.days;
            if(!isEmpty(request.getCustomInfo())) {
                this.customInfo = request.getCustomInfo();
            }

            if(!isEmpty(request.getGroupLeaderInfo())) {
                this.groupLeaderInfo = request.getGroupLeaderInfo();
            }

            if(!isEmpty(request.getDepartmentHeaderInfo())) {
                this.departmentHeaderInfo = request.getDepartmentHeaderInfo();
            }

            if(!isEmpty(request.getManagerInfo())) {
                this.managerInfo = request.getManagerInfo();
            }
            return this;
        }

        private boolean isEmpty(String value) {
            return value == null || value.equals("");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getGroupLeaderInfo() {
        return groupLeaderInfo;
    }

    public void setGroupLeaderInfo(String groupLeaderInfo) {
        this.groupLeaderInfo = groupLeaderInfo;
    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public void setManagerInfo(String managerInfo) {
        this.managerInfo = managerInfo;
    }

    public String getDepartmentHeaderInfo() {
        return departmentHeaderInfo;
    }

    public void setDepartmentHeaderInfo(String departmentHeaderInfo) {
        this.departmentHeaderInfo = departmentHeaderInfo;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                ", days=" + days +
                ", groupLeaderInfo='" + groupLeaderInfo + '\'' +
                ", managerInfo='" + managerInfo + '\'' +
                ", departmentHeaderInfo='" + departmentHeaderInfo + '\'' +
                ", customInfo='" + customInfo + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.reason);
        dest.writeInt(this.days);
        dest.writeString(this.groupLeaderInfo);
        dest.writeString(this.managerInfo);
        dest.writeString(this.departmentHeaderInfo);
        dest.writeString(this.customInfo);
    }

    protected Request(Parcel in) {
        this.name = in.readString();
        this.reason = in.readString();
        this.days = in.readInt();
        this.groupLeaderInfo = in.readString();
        this.managerInfo = in.readString();
        this.departmentHeaderInfo = in.readString();
        this.customInfo = in.readString();
    }

    public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator<Request>() {
        @Override
        public Request createFromParcel(Parcel source) {
            return new Request(source);
        }

        @Override
        public Request[] newArray(int size) {
            return new Request[size];
        }
    };
}
