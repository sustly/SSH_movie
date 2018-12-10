package com.ly.javabean;

import javax.persistence.*;

/**
 * @author liyue
 * @date 2018/11/27 13:50
 */
@Entity
@Table(name = "film_bts_new", schema = "bts")
public class FilmBtsNew {
    private int id;
    private String address;
    private String name;
    private String nameOthers;
    private String year;
    private String country;
    private String filmClass;
    private String lang;
    private String seasonNum;
    private String setNum;
    private String dateRelease;
    private String doubanPingfen;
    private String doubanLink;
    private String imdb;
    private String length;
    private String director;
    private String actor;
    private String timeSettle;
    private String awards;
    private String imgSrc;
    private String zimuDlAddress;
    private String errorCase;
    private String timeUpdate;
    private String introduction;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 12)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    @Column(name = "name_others", nullable = true, length = -1)
    public String getNameOthers() {
        return nameOthers;
    }

    public void setNameOthers(String nameOthers) {
        this.nameOthers = nameOthers;
    }

    @Basic
    @Column(name = "year", nullable = true, length = -1)
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Basic
    @Column(name = "country", nullable = true, length = -1)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "film_class", nullable = true, length = -1)
    public String getFilmClass() {
        return filmClass;
    }

    public void setFilmClass(String filmClass) {
        this.filmClass = filmClass;
    }

    @Basic
    @Column(name = "lang", nullable = true, length = -1)
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Basic
    @Column(name = "season_num", nullable = true, length = -1)
    public String getSeasonNum() {
        return seasonNum;
    }

    public void setSeasonNum(String seasonNum) {
        this.seasonNum = seasonNum;
    }

    @Basic
    @Column(name = "set_num", nullable = true, length = -1)
    public String getSetNum() {
        return setNum;
    }

    public void setSetNum(String setNum) {
        this.setNum = setNum;
    }

    @Basic
    @Column(name = "date_release", nullable = true, length = -1)
    public String getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }

    @Basic
    @Column(name = "douban_pingfen", nullable = true, length = -1)
    public String getDoubanPingfen() {
        return doubanPingfen;
    }

    public void setDoubanPingfen(String doubanPingfen) {
        this.doubanPingfen = doubanPingfen;
    }

    @Basic
    @Column(name = "douban_link", nullable = true, length = -1)
    public String getDoubanLink() {
        return doubanLink;
    }

    public void setDoubanLink(String doubanLink) {
        this.doubanLink = doubanLink;
    }

    @Basic
    @Column(name = "IMDB", nullable = true, length = -1)
    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    @Basic
    @Column(name = "length", nullable = true, length = -1)
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Basic
    @Column(name = "director", nullable = true, length = -1)
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Basic
    @Column(name = "actor", nullable = true, length = -1)
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Basic
    @Column(name = "time_settle", nullable = true, length = -1)
    public String getTimeSettle() {
        return timeSettle;
    }

    public void setTimeSettle(String timeSettle) {
        this.timeSettle = timeSettle;
    }

    @Basic
    @Column(name = "awards", nullable = true, length = -1)
    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    @Basic
    @Column(name = "img_src", nullable = true, length = -1)
    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    @Basic
    @Column(name = "zimu_dl_address", nullable = true, length = -1)
    public String getZimuDlAddress() {
        return zimuDlAddress;
    }

    public void setZimuDlAddress(String zimuDlAddress) {
        this.zimuDlAddress = zimuDlAddress;
    }

    @Basic
    @Column(name = "error_case", nullable = true, length = -1)
    public String getErrorCase() {
        return errorCase;
    }

    public void setErrorCase(String errorCase) {
        this.errorCase = errorCase;
    }

    @Basic
    @Column(name = "time_update", nullable = true, length = 100)
    public String getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(String timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    @Basic
    @Column(name = "introduction", nullable = true, length = -1)
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nameOthers != null ? nameOthers.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (filmClass != null ? filmClass.hashCode() : 0);
        result = 31 * result + (lang != null ? lang.hashCode() : 0);
        result = 31 * result + (seasonNum != null ? seasonNum.hashCode() : 0);
        result = 31 * result + (setNum != null ? setNum.hashCode() : 0);
        result = 31 * result + (dateRelease != null ? dateRelease.hashCode() : 0);
        result = 31 * result + (doubanPingfen != null ? doubanPingfen.hashCode() : 0);
        result = 31 * result + (doubanLink != null ? doubanLink.hashCode() : 0);
        result = 31 * result + (imdb != null ? imdb.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (actor != null ? actor.hashCode() : 0);
        result = 31 * result + (timeSettle != null ? timeSettle.hashCode() : 0);
        result = 31 * result + (awards != null ? awards.hashCode() : 0);
        result = 31 * result + (imgSrc != null ? imgSrc.hashCode() : 0);
        result = 31 * result + (zimuDlAddress != null ? zimuDlAddress.hashCode() : 0);
        result = 31 * result + (errorCase != null ? errorCase.hashCode() : 0);
        result = 31 * result + (timeUpdate != null ? timeUpdate.hashCode() : 0);
        result = 31 * result + (introduction != null ? introduction.hashCode() : 0);
        return result;
    }
}
