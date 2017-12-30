package com.schsource.users.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.schsource.users.service.UsersService;
import com.schsource.users.vo.Users;
import com.schsource.utils.PageBean;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UsersAction extends ActionSupport implements ModelDriven<Users> {

    private Users users = new Users();
    private UsersService usersService;

    public UsersService getUsersService() {
        return usersService;
    }

    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    private int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
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

    /**
     * 用户登录功能
     * @return
     */
    public String login() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession hsession = request.getSession();

        if (usersService.login(users)) {
            hsession.setAttribute("uname", users.getUname());
            hsession.setAttribute("ulimit", users.getUlimit());
            return SUCCESS;
        } else {
            return INPUT;
        }
    }

    /**
     * 根据id查询用户信息
     * @return
     */
    public String getUsersById() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        int usersId = Integer.parseInt(request.getParameter("usersId"));
        usersService.findUsersById(usersId);
        session.setAttribute("usersId", users.getUsersId());
        session.setAttribute("uPwd", users.getUpwd());
        session.setAttribute("uName", users.getUname());
        session.setAttribute("uGender", users.getUgender());
        session.setAttribute("uLimit", users.getUlimit());
        return SUCCESS;
    }

    /**
     * 修改用户信息
     * @return
     */
    public String updateUsers() {
        usersService.updateUsers(users);
        return SUCCESS;
    }

    /**
     * 查看全部用户信息
     * @return
     */
    public String listAllUsers() {
        PageBean<Users> pageBean = usersService.findUsersByPage(page);
        ActionContext.getContext().getValueStack().set("pageBean", pageBean);
        return SUCCESS;
    }
}
