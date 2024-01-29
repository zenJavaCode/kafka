package com.enduser.enduser.config;

import com.enduser.enduser.util.AppConstants;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConfig {

    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID )
    public void updatedLocation(String value){

        System.out.println(value);



    }
}
