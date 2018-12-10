package com.ly.javabean;

import javax.persistence.*;

/**
 * @author liyue
 * @date 2018/11/27 13:50
 */
@Entity
@Table(name = "film_douban_img", schema = "bts")
public class FilmDoubanImg {
    private int id;
    private String name;
    private String address;
    private String doubanLink;
    private String imgSrc;
    private String timeUpdate;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "douban_link", nullable = true, length = 200)
    public String getDoubanLink() {
        return doubanLink;
    }

    public void setDoubanLink(String doubanLink) {
        this.doubanLink = doubanLink;
    }

    @Basic
    @Column(name = "img_src", nullable = true, length = 200)
    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    @Basic
    @Column(name = "time_update", nullable = true, length = 100)
    public String getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(String timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilmDoubanImg that = (FilmDoubanImg) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (doubanLink != null ? !doubanLink.equals(that.doubanLink) : that.doubanLink != null) return false;
        if (imgSrc != null ? !imgSrc.equals(that.imgSrc) : that.imgSrc != null) return false;
        if (timeUpdate != null ? !timeUpdate.equals(that.timeUpdate) : that.timeUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (doubanLink != null ? doubanLink.hashCode() : 0);
        result = 31 * result + (imgSrc != null ? imgSrc.hashCode() : 0);
        result = 31 * result + (timeUpdate != null ? timeUpdate.hashCode() : 0);
        return result;
    }
}
