package com.schsource.school.vo;

import com.schsource.type.vo.Type;

import java.util.Objects;

public class School {
    private int schId;
    private String schName;
    private String schPic;
    private int pid;
    private int tid;
    private String schAddress;
    private String teacher;
    private String tel;

    public int getSchId() {
        return schId;
    }

    public void setSchId(int schId) {
        this.schId = schId;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getSchPic() {
        return schPic;
    }

    public void setSchPic(String schPic) {
        this.schPic = schPic;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getSchAddress() {
        return schAddress;
    }

    public void setSchAddress(String schAddress) {
        this.schAddress = schAddress;
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        School school = (School) o;
        return schId == school.schId &&
                pid == school.pid &&
                tid == school.tid &&
                Objects.equals(schName, school.schName) &&
                Objects.equals(schAddress, school.schAddress) &&
                Objects.equals(teacher, school.teacher) &&
                Objects.equals(tel, school.tel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(schId, schName, pid, tid, schAddress, teacher, tel);
    }
}
