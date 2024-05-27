package com.oscProject.services;

import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StoreQueryParameters;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.config.StreamsBuilderFactoryBean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    StreamsBuilderFactoryBean streamsBuilderFactoryBean;

    public boolean isSessionExists(String userId, String loginDevice) {
        try {
            waitForStreams();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String key = userId + "-" + loginDevice;
        KafkaStreams streams = streamsBuilderFactoryBean.getKafkaStreams();
        ReadOnlyKeyValueStore<String, String> userSessionStore = streams.store(StoreQueryParameters.fromNameAndType("LoginTableStore", QueryableStoreTypes.keyValueStore()));
        String sessionForUser = userSessionStore.get(key);
        if (sessionForUser == null || sessionForUser.equals("0")) {
            return false;
        }
        return true;
    }
    public boolean  logTheUserIn(String userId, String loginDevice) {
        String key = userId + "-" + loginDevice;
        String value = "Session-" + loginDevice;
        try {
            kafkaTemplate.send("LoginDataTopic", key, value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean logTheUserOut(String userId, String loginDevice) {
        String key = userId + "-" + loginDevice;
        String value = "0";
        try {
            kafkaTemplate.send("LoginDataTopic", key, value);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean waitForStreams() throws InterruptedException {
        KafkaStreams streams = streamsBuilderFactoryBean.getKafkaStreams();
        if (streams == null) {
            return false;
        }
        while (streams.state() != KafkaStreams.State.RUNNING) {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
        return streams.state() == KafkaStreams.State.RUNNING;
    }
}

