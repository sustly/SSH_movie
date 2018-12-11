package com.ly.service.serviceimpl;

import com.ly.dao.Sysdao;
import com.ly.service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liyue
 * @date 2018/11/29 9:27
 */
@Service
public class MyserviceImpl implements Myservice {

    @Autowired
    private final Sysdao dao;


    public MyserviceImpl(Sysdao dao) {
        this.dao = dao;
    }

    public List find(String hql, Object... obj) {
       return dao.find(hql,obj);
    }
}
