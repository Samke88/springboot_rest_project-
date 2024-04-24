/**
 * Types of waste based on examples from:
 * https://4waste.com.au/rubbish-removal/5-types-waste-know/
 */

package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service;
import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.WasteCategory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WasteCategoryService {

    private static final List<WasteCategory> wasteCategories = new ArrayList<>();

    static {
        wasteCategories.add(new WasteCategory());
        wasteCategories.add(new WasteCategory());
        // Add more waste categories as needed
    }

    public Optional<WasteCategory> getWasteCategoryById(Long id) {
        return wasteCategories.stream()
                .filter(category -> category.getId().equals(id))
                .findFirst();
    }

    public List<WasteCategory> getAllWasteCategories() {
        return new ArrayList<>(wasteCategories);
    }

    public WasteCategory createWasteCategory(WasteCategory wasteCategory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createWasteCategory'");
    }
}
