package com.shaurya.cabbookingdriver.service;

import com.shaurya.cabbookingdriver.constants.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    // Using Kafka Template, Key : String, Value : Object
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location) {
        kafkaTemplate.send(AppConstants.CAB_LOCATION, location);
        return true;
    }
}
