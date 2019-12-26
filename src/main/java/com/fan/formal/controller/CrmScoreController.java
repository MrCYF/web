package com.fan.formal.controller;

import com.alibaba.fastjson.JSONArray;
import com.fan.formal.dao.CrmScore;
import com.fan.formal.service.CrmScoreService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/crm")
@Controller
public class CrmScoreController {
    @Autowired
    private CrmScoreService crmScoreService;

    @RequestMapping("/list")
    @ResponseBody
    public List<CrmScore> select() {
        List<CrmScore> list = crmScoreService.select();
        return list;
    }
    @RequiresPermissions("business:askCorp:list")
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, ModelMap map) {
        request.setAttribute("name", "chen");
        List<CrmScore> list = crmScoreService.select();
        String s = JSONArray.toJSONString(list);
        map.put("list", s);
        return "hello";
    }
}
