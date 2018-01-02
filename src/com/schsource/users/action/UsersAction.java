package com.schsource.users.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.schsource.users.service.UsersService;
import com.schsource.users.vo.Users;
import com.schsource.utils.PageBean;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author vodka
 * @date 2017-12-30
 * @version 1.0
 */

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
        Users users = usersService.findUsersById(usersId);
        session.setAttribute("usersId", users.getUsersId());
        session.setAttribute("uPwd", users.getUpwd());
        session.setAttribute("uName", users.getUname());
        session.setAttribute("uGender", users.getUgender());
        session.setAttribute("ulimit", users.getUlimit());
        return SUCCESS;
    }

    public String getUsersByName() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        try {
            String uname = request.getParameter("uname");
            Users users = usersService.findUsersByName(uname);
            session.setAttribute("usersId", users.getUsersId());
            session.setAttribute("uPwd", users.getUpwd());
            session.setAttribute("uName", users.getUname());
            session.setAttribute("uGender", users.getUgender());
            session.setAttribute("ulimit", users.getUlimit());
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
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
        ActionContext.getContext().getValueStack().set("PageBean", pageBean);
        return SUCCESS;
    }

    /**
     * 验证用户是否已经存在
     * @return
     * @throws Exception
     */
    public String executUsers() throws Exception{
        Users user = usersService.findUsersById(users.getUsersId());
        HttpServletResponse respones= ServletActionContext.getResponse();
        respones.setContentType("text/html;charset=UTF-8");
        if (user != null) {
            respones.getWriter().println("<font color='red'>用户名已存在</font>");
            return INPUT;
        }
        return SUCCESS;
    }
}
