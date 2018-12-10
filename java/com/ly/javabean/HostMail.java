package com.ly.javabean;

import javax.persistence.*;

/**
 * @author liyue
 * @date 2018/11/27 13:50
 */
@Entity
@Table(name = "host_mail", schema = "bts")
public class HostMail {
    private int id;
    private String address;
    private String password;
    private String belonger;
    private String host;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 45)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "belonger", nullable = true, length = 50)
    public String getBelonger() {
        return belonger;
    }

    public void setBelonger(String belonger) {
        this.belonger = belonger;
    }

    @Basic
    @Column(name = "host", nullable = true, length = 45)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HostMail hostMail = (HostMail) o;

        if (id != hostMail.id) return false;
        if (address != null ? !address.equals(hostMail.address) : hostMail.address != null) return false;
        if (password != null ? !password.equals(hostMail.password) : hostMail.password != null) return false;
        if (belonger != null ? !belonger.equals(hostMail.belonger) : hostMail.belonger != null) return false;
        if (host != null ? !host.equals(hostMail.host) : hostMail.host != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (belonger != null ? belonger.hashCode() : 0);
        result = 31 * result + (host != null ? host.hashCode() : 0);
        return result;
    }
}
