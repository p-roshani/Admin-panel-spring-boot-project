package com.oscProject.services;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Materialized;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    @Bean
    public KTable<String, String> LoginDataKTable(StreamsBuilder streamsBuilder) {
        KStream<String, String> loginDataStream = streamsBuilder.stream("LoginDataTopic",
                Consumed.with(Serdes.String(), Serdes.String()));
        return loginDataStream.toTable(Materialized.as("LoginTableStore"));
    }
}
