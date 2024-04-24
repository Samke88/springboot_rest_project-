package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.RecyclingTip;

@SpringBootApplication
public class WasteSortingApplication {

	public static void main(String[] args) {
		SpringApplication.run(WasteSortingApplication.class, args);
	}

}


@Configuration
class AppConfig {
    
    @Bean
    public RecyclingTip recyclingTip() {
        // Instantiate and configure RecyclingTip object here
        return new RecyclingTip();
    }
}

