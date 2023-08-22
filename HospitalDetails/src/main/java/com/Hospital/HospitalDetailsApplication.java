package com.Hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.Hospital.service.HospitalService;

@SpringBootApplication
public class HospitalDetailsApplication {

	public static void main(String[] args) {
		
		
		
		ConfigurableApplicationContext context =SpringApplication.run(HospitalDetailsApplication.class, args);
		HospitalService serviceObj = context.getBean(HospitalService.class);
		
		serviceObj.saveHospitalDetail();
	
	}

}
