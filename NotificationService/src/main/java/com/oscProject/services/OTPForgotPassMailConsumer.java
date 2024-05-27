package com.oscProject.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oscProject.entity.OTPMailObject1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@Configuration
public class OTPForgotPassMailConsumer {

    @Autowired
    private JavaMailSender javaMailSender;
    @KafkaListener(topics = "ForgotPassMailTopic", groupId = "ForgotPassMailTopicId")
    public void sendMailtoUserKafka(String jsonString) {
        LOGGER.info(String.format("Forgot password MESSAGE RECEIVED-> %s", jsonString));

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            //Deserialize the JSON string into a Java object
            OTPMailObject1 data = objectMapper.readValue(jsonString, OTPMailObject1.class);

            // Storing data in variables from the Java object
            String otp = data.getOtp();
            String email = data.getEmailID();
            String mailText = "Please enter following OTP to reset your password: " + otp;

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(email);
            message.setSubject("Reset Password - OSC");
            message.setText(mailText);
            javaMailSender.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
