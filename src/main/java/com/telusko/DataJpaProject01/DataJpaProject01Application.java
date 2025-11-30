package com.telusko.DataJpaProject01;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.DataJpaProject01.entity.Vaccine;
import com.telusko.DataJpaProject01.service.VaccineServiceImpl;


@SpringBootApplication
public class DataJpaProject01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject01Application.class, args);
	
		VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);

	  service.fetchByCostLessThan(65545.5).
	  forEach(v->System.out.println(v.getVaccineName()+ " : "+v.getVaccineCompany()));
	
	}

}
