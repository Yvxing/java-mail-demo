package com.ujiuye;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appc =  new ClassPathXmlApplicationContext("spring.xml");
        JavaMailSenderImpl javaMailSenderImpl = (JavaMailSenderImpl) appc.getBean("javaMailSenderImpl");

        MailTemp test = new MailTemp("447420902@qq.com", "1757322402@qq.com", "test", "收到了么？");
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(test.getFrom());
        simpleMailMessage.setTo(test.getTo());
        simpleMailMessage.setSubject(test.getTitle());
        simpleMailMessage.setText(test.getContent());

        javaMailSenderImpl.send(simpleMailMessage);
        System.out.println("已发送");
    }


}
