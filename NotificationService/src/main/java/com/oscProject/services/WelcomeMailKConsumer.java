package com.oscProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@Configuration
//@Service
//@EnableKafka
public class WelcomeMailKConsumer {

    @Autowired
    private JavaMailSender javaMailSender;
    @KafkaListener(topics = "WelcomeMailTopic", groupId = "WelcomeMailTopicId")
    public void sendMailtoUserKafka(String emailId) {
        LOGGER.info(String.format("MESSAGE RECEIVED-> %s", emailId));

        try {
            String mailText = "Welcome to Orosoft Shopping Cart";
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(emailId);
            message.setSubject("Welcome to OSC");
            message.setText(mailText);
            javaMailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

