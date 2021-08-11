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
import java.text.SimpleDateFormat;
import java.util.*;

@WebServlet(name = "LayuiServlet",urlPatterns = "/LayuiServlet")
public class LayuiServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html ; charset=UTF-8");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Student> students = new ArrayList<>();
        Date date = new Date();
        String da =simpleDateFormat.format(date);
        // 创建三个
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(15);
        s1.setClasss("18网络");
        students.add(s1);

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(22);
        s2.setClasss("17软件");
        students.add(s2);

        Student s3 = new Student();
        s3.setName("王五");
        s3.setAge(21);
        s3.setClasss("17软件");
        students.add(s3);

        Student s4 = new Student();
        s4.setName("冷七");
        s4.setAge(20);
        s4.setClasss("17网络");
        students.add(s4);

        Student s5 = new Student();
        s5.setName("叫兽");
        s5.setAge(15);
        s5.setClasss("18师范");
        students.add(s5);

        Student s6 = new Student();
        s6.setName("小六");
        s6.setAge(22);
        s6.setClasss("18网络");
        students.add(s6);

        Student s7 = new Student();
        s7.setName("热巴");
        s7.setAge(21);
        s7.setClasss("18学前");
        students.add(s7);


        //  创建一个 layui后台的 json格式

        Map map = new HashMap<>();
        map.put("code",0);// 默认必须是0  不然 不显示
        map.put("msg","写什么都行");
        map.put("count",3);
        map.put("data",students);

        String  s = JSON.toJSONString(map);
        PrintWriter writer =resp.getWriter();
        writer.println(s);
        writer.close();
    }

//    private Object nam() {
//        List  stu = new ArrayList<>();
//        for (int i = 1; i < 1000; i++) {
//            Student student = new Student();
//            student.setName("张三");
//            student.setAge(19);
//            student.setClasss("19学前");
//            stu.add(student);
//        }
//        return stu;
//    }
}
