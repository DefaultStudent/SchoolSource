package com.schsource.type.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.schsource.type.service.TypeService;
import com.schsource.type.vo.Type;
import com.schsource.utils.PageBean;

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
        return null;
    }

    /**
     * 查看全部院校类型信息
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
}
