package com.ujiuye;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

public class MailAttachment {
    public static void main(String[] args) throws MessagingException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        JavaMailSenderImpl javaMailSender = (JavaMailSenderImpl) app.getBean("javaMailSenderImpl");

        MailTemp test = new MailTemp("发送者邮件地址", "接收者邮箱地址", "标题", "内容");
        //发送普通文本类型的邮件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        //指定附件
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "GBK");

        helper.setFrom(test.getFrom());
        helper.setTo(test.getTo());
        helper.setSubject(test.getTitle());
        helper.setText(test.getContent());

        //这个只能用于项目内文件
//        ClassPathResource 放项目中的文件路径 = new ClassPathResource("放项目中的文件路径");

        //电脑中文件的路径
        File file = new File("C:\\Users\\44742\\Desktop\\221.png");
        helper.addAttachment("221.jpg",file);

        javaMailSender.send(mimeMessage);
        System.out.println("发送完成");
    }
}
