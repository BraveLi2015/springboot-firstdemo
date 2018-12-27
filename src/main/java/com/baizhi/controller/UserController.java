package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService us;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/testJsp")
    public String testJsp(Map map) {
        try {
            List<User> users = us.getAll();
            map.put("user", users);
            logger.info("get success");
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("get fail");
        }
       /* for (User user : users) {
            System.out.println("**********"+user);
        }*/
        return "index";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, String username) {
        session.setAttribute("name", username);
        System.out.println(username);
        return "index";
    }

    @RequestMapping("/testAspect")
    public String testAspect() {
        us.testAspect();
        return "index";
    }

}
