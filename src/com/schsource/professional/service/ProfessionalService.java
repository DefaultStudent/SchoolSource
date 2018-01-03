package com.schsource.professional.service;

import com.schsource.professional.dao.ProfessionalDao;
import com.schsource.professional.vo.Professional;
import com.schsource.utils.PageBean;

import java.util.List;

public class ProfessionalService {
    private ProfessionalDao professionalDao;

    public ProfessionalDao getProfessionalDao() {
        return professionalDao;
    }

    public void setProfessionalDao(ProfessionalDao professionalDao) {
        this.professionalDao = professionalDao;
    }

    /**
     * 分页显示专业类型数据
     * @param page
     * @return
     */
    public PageBean<Professional> findProfessionalByPage(int page) {
        PageBean<Professional> pageBean = new PageBean<Professional>();
        pageBean.setPage(page);

        int limit = 5;
        pageBean.setLimit(limit);

        int totalCount = professionalDao.getProfessionalPageCount();
        pageBean.setTotalCount(totalCount);

        int totalPage = totalCount % limit == 0 ? totalCount/limit : totalCount/limit+1;
        pageBean.setTotalPage(totalPage);

        // 每页显示数据的集合
        int begin = (page - 1) * limit;
        List<Professional> list = professionalDao.getProfessionalPaeById(begin, limit);
        pageBean.setList(list);

        return pageBean;
    }

    /**
     * 添加专业信息
     * @param professional
     */
    public void saveProfessional(Professional professional) {
        professionalDao.saveProfessional(professional);
    }

    /**
     * 删除专业信息
     * @param professional
     */
    public void deleteProfessional(Professional professional) {
        professionalDao.deleteProfessional(professional);
    }

    /**
     * 修改专业信息
     * @param professional
     */
    public void updateProfessional(Professional professional) {
        professionalDao.updateProfressional(professional);
    }

    /**
     * 根据id查询专业信息
     * @param pid
     * @return
     */
    public Professional getProfessionalById(int pid) {
        return professionalDao.getProfessionalById(pid);
    }

    /**
     * 根据name查询专业信息
     * @param pname
     * @return
     */
    public Professional getProfessionalByName(String pname) {
        return professionalDao.getProfessionalByName(pname);
    }
}
