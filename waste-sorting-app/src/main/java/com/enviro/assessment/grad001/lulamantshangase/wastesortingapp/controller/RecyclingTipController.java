
package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.RecyclingTip;
import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service.RecyclingTipService;


@RestController
@RequestMapping("/recycling-tip")
public class RecyclingTipController {

    @Autowired
    private RecyclingTipService recyclingTipService;

    @GetMapping
    public ResponseEntity<RecyclingTip> getRecyclingTipByWasteCategory(@RequestParam String wasteCategory) {
        RecyclingTip recyclingTip = recyclingTipService.getRecyclingTipByWasteCategory(wasteCategory);
        if (recyclingTip != null) {
            return ResponseEntity.ok(recyclingTip);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
