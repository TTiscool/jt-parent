package com.jt.manage;

import com.jt.manage.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JtManageApplicationTests {


    @Autowired
    public ApplicationContext context;

    @Test
    public void test1(){
//        Assert.assertNotNull(context.getBean(User.class));
        User user = context.getBean(User.class);
//        logger.info(user.toString());
    }



}
