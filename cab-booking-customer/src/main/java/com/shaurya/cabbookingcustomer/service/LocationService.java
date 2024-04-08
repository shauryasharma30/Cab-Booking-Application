package com.shaurya.cabbookingcustomer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "customer-group")
    public void cabLocation(String location) {
        System.out.println("Location Updated to : " + location);
    }

}
