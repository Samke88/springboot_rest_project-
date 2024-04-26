package com.enviro.assessment.grad001.lulamantshangase.wastesorting.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisposalGuide {
   
    @GetMapping("/api/v1/guide")
    public String getDisposalGuide(String wasteCategory) {

        return "return guide using wastecategory as reference";
    }
    
}
