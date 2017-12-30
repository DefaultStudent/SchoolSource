package com.schsource.users.service;

import com.schsource.users.dao.UsersDao;
import com.schsource.users.vo.Users;
import com.schsource.utils.PageBean;

import java.util.List;

/**
 * @author vodka
 * @version 1.0 2017-12-29
 */

public class UsersService {
    private UsersDao usersDao;

    public UsersDao getUsersDao() {
        return usersDao;
    }

    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    /**
     * 用户登录功能
     * @param users
     * @return
     */
    public Users login(Users users) {
        return usersDao.login(users);
    }

    /**
     * 用户注册/添加功能
     * @param users
     */
    public void register(Users users) {
        usersDao.register(users);
    }

    /**
     * 用户信息删除
     * @param users
     */
    public void deleteUsers(Users users) {
        usersDao.deleteUsers(users);
    }

    /**
     * 用户信息修改
     * @param users
     */
    public void updateUsers(Users users) {
        usersDao.updateUsers(users);
    }

    /**
     * 根据Id查询用户信息
     * @param usersId
     * @return
     */
    public Users findUsersById(int usersId) {
        return usersDao.findUsersById(usersId);
    }

    /**
     * 分页显示全部用户信息
     * @param page
     * @return
     */
    public PageBean<Users> findUsersByPage(int page) {
        PageBean<Users> pageBean = new PageBean<Users>();
        pageBean.setPage(page);
        int limit = 20;
        pageBean.setLimit(limit);

        int totalCount = usersDao.getUsersPageCount();
        pageBean.setTotalCount(totalCount);

        // 每页显示数据的集合
        int begin = (page - 1) * limit;
        List<Users> list = usersDao.getUsersPageById(begin, limit);
        pageBean.setList(list);

        return pageBean;
    }
}
