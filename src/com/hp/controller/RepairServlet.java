package com.hp.controller;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "RepairServlet" ,urlPatterns = "/RepairServlet")
public class RepairServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html ; charset=UTF-8");

        String repair = req.getParameter("repair");
        System.out.println("repair = " + repair);

        Map hashmap = new HashMap<>();

        hashmap.put("code",0);
        hashmap.put("msg","修改成功");
        hashmap.put("repair","通过");

        String s = JSON.toJSONString(hashmap);
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();


    }
}
