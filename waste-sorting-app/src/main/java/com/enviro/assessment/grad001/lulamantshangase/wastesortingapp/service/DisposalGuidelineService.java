package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.DisposalGuideline;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class DisposalGuidelineService {

    private static Map<String, DisposalGuideline> disposalGuidelines = new HashMap<>();

    static {
        disposalGuidelines.put("Plastic", new DisposalGuideline("Plastic", "Plastic disposal guideline"));
        disposalGuidelines.put("Paper", new DisposalGuideline("Paper", "Paper disposal guideline"));
        disposalGuidelines.put("Glass", new DisposalGuideline("Glass", "Glass disposal guideline"));
    }

    public DisposalGuideline getDisposalGuidelineByWasteCategory(String wasteCategory) {
        return disposalGuidelines.get(wasteCategory);
    }
}

