package com.ly.javabean;

/**
 * @author liyue
 * @date 2018/11/27 10:32
 */
public class Student {
    private String uuid;
    private Integer schoolid;
    private String name;
    private String className;
    private String gender;

    @Override
    public String toString() {
        return "Student{" +
                "uuid='" + uuid + '\'' +
                ", schoolid=" + schoolid +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
