package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.DisposalGuideline;
import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service.DisposalGuidelineService;

@RestController
@RequestMapping("/disposalguideline")
public class DisposalGuidelineController {

    @Autowired
    private DisposalGuidelineService disposalGuidelineService;

    @GetMapping("/{wasteCategory}")
    public DisposalGuideline getDisposalGuidelineByWasteCategory(@PathVariable String wasteCategory) {
        return disposalGuidelineService.getDisposalGuidelineByWasteCategory(wasteCategory);
    }
}

