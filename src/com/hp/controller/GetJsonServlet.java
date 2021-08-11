package com.hp.controller;

import com.alibaba.fastjson.JSON;
import com.hp.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

//  和 web.xml  ----------注意 有 /
@WebServlet(name = "GetJsonServlet" ,urlPatterns = "/GetJsonServlet")
public class GetJsonServlet extends HttpServlet {
    // service 可以接受get 也可以post请求
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        //  web ,controller 是提供json 数据的，那么我们需要一个包
        // 这个lib包 叫做fastjson 阿里巴巴出品 很牛的


        // 学习json 和 fastjson

        List<Student> studens = new ArrayList<>();

        Student s1 = new Student();
            s1.setId(001);
             s1.setAge(19);
             s1.setName("孙大圣");
        studens.add(s1);

        Student s2 = new Student();
            s2.setId(002);
            s2.setAge(21);
            s2.setName("孙行者");
        studens.add(s2);


        Student s3 = new Student();
            s3.setId(003);
            s3.setAge(20);
            s3.setName("孙悟空");
        studens.add(s3);

        String s = JSON.toJSONString(studens);
        System.out.println("stu = " + studens);// 把对象转换成了 json格式的字符串

        //输出到前端
        // 1.解决乱码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        // 2.开始输出
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
