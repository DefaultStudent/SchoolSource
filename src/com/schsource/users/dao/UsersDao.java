package com.schsource.users.dao;

import com.schsource.users.vo.Users;
import com.schsource.utils.PageHibernateCallBack;
import org.springframework.orm.hibernate4.HibernateCallback;
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

    /**
     * 查询用户信息总数
     * @return
     */
    public int getUsersPageCount() {
        String hql = "select count(*) from School";
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
}
