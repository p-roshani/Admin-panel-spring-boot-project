package com.oscProject.services;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oscProject.entity.OTPMailObject1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Service;
import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@Configuration
//@Service
//@EnableKafka
public class OTPKafkaConsumer {

    @Autowired
    private JavaMailSender javaMailSender;
    @KafkaListener(topics = "OtpMailTopic", groupId = "OtpMailTopicId")
    public void sendMailtoUserKafka(String jsonString) {
        System.out.println("sendMailtoUserKafka");
        LOGGER.info(String.format("MESSAGE RECEIVED-> %s", jsonString));

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            //Deserialize the JSON string into a Java object
            OTPMailObject1 data = objectMapper.readValue(jsonString, OTPMailObject1.class);

            // Storing data in variables from the Java object
            String userId = data.getUserID();
            String otp = data.getOtp();
            String email = data.getEmailID();
            String mailText = "Your OTP for OSC registration is: " + otp + " and User Id is: " +userId;


            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(email);
            message.setSubject("AuthCode from OSC");
            message.setText(mailText);
            javaMailSender.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

