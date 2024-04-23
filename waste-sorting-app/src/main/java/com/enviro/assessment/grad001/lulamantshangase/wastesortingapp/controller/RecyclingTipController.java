package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.RecyclingTip;
// import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service.RecyclingTipService;

@RestController
@RequestMapping("/recyclingtip")
public class RecyclingTipController {

    @Autowired
    private RecyclingTip recyclingTipService;

    @GetMapping("/{wasteCategory}")
    public RecyclingTip getRecyclingTipByWasteCategory(@PathVariable String wasteCategory) {
        return recyclingTipService.getRecyclingTipByWasteCategory(wasteCategory);
    }
}
