package com.hp.controller;

import com.alibaba.fastjson.JSON;
import com.hp.bean.Tab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "TabServlet",urlPatterns = "/TabServlet")
public class TabServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html ; charset=UTF-8");

        //  创建一个 layui后台的 json格式
        Map map = new HashMap<>();
        map.put("code", 0);// 默认必须是0  不然 不显示
        map.put("msg", "写什么都行");
        map.put("count", 3);
        map.put("data", table());


        String s = JSON.toJSONString(map);
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();
    }

    private List table() {
        List tabs = new ArrayList<>();
        for (int i = 1; i < 99; i++) {
            Tab tab = new Tab();
            tab.setId(i);
            tab.setBid("[00"+i+"]");
            tab.setName("新型新冠病毒"+i);
            tab.setCount(4);
            tab.setLever("高危");
            tab.setYname("www.baidu.com");
            tab.setYtype("新型病毒,重视修复");
            tabs.add(tab);
        }
        return tabs;
    }
}
