package com.sortinn.mail;

import com.sortinn.mail.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.mail.MessagingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailApplicationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MailApplicationTest.class);
    private static final String SEND_TO = "sortinndecar@gmail.com";

    @Resource
    MailService mailService;

    @Test
    public void sayHelloTest() {
        mailService.sayHello();
    }

    @Test
    public void simpleMailSendTest() {
        mailService.sendSimpleMail(SEND_TO, "我用SpringBoot发送的第一封邮件", "大家好，这是我用springboot发送的第一封电子邮件！");
    }

    @Test
    public void htmlMailSendTest() {
        String content = "<html>\n" +
                "<body>\n" +
                "<h1>Hello World</h1>\n" +
                "</body>\n" +
                "</html>";

        try {
            mailService.sendHtmlMail(SEND_TO, "我用SpringBoot发送的第一封HTML邮件", content);
        } catch (MessagingException e) {
            LOGGER.error("发送邮件失败");
        }
    }

    @Test
    public void attachmentMailSendTest() throws MessagingException {
        String filePath = "/Users/sortinn/sortinn/books/book.pdf";
        mailService.sendAttachmentMail(SEND_TO, "book附件", "附件中是一本书的pdf", filePath);
    }

    @Test
    public void inlineMailSendTest() throws MessagingException {
        String resId = "ford001";
        String resPath = "/Users/sortinn/sortinn/images/壁纸/ford_gt40_le_mans_1969-wallpaper-2560x1600.jpg";
        String content = "<html>\n" +
                "<body>福特跑车图片\n" +
                "<img src=\'resId:" + resId + "\'></img>" +
                "</body>" +
                "</html>";
        mailService.sendInlineResourceMail(SEND_TO, "Ford Auto", content, resId, resPath);
    }


}

