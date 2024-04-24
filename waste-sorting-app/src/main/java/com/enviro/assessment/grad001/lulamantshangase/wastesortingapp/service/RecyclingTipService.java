// package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service;
// import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.RecyclingTip;
// import org.springframework.stereotype.Service;
// import java.util.HashMap;
// import java.util.Map;

// @Service
// public class RecyclingTipService {

//     private static final Map<String, RecyclingTip> recyclingTips = new HashMap<>();

//     static {
//         recyclingTips.put("Plastic", new RecyclingTip("Recycle plastic bottles", "Recycle plastic containers"));
//         recyclingTips.put("Paper", new RecyclingTip("Recycle newspapers", "Recycle cardboard"));
//         // Add more recycling tips as needed
//     }

//     public RecyclingTip getRecyclingTipByWasteCategory(String wasteCategory) {
//         return recyclingTips.getOrDefault(wasteCategory, new RecyclingTip("No recycling tip available", ""));
//     }
// }

package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.RecyclingTip;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RecyclingTipService {

    private static final Map<String, RecyclingTip> recyclingTips = new HashMap<>();

    static {
        // Define recycling tips for different waste categories
        recyclingTips.put("Plastic", new RecyclingTip("Recycle plastic bottles", "Plastic", null));
        recyclingTips.put("Paper", new RecyclingTip("Recycle paper products", "Paper", null));
       
    }

    public RecyclingTip getRecyclingTipByWasteCategory(String wasteCategory) {
        // Retrieve the recycling tip for the specified waste category
        return recyclingTips.get(wasteCategory);
    }
}
