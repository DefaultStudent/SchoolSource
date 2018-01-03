package com.schsource.professional.dao;

import com.schsource.professional.vo.Professional;
import com.schsource.utils.PageHibernateCallBack;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author vodka
 * @date 2018-1-3
 * @version 1.0
 */


public class ProfessionalDao extends HibernateDaoSupport{

    /**
     * 查询专业信息总数
     * @return
     */
    public int getProfessionalPageCount() {
        String hql = "select count(*) from Professional";
        List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);

        if (list != null && list.size() > 0) {
            return list.get(0).intValue();
        }
        return 0;
    }

    /**
     * 查询全部专业信息
     * @param begin
     * @param limit
     * @return
     */
    public List<Professional> getProfessionalPaeById(int begin, int limit) {
        String hql = "from Professional";
        List<Professional> list = this.getHibernateTemplate().execute((HibernateCallback<List<Professional>>)
                new PageHibernateCallBack(hql, new Object[]{}, begin, limit));

        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     * 添加专业信息
     * @param professional
     */
    @Transactional(readOnly = false)
    public void saveProfessional(Professional professional) {
        this.getHibernateTemplate().save(professional);
    }

    /**
     * 删除专业信息
     * @param professional
     */
    @Transactional(readOnly = false)
    public void deleteProfessional(Professional professional) {
        this.getHibernateTemplate().delete(professional);
    }

    /**
     * 修改院校信息
     * @param professional
     */
    @Transactional(readOnly = false)
    public void updateProfressional(Professional professional) {
        this.getHibernateTemplate().saveOrUpdate(professional);
    }

    /**
     * 根据id获取专业信息
     * @param pid
     * @return
     */
    public Professional getProfessionalById(int pid) {
        return this.getHibernateTemplate().get(Professional.class, pid);
    }

    /**
     * 根据name获取专业信息
     * @param pname
     * @return
     */
    public Professional getProfessionalByName(String pname) {
        String hql = "from Professional where pname = ?";
        List<Professional> list = (List<Professional>) this.getHibernateTemplate().find(hql, pname);

        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
