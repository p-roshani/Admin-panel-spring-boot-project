package com.oscProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Random;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@Service
public class OTPMailService<OtpMailObject> {
    public String generateOTP() {

        String otp = new DecimalFormat("000000").format(new Random().nextInt(999999));
        return otp;
    }

    public String generateUserID() {

        int length = 8;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder userId = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            userId.append(characters.charAt(index));
        }
        return userId.toString();
    }

//    @Autowired
//    private KafkaTemplate<String, OtpMailObject> kafkaTemplate;

    //Sending Otp, UserId to Kafka to the given UserID
 /*  public boolean sendOtpMail(OtpMailObject data) {
        LOGGER.info(String.format("MESSAGE SENT -> %s", data.toString()));

        Message<OtpMailObject> message = MessageBuilder
                .withPayload(data) //Payload means - this will carry your data
                .setHeader(KafkaHeaders.TOPIC, "otp-mail-topic") //topic name
                .build();

        kafkaTemplate.send(message);*//*

        kafkaTemplate.send("your-topic-name", data);

        System.out.println("message is sent to kafka topic");

        return  true;
    }*/

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public boolean sendOtpMail(String jsonString){
        LOGGER.info(String.format("MESSAGE SENT -> %s", jsonString));
        kafkaTemplate.send("OtpMailTopic", jsonString);
        return true;
    }

   /* // Inject KafkaTemplate
    private final KafkaTemplate<String, UserRegistrationEvent> kafkaTemplate;

    // Send a UserRegistrationEvent object to a Kafka topic
    public void sendUserRegistrationEvent(UserRegistrationEvent event) {
        kafkaTemplate.send("your-topic-name", event);
    }
*/

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate1;
    public void sendWelcomeMail(String emailID){
        this.kafkaTemplate1.send("WelcomeMailTopic", emailID);
    }


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate2;
    public boolean sendOtpOnForgotPassword(String jsonString){
        this.kafkaTemplate2.send("ForgotPasswordTopic", jsonString);
        return true;
    }
}

