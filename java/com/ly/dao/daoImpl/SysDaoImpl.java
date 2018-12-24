package com.ly.dao.daoImpl;

import com.ly.dao.Sysdao;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liyue
 * @date 2018/11/27 14:04
 */
@Repository("dao")
public class SysDaoImpl extends HibernateDaoSupport implements Sysdao {

    public List find(String hql, Object... obj) {
        return getHibernateTemplate().find(hql,obj);
    }

    public void saveOrUpdate(Object obj) {
        getHibernateTemplate().saveOrUpdate(obj);
    }

    public void delete(Object obj) {
        getHibernateTemplate().delete(obj);
    }
}
