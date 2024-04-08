package com.shaurya.cabbookingdriver.config;

import com.shaurya.cabbookingdriver.constants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(AppConstants.CAB_LOCATION).build();
    }

}
