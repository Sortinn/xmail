package com.sortinn.mail.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author tian.gao
 * @create 2019.01.23 4:09 PM
 **/

@Service
public class MailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MailService.class);

    @Autowired
    JavaMailSenderImpl mailSender;

    @Value("${spring.mail.username}")
    private String from;

    public void sayHello() {
        System.out.println("Hello World");
    }

    /**
     * 简单邮件发送
     *
     * @param to
     * @param subject
     * @param content
     */
    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);

        try {
            mailSender.send(mailMessage);
            LOGGER.info("邮件发送成功, from:{}, to:{}, subject:{}", from, to, subject);
        } catch (Exception e) {
            LOGGER.error("邮件发送异常", e);
        }
    }

    /**
     * HTML邮件发送
     * @param to
     * @param subject
     * @param content
     * @throws MessagingException
     */
    public void sendHtmlMail(String to, String subject, String content) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setFrom(from);
        mimeMessageHelper.setTo(to);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(content, true);
        try {
            mailSender.send(mimeMessage);
            LOGGER.info("邮件发送成功, from:{}, to:{}, subject:{}", from, to, subject);
        } catch (Exception e) {
            LOGGER.error("邮件发送异常", e);
        }
    }


    /**
     * 带附件的邮件发送
     * @param to
     * @param subject
     * @param content
     * @param filePath 附件地址
     * @throws MessagingException
     */
    public void sendAttachmentMail(String to, String subject, String content, String filePath) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content,true);

        FileSystemResource file = new FileSystemResource(new File(filePath));
        String filename = file.getFilename();
        helper.addAttachment(filename, file);
        mailSender.send(mimeMessage);
    }


    /**
     * 图片邮件发送
     * @param to
     * @param subject
     * @param content
     * @param resId 图片id
     * @param resPath 图片路径
     * @throws MessagingException
     */
    public void sendInlineResourceMail(String to, String subject, String content, String resId, String resPath) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content, true);

        FileSystemResource res = new FileSystemResource(new File(resPath));
        helper.addInline(resId, res);

        mailSender.send(mimeMessage);
    }
}
