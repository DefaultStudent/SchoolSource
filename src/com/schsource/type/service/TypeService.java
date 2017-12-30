package com.schsource.type.service;

import com.schsource.type.dao.TypeDao;
import com.schsource.type.vo.Type;
import com.schsource.utils.PageBean;

import java.util.List;

/**
 * @author vodka
 * @date 2017-12-30
 * @version 1.0
 */

public class TypeService {
    private TypeDao typeDao;

    public TypeDao getTypeDao() {
        return typeDao;
    }

    public void setTypeDao(TypeDao typeDao) {
        this.typeDao = typeDao;
    }

    /**
     *
     * @param page
     * @return
     */
    public PageBean<Type> findTypeByPage(int page) {
        PageBean<Type> pageBean = new PageBean<Type>();
        pageBean.setPage(page);

        int limit = 20;
        pageBean.setLimit(limit);

        int totalCount = typeDao.getTypePageCount();
        pageBean.setTotalCount(totalCount);

        int totalPage = (int)Math.ceil(totalCount / limit);
        pageBean.setTotalPage(totalPage);

        // 每页显示数据的集合
        int begin = (page - 1) * limit;
        List<Type> list = typeDao.getTypePageById(begin, limit);
        pageBean.setList(list);

        return pageBean;
    }

    /**
     * 添加院校类型信息
     * @param type
     */
    public void saveType(Type type) {
        typeDao.saveType(type);
    }

    /**
     * 删除院校类型信息
     * @param type
     */
    public void removeType(Type type) {
        typeDao.removeType(type);
    }

    /**
     * 根据tId查询院校类型信息
     * @param tId
     * @return
     */
    public Type getTypeById(int tId) {
        return typeDao.getTypeById(tId);
    }

    /**
     * 根据tName查询院校类型信息
     * @param tName
     * @return
     */
    public Type getTypeByName(String tName) {
        return  typeDao.getTypeByName(tName);
    }

    /**
     * 更新院校类型信息
     * @param type
     */
    public void updateType(Type type) {
        typeDao.updateType(type);
    }
}
