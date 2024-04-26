package com.enviro.assessment.grad001.lulamantshangase.wastesorting.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecyclingTips {



    @GetMapping("/api/v1/tips/{wastecategory}")
    public String getRecyclingTips(@PathVariable String wasteCategory) {
        return "return recycling tips using waste category as reference";
        
    }
    
}
