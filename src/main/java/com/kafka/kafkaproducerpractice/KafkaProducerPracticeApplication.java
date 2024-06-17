package com.kafka.kafkaproducerpractice;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class KafkaProducerPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerPracticeApplication.class, args);
    }
}
