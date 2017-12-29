package com.schsource.utils;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;

import java.util.List;

/**
 * 为了代码复用,重新写了一个类来实现HibernateCallback接口
 * @author vodka
 * @version 1.0 2017-12-29
 */

public class PageHibernateCallBack<T> implements HibernateCallback<List<T>> {

    private String hql;
    private Object[] params;
    private int startIndesx;
    private int pageSize;

    /**
     * @param hql
     * @param params
     * @param startIndesx
     * @param pageSize
     */
    public PageHibernateCallBack(String hql, Object[] params, int startIndesx, int pageSize) {
        super();
        this.hql = hql;
        this.params = params;
        this.startIndesx = startIndesx;
        this.pageSize = pageSize;
    }

    @Override
    public List<T> doInHibernate(Session session) throws HibernateException {
        Query query = session.createQuery(hql);

        if (params != null) {
            for (int i = 0; i < params.length; i++) {
                query.setParameter(i, params[i]);
            }
        }

        query.setFirstResult(startIndesx);
        query.setMaxResults(pageSize);
        return query.list();
    }
}
