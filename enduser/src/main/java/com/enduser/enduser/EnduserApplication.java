package com.enduser.enduser;

import com.enduser.enduser.util.AppConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class EnduserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnduserApplication.class, args);



	}

	@KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID )
	public void updatedLocation(String value){

		System.out.println(value);



	}

}
