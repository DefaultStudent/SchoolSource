package com.schsource.school.vo;

import java.util.Objects;

public class School {
    private int schid;
    private String schname;
    private String schpic;
    private String pname;
    private String tname;
    private String schaddress;
    private String teacher;
    private String tel;

    public int getSchid() {
        return schid;
    }

    public void setSchid(int schid) {
        this.schid = schid;
    }

    public String getSchname() {
        return schname;
    }

    public void setSchname(String schname) {
        this.schname = schname;
    }

    public String getSchpic() {
        return schpic;
    }

    public void setSchpic(String schpic) {
        this.schpic = schpic;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSchaddress() {
        return schaddress;
    }

    public void setSchaddress(String schaddress) {
        this.schaddress = schaddress;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return schid == school.schid &&
                Objects.equals(schname, school.schname) &&
                Objects.equals(schpic, school.schpic) &&
                Objects.equals(pname, school.pname) &&
                Objects.equals(tname, school.tname) &&
                Objects.equals(schaddress, school.schaddress) &&
                Objects.equals(teacher, school.teacher) &&
                Objects.equals(tel, school.tel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(schid, schname, schpic, pname, tname, schaddress, teacher, tel);
    }
}
