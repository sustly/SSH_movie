package com.ly.controller;

import com.ly.service.Myservice;
import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * @author admin
 */
@WebServlet(name = "com.ly.controller.ShowViewServlet", urlPatterns = "/show/aa")

public class ShowViewServlet extends HttpServlet {

    public ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Myservice service = (Myservice) context.getBean("myserviceImpl");
        response.setContentType("text/html;charset=utf-8");
        String param = request.getParameter("param");
        param = "%" + param + "%";
        String hql = "select a from FilmBtsNew a where a.name like ?0";
        List list = service.find(hql,param);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(param, list);
        response.getWriter().print(jsonObject);

    }
}
