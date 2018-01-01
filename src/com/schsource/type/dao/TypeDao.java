package com.schsource.type.dao;

import com.schsource.type.vo.Type;
import com.schsource.utils.PageHibernateCallBack;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 院校类型持久化
 * @author vodka
 * @date 2017-12-30
 * @version 1.0
 */

public class TypeDao extends HibernateDaoSupport{

    /**
     * 查询院校类型信息
     * @return
     */
    public int getTypePageCount() {
        String hql = "select count(*) from Type";
        List<Long> list = (List<Long>) getHibernateTemplate().find(hql);

        if (list != null && list.size() > 0) {
            return list.get(0).intValue();
        }
        return 0;
    }

    /**
     * 查询当前页面院校类型信息的集合
     * @param begin
     * @param limit
     * @return
     */
    public List<Type> getTypePageById(int begin, int limit) {
        String hql = "from Type";
        List<Type> list = this.getHibernateTemplate().execute((HibernateCallback<List<Type>>)
                new PageHibernateCallBack(hql, new Object[]{}, begin, limit));

        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     * 添加院校类型信息
     * @param type
     */
    @Transactional(readOnly = false)
    public void saveType(Type type) {
        this.getHibernateTemplate().save(type);
    }

    /**
     * 删除院校类型信息
     * @param type
     */
    public void removeType(Type type) {
        this.getHibernateTemplate().delete(type);
    }

    /**
     * 根据tId查询院校类型信息
     * @param tId
     * @return
     */
    public Type getTypeById(int tId) {
        return this.getHibernateTemplate().get(Type.class, tId);
    }

    /**
     * 根据tName查询院校类型信息
     * @param tName
     * @return
     */
    public Type getTypeByName(String tName) {
        return this.getHibernateTemplate().get(Type.class, tName);
    }

    /**
     * 更新院校类型信息
     * @param type
     */
    public void updateType(Type type) {
        this.getHibernateTemplate().saveOrUpdate(type);
    }
}
