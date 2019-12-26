package com.fan.system;

import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SysLoginController {
    @GetMapping("/login")
    public String login()
    {
        return "/login";
    }
    @PostMapping("/login")
    @ResponseBody
    public Object ajaxLogin(HttpServletRequest request,String username, String password)
    {
        String username1 = request.getParameter("username");
        String password1 = request.getParameter("password");
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try
        {
            subject.login(token);
            JSONObject code = new JSONObject();
            code.put("code",0);
            System.out.println(code);
            System.out.println("SysLoginController+++++++++++++=");
            return code;
        }
        catch (AuthenticationException e)
        {
            String msg = "用户或密码错误";

                msg = e.getMessage();
            System.out.println("用户或密码错误"+msg);
            return null;
        }
    }

}
