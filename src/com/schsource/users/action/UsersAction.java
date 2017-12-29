package com.schsource.users.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.schsource.users.service.UsersService;
import com.schsource.users.vo.Users;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UsersAction extends ActionSupport implements ModelDriven<Users> {
    HttpServletRequest request = ServletActionContext.getRequest();
    HttpSession session = request.getSession();

    private Users users = new Users();
    private UsersService usersService;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public UsersService getUsersService() {
        return usersService;
    }

    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    @Override
    public Users getModel() {
        return users;
    }

    /**
     * 用户注册/添加
     * @return
     */
    public String saveUsers() {
        usersService.register(users);
        return SUCCESS;
    }

    /**
     * 用户删除
     * @return
     */
    public String removeUsers() {
        usersService.deleteUsers(users);
        return SUCCESS;
    }
}
