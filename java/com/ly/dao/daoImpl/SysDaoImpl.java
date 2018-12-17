package com.ly.dao.daoImpl;

import com.ly.dao.Sysdao;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liyue
 * @date 2018/11/27 14:04
 */
@Repository("dao")
public class SysDaoImpl implements Sysdao {

    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    public List find(String hql, Object... obj) {
        return hibernateTemplate.find(hql,obj);
    }

    public void saveOrUpdate(Object obj) {
        hibernateTemplate.saveOrUpdate(obj);
    }

    public void delete(Object obj) {
        hibernateTemplate.delete(obj);
    }
}
