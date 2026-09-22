package br.com.api.medresponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class MedresponseApplication {

	public String getHomeTest(){
		return "MedResponse - API HOME";
	}

	public static void main(String[] args) {
		SpringApplication.run(MedresponseApplication.class, args);
	}

}
