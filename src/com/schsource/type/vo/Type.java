package com.schsource.type.vo;

import com.schsource.school.vo.School;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author vodka
 * @date 2017-12-30
 * @version 1.0
 */

public class Type {
    private int tid;
    private String tname;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return tid == type.tid &&
                Objects.equals(tname, type.tname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid, tname);
    }
}
