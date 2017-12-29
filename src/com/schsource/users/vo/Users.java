package com.schsource.users.vo;

import java.util.Objects;

/**
 * @author vodka
 * @version 1.0 2017-12-26
 */

public class Users {
    private int usersId;
    private String upwd;
    private String uname;
    private String ugender;
    private int ulimit;

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public int getUlimit() {
        return ulimit;
    }

    public void setUlimit(int ulimit) {
        this.ulimit = ulimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Users users = (Users) o;
        return usersId == users.usersId &&
                ulimit == users.ulimit &&
                Objects.equals(upwd, users.upwd) &&
                Objects.equals(uname, users.uname) &&
                Objects.equals(ugender, users.ugender);
    }

    @Override
    public int hashCode() {

        return Objects.hash(usersId, upwd, uname, ugender, ulimit);
    }
}
