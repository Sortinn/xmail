package com.sortinn.mail;

import com.sortinn.mail.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailApplicationTest {

    @Resource
    MailService mailService;

    @Test
    public void sayHelloTest() {
        mailService.sayHello();
    }

    @Test
    public void simpleMailSendTest() {
        mailService.sendSimpleMail("sortinndecar@gmail.com", "我用SpringBoot发送的第一封邮件", "大家好，这是我用springboot发送的第一封电子邮件！");
    }

}

