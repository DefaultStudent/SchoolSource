package com.schsource.school.dao;

import com.schsource.school.vo.School;
import com.schsource.utils.PageHibernateCallBack;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author vodka
 * @version 1.0 2017-12-26
 */

public class SchoolDao extends HibernateDaoSupport{

    /**
     * 添加学校信息
     * @param school
     */
    @Transactional(readOnly = false)
    public void saveSchool(School school) {
        this.getHibernateTemplate().save(school);
    }

    /**
     * 根据Id查询院校信息
     * @param schId
     * @return
     */
    public School getSchoolById(int schId) {
        return this.getHibernateTemplate().get(School.class, schId);
    }

    /**
     * 更新学校信息
     * @param school
     */
    public void updateSchool(School school) {
        this.getHibernateTemplate().saveOrUpdate(school);
    }

    /**
     * 根据Name查询学校信息
     * @param schName
     * @return
     */
    public School getSchoolByName(String schName) {
        return this.getHibernateTemplate().get(School.class, schName);
    }

    /**
     * 删除学校信息
     * @param school
     */
    @Transactional(readOnly = false)
    public void deleteSchool(School school) {
        this.getHibernateTemplate().delete(school);
    }

    /**
     * 统计某一类型院校的数量
     * @param tid
     * @return
     */
    public School countByTid(int tid) {
        String hql = "select count(*) from School where tid = ?";
        List<School> list = (List<School>) this.getHibernateTemplate().find(hql, tid);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    /**
     * 查询院校信息总数
     * @return
     */
    public int getPageCount() {
        String hql = "select count(*) from School";
        List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
        if (list != null && list.size() > 0) {
            return list.get(0).intValue();
        }
        return 0;
    }

    /**
     * 查询当前页面院校信息的集合
     * @param begin
     * @param limit
     * @return
     */
    public List<School> getPageById(int begin, int limit) {
        String hql = "from School";
        List<School> list = (List<School>)this.getHibernateTemplate().execute((HibernateCallback<School>)
                new PageHibernateCallBack(hql, new Object[]{}, begin, limit));
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }
}
