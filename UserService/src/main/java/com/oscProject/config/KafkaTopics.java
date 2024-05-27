package com.oscProject.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.StreamsBuilderFactoryBean;

@Configuration
public class KafkaTopics {

    @Bean
    public NewTopic createOTPMailTopic() {

        return new NewTopic("OtpMailTopic", 1, (short) 1);
    }

    @Bean
    public NewTopic createWelcomeMailTopic() {

        return new NewTopic("WelcomeMailTopic", 1, (short) 1);
    }

    @Bean
    public NewTopic createForgotPassMailTopic() {

        return new NewTopic("ForgotPassMailTopic", 1, (short) 1);
    }

    @Bean
    public NewTopic createLoginTopic() {

        return new NewTopic("LoginDataTopic", 1, (short) 1);
    }
}
