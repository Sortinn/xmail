package com.sortinn.mail.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author tian.gao
 * @create 2019.01.23 4:10 PM
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MailService.class)
public class MailServiceTest {

    @Resource
    MailService mailService;

    @Test
    public void sayHelloTest() {
        mailService.sayHello();
    }

    @Test
    public void simpleMailSendTest() {
        mailService.sendSimpleMail("sortinndecar@126.com", "我用SpringBoot发送的第一封邮件", "大家好，这是我用springboot发送的第一封电子邮件！");
    }
}
