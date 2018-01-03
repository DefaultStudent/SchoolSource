package com.schsource.professional.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.schsource.professional.service.ProfessionalService;
import com.schsource.professional.vo.Professional;
import com.schsource.utils.PageBean;

/**
 * @author vodka
 * @date 2018-1-3
 * @version 1.0
 */
public class ProfessionalAction extends ActionSupport implements ModelDriven<Professional> {
    private Professional professional = new Professional();
    private ProfessionalService professionalService;
    private int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }

    public ProfessionalService getProfessionalService() {
        return professionalService;
    }

    public void setProfessionalService(ProfessionalService professionalService) {
        this.professionalService = professionalService;
    }

    @Override
    public Professional getModel() {
        return professional;
    }

    /**
     * 查询全部专业信息
     * @return
     */
    public String getAllProfessional() {
        PageBean<Professional> pageBean = professionalService.findProfessionalByPage(page);
        ActionContext.getContext().getValueStack().set("PageBean", pageBean);
        return SUCCESS;
    }

    public String saveProfessional() {
        return SUCCESS;
    }
}
