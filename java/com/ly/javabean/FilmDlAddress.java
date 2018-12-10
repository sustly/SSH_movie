package com.ly.javabean;

import javax.persistence.*;

/**
 * @author liyue
 * @date 2018/11/27 13:50
 */
@Entity
@Table(name = "film_dl_address", schema = "bts")
public class FilmDlAddress {
    private int id;
    private String address;
    private String name;
    private String definition;
    private String fileName;
    private String dlAddress;
    private String timeUpdate;
    private String filmName;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "definition", nullable = true, length = 100)
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Basic
    @Column(name = "file_name", nullable = true, length = -1)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "dl_address", nullable = true, length = -1)
    public String getDlAddress() {
        return dlAddress;
    }

    public void setDlAddress(String dlAddress) {
        this.dlAddress = dlAddress;
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
    @Column(name = "film_name", nullable = true, length = 255)
    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilmDlAddress that = (FilmDlAddress) o;

        if (id != that.id) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (definition != null ? !definition.equals(that.definition) : that.definition != null) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        if (dlAddress != null ? !dlAddress.equals(that.dlAddress) : that.dlAddress != null) return false;
        if (timeUpdate != null ? !timeUpdate.equals(that.timeUpdate) : that.timeUpdate != null) {
            return false;
        }
        if (filmName != null ? !filmName.equals(that.filmName) : that.filmName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (definition != null ? definition.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (dlAddress != null ? dlAddress.hashCode() : 0);
        result = 31 * result + (timeUpdate != null ? timeUpdate.hashCode() : 0);
        result = 31 * result + (filmName != null ? filmName.hashCode() : 0);
        return result;
    }
}
