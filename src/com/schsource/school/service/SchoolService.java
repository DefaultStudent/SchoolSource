package com.schsource.school.service;

import com.schsource.school.dao.SchoolDao;
import com.schsource.school.vo.School;
import com.schsource.utils.PageBean;

import java.util.List;

/**
 * @author vodka
 * @version 1.0 2017-12-29
 */

public class SchoolService {

    private SchoolDao schoolDao;

    public SchoolDao getSchoolDao() {
        return schoolDao;
    }

    public void setSchoolDao(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    /**
     *
     * @param page
     * @return
     */
    public PageBean<School> findByPage(int page) {
        PageBean<School> pageBean = new PageBean<School>();
        pageBean.setPage(page);
        int limit = 10;
        pageBean.setLimit(limit);

        int totalCount = schoolDao.getPageCount();
        pageBean.setTotalCount(totalCount);

        int totalPage = totalCount % limit == 0 ? totalCount/limit : totalCount/limit+1;
        pageBean.setTotalPage(totalPage);

        // 每页显示数据的集合
        int begin = (page - 1) * limit;
        List<School> list = schoolDao.getPageById(begin, limit);
        pageBean.setList(list);

        return pageBean;
    }

    /**
     * 添加院校信息
     * @param school
     */
    public void saveSchool(School school) {
        schoolDao.saveSchool(school);
    }

    /**
     * 根据Id查询院校信息
     * @param schId
     * @return
     */
    public School findSchoolById(int schId) {
        return schoolDao.getSchoolById(schId);
    }

    /**
     * 根据Name查询院校信息
     * @param schName
     * @return
     */
    public School findSchoolByName(String schName) {
        return schoolDao.getSchoolByName(schName);
    }

    /**
     * 更新院校信息
     * @param school
     */
    public void updateSchool(School school) {
        schoolDao.updateSchool(school);
    }

    /**
     * 删除院校信息
     * @param school
     */
    public void deleteSchool(School school) {
        schoolDao.deleteSchool(school);
    }

    /**
     * 根据Id统计院校
     * @param tid
     * @return
     */
    public School countByTid(int tid) {
        return schoolDao.countByTid(tid);
    }
}
