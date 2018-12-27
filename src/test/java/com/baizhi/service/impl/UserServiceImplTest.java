package com.baizhi.service.impl;

import com.baizhi.App;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class UserServiceImplTest {

    @Autowired
    private UserService us;

    @Test
    public void getAll() {
        List<User> users = us.getAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}