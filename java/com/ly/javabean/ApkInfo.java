package com.ly.javabean;

import javax.persistence.*;

/**
 * @author liyue
 * @date 2018/11/27 13:50
 */
@Entity
@Table(name = "apk_info", schema = "bts")
public class ApkInfo {
    private int id;
    private String versionName;
    private String versionCode;
    private String updateInfo;
    private String dlAddress;

    @Override
    public String toString() {
        return "ApkInfo{" +
                "id=" + id +
                ", versionName='" + versionName + '\'' +
                ", versionCode='" + versionCode + '\'' +
                ", updateInfo='" + updateInfo + '\'' +
                ", dlAddress='" + dlAddress + '\'' +
                '}';
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "version_name", nullable = true, length = 50)
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    @Basic
    @Column(name = "version_code", nullable = true, length = 50)
    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    @Basic
    @Column(name = "update_info", nullable = true, length = 2000)
    public String getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
    }

    @Basic
    @Column(name = "dl_address", nullable = true, length = 200)
    public String getDlAddress() {
        return dlAddress;
    }

    public void setDlAddress(String dlAddress) {
        this.dlAddress = dlAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApkInfo apkInfo = (ApkInfo) o;

        if (id != apkInfo.id) return false;
        if (versionName != null ? !versionName.equals(apkInfo.versionName) : apkInfo.versionName != null) return false;
        if (versionCode != null ? !versionCode.equals(apkInfo.versionCode) : apkInfo.versionCode != null) return false;
        if (updateInfo != null ? !updateInfo.equals(apkInfo.updateInfo) : apkInfo.updateInfo != null) return false;
        if (dlAddress != null ? !dlAddress.equals(apkInfo.dlAddress) : apkInfo.dlAddress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (versionName != null ? versionName.hashCode() : 0);
        result = 31 * result + (versionCode != null ? versionCode.hashCode() : 0);
        result = 31 * result + (updateInfo != null ? updateInfo.hashCode() : 0);
        result = 31 * result + (dlAddress != null ? dlAddress.hashCode() : 0);
        return result;
    }
}
