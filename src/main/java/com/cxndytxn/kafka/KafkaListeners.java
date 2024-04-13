package com.cxndytxn.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "message", groupId = "1")
    void listener(String data) {
        System.out.println("Received: " + data + "\nTopic: message");
    }

}
