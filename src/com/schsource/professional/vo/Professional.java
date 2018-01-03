package com.schsource.professional.vo;

import java.util.Objects;

public class Professional {
    private int pid;
    private String pname;
    private String pdes;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdes() {
        return pdes;
    }

    public void setPdes(String pdes) {
        this.pdes = pdes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professional that = (Professional) o;
        return pid == that.pid &&
                Objects.equals(pname, that.pname) &&
                Objects.equals(pdes, that.pdes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pid, pname, pdes);
    }
}
