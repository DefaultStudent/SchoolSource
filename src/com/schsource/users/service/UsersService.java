package com.schsource.users.service;

import com.schsource.users.dao.UsersDao;
import com.schsource.users.vo.Users;

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
}
