package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service;

// import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.DisposalGuideline;
import org.springframework.stereotype.service;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.DisposalGuideline;

import java.util.HashMap;
import java.util.Map;

@service
public class DisposalGuidelineService {

    // Hardcoded disposal guidelines map (for demonstration purposes)
    private static Map<String, DisposalGuideline> disposalGuidelines = new HashMap<>();

    static {
        disposalGuidelines.put("Plastic", new DisposalGuideline("Plastic", "Plastic disposal guideline"));
        disposalGuidelines.put("Paper", new DisposalGuideline("Paper", "Paper disposal guideline"));
        // Add more disposal guidelines as needed
    }

    public DisposalGuideline getDisposalGuidelineByWasteCategory(String wasteCategory) {
        return disposalGuidelines.get(wasteCategory);
    }
}
