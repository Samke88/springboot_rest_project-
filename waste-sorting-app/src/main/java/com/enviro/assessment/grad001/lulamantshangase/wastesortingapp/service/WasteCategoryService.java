package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service;

import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.WasteCategory;

// import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.WasteCategory;

import java.util.ArrayList;
import java.util.List;

@Service
public class WasteCategoryService {

    // Hardcoded list of waste categories (for demonstration purposes)
    private static List<WasteCategory> wasteCategories = new ArrayList<>();

    static {
        WasteCategoryService.add(new WasteCategory(1L, "Plastic", "Plastic waste description"));
        wasteCategories.add(new WasteCategory(2L, "Paper", "Paper waste description"));
        // Add more waste categories as needed
    }

    public WasteCategory getWasteCategoryById(Long id) {
        return wasteCategories.stream()
                .filter(category -> category.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    private static void add(WasteCategory wasteCategory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public List<WasteCategory> getAllWasteCategories() {
        return wasteCategories;
    }
}
