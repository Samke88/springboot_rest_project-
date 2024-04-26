package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.WasteCategory;

@Configuration
public class WasteCategoryConfig {
    
    @Bean
    public WasteCategory wasteCategory() {
        // Instantiate and configure WasteCategory object here
        return new WasteCategory();
    }
}
