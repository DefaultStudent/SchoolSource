package com.schsource.users.dao;

import com.schsource.users.vo.Users;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author vodka
 * @version 1.0 2017-12-26
 */

public class UsersDao extends HibernateDaoSupport {

    /**
     * 登录功能
     * @param users
     * @return
     */
    public Users login(Users users) {
        String hql = "from Users where usersId = ? and upwd = ?";
        List<Users> list = (List<Users>)this.getHibernateTemplate().find(hql, users.getUsersId(), users.getUpwd());
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    /**
     * 用户注册/添加
     * @param users
     */
    public void register(Users users) {
        this.getHibernateTemplate().save(users);
    }

    /**
     * 删除用户
     * @param users
     */
    public void deleteUsers(Users users) {
        this.getHibernateTemplate().delete(users);
    }

    /**
     * 修改用户信息
     * @param users
     */
    public void updateUsers(Users users) {
        String hql = "update Users set upwd = ?, uname = ?, ugender = ?, ulimit = ? where usersId = ?";
        Object[] objects = {users.getUpwd(), users.getUname(), users.getUgender(),
                users.getUlimit(), users.getUsersId()};
        this.getHibernateTemplate().saveOrUpdate(hql, objects);
    }

    /**
     * 根据usersId查询用户信息
     * @param usersid
     * @return
     */
    public Users findUsersById(int usersid) {
        return this.getHibernateTemplate().get(Users.class, usersid);
    }
}
