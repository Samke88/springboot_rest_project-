package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.RecyclingTip;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class RecyclingTipService {

    // Hardcoded recycling tips map (for demonstration purposes)
    private static Map<String, RecyclingTip> recyclingTips = new HashMap<>();

    static {
        recyclingTips.put("Plastic", new RecyclingTip());
        recyclingTips.put("Paper", new RecyclingTip());
        // Add more recycling tips as needed
    }

    public RecyclingTip getRecyclingTipByWasteCategory(String wasteCategory) {
        return recyclingTips.get(wasteCategory);
    }
}
