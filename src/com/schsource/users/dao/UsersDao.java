package com.schsource.users.dao;

import com.schsource.users.vo.Users;
import com.schsource.utils.PageHibernateCallBack;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author vodka
 * @version 1.0 2017-12-26
 */

public class UsersDao extends HibernateDaoSupport {

    /**
     * 登录
     * @param users
     * @return
     */
    public boolean login(Users users) {
        String hql = "from Users where usersId = ? and upwd = ?";
        List<Users> list = (List<Users>)this.getHibernateTemplate().find(hql, users.getUsersId(),
                users.getUpwd());
        for (Users users1 : list) {
            users.setUname(users1.getUname());
            users.setUlimit(users1.getUlimit());
        }

        if (list.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 用户注册/添加
     * @param users
     */
    @Transactional(readOnly = false)
    public void register(Users users) {
        this.getHibernateTemplate().save(users);
    }

    /**
     * 删除用户
     * @param users
     */
    @Transactional(readOnly = false)
    public void deleteUsers(Users users) {
        this.getHibernateTemplate().delete(users);
    }

    /**
     * 修改用户信息
     * @param users
     */
    @Transactional(readOnly = false)
    public void updateUsers(Users users) {
        this.getHibernateTemplate().saveOrUpdate(users);
    }

    /**
     * 根据usersId查询用户信息
     * @param usersid
     * @return
     */
    public Users findUsersById(int usersid) {
        return this.getHibernateTemplate().get(Users.class, usersid);
    }

    /**
     * 查询用户信息总数
     * @return
     */
    public int getUsersPageCount() {
        String hql = "select count(*) from Users";
        List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
        if (list != null && list.size() > 0) {
            return list.get(0).intValue();
        }
        return 0;
    }

    /**
     * 查询当前页面用户信息的集合
     * @param begin
     * @param limit
     * @return
     */
    public List<Users> getUsersPageById(int begin, int limit) {
        String hql = "from Users";
        List<Users> list = this.getHibernateTemplate().execute((HibernateCallback<List<Users>>)
                new PageHibernateCallBack(hql, new Object[]{}, begin, limit));
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     * 根据uname查询用户信息
     * @param uname
     * @return
     */
    public Users getUsersByName(String uname) {
        String hql = "from Users where uname = ?";
        List<Users> list = (List<Users>) this.getHibernateTemplate().find(hql, uname);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
