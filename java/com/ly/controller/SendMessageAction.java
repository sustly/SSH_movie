package com.ly.controller;

import com.ly.service.Myservice;
import com.ly.service.serviceimpl.MyserviceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.aspectj.lang.annotation.Aspect;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author liyue
 * @date 2018/12/10 13:28
 */
//@Component
public class SendMessageAction extends ActionSupport {
    private String param;



    public void setParam(String param) {
        this.param = param;
    }
    public ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    //@Autowired
    //public Myservice service;


    public String send() throws IOException {
        Myservice service = (Myservice) context.getBean("myserviceImpl");
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=utf-8");
        String hql = "select a from FilmBtsNew a where a.name like ?0";
        List list = service.find(hql, "%" + param + "%");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(param, list);
        response.getWriter().print(jsonObject);
        return NONE;
    }
}
