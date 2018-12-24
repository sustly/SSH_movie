package com.ly.service.serviceimpl;

import com.ly.dao.Sysdao;
import com.ly.service.Myservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.ejb.TransactionManagement;
import java.util.List;

/**
 * @author liyue
 * @date 2018/11/29 9:27
 */
@Service("service")
@TransactionManagement
public class MyserviceImpl implements Myservice {

    @Resource(name = "dao")
    private final Sysdao dao;


    public MyserviceImpl(Sysdao dao) {
        this.dao = dao;
    }

    public List find(String hql, Object... obj) {
       return dao.find(hql,obj);
    }
}
