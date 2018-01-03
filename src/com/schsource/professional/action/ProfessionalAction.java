package com.schsource.professional.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.schsource.professional.service.ProfessionalService;
import com.schsource.professional.vo.Professional;
import com.schsource.utils.PageBean;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    /**
     * 添加专业信息
     * @return
     */
    public String saveProfessional() {
        try {
            professionalService.saveProfessional(professional);
        } catch (Exception e) {
            e.printStackTrace();
            return INPUT;
        }
        return SUCCESS;
    }

    /**
     * 删除专业信息
     * @return
     */
    public String deleteProfessional() {
        professionalService.deleteProfessional(professional);
        return SUCCESS;
    }

    /**
     * 修改专业信息
     * @return
     */
    public String updateProfessional() {
        try {
            professionalService.updateProfessional(professional);
        } catch (Exception e) {
            e.printStackTrace();
            return INPUT;
        }
        return SUCCESS;
    }

    /**
     * 根据Id查找专业信息
     * @return
     */
    public String getProfessionalById() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        int pid = Integer.parseInt(request.getParameter("pid"));
        try {
            Professional professional = professionalService.getProfessionalById(pid);
            session.setAttribute("pid", professional.getPid());
            session.setAttribute("pname", professional.getPname());
            session.setAttribute("pdes", professional.getPdes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    /**
     * 根据name查找专业信息
     * @return
     */
    public String getProfessionalByName() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String pname = request.getParameter("pname");
        try {
            Professional professional = professionalService.getProfessionalByName(pname);
            session.setAttribute("pid", professional.getPid());
            session.setAttribute("pname", professional.getPname());
            session.setAttribute("pdes", professional.getPdes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    /**
     * 验证专业
     * @return
     */
    public String executeProfessional() {
        HttpServletRequest request = ServletActionContext.getRequest();
        int pid = Integer.parseInt(request.getParameter("pid"));
        if (professionalService.getProfessionalById(pid) != null) {
            return INPUT;
        } else {
            professionalService.saveProfessional(professional);
            return SUCCESS;
        }
    }
}
