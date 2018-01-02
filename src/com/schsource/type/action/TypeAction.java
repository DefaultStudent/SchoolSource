package com.schsource.type.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.schsource.type.service.TypeService;
import com.schsource.type.vo.Type;
import com.schsource.utils.PageBean;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class TypeAction extends ActionSupport implements ModelDriven<Type>{
    private Type type = new Type();
    private TypeService typeService;
    private int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public TypeService getTypeService() {
        return typeService;
    }

    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }

    @Override
    public Type getModel() {
        return type;
    }

    /**
     * 分页查看全部院校类型信息
     * @return
     */
    public String getAllType() {
        PageBean<Type> pageBean = typeService.findTypeByPage(page);
        ActionContext.getContext().getValueStack().set("PageBean", pageBean);
        return SUCCESS;
    }

    /**
     * 添加院校类型信息
     * @return
     */
    public String saveType() {
        typeService.saveType(type);
        return SUCCESS;
    }

    /**
     * 删除院校类型
     * @return
     */
    public String removeType() {
        typeService.removeType(type);
        return SUCCESS;
    }

    /**
     * 根据Id获取院校类型信息
     * @return
     */
    public String getTypeById() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        int tid = Integer.parseInt(request.getParameter("tid"));
        Type type = typeService.getTypeById(tid);
        session.setAttribute("tid", type.getTid());
        session.setAttribute("tname", type.getTname());
        return SUCCESS;
    }

    /**
     * 根据tname查询院校类型信息
     * @return
     */
    public String getTypeByName() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String tname = (String) request.getAttribute("tname");
        try {
            Type type = typeService.getTypeByName(tname);
            session.setAttribute("tid", type.getTid());
            session.setAttribute("tname", type.getTname());
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return INPUT;
        }
    }

    /**
     * 修改院校类型信息
     * @return
     */
    public String updateType() {
        typeService.updateType(type);
        return SUCCESS;
    }
}
