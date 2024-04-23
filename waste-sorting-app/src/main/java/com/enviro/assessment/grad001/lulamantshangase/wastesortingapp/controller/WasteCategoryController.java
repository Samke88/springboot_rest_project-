package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.controller;
import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.WasteCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.Service.WasteCategoryService;

import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.WasteCategory;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.WasteCategory;

import java.util.List;


@RestController
@RequestMapping("/wastecategory")
public class WasteCategoryController {

    @Autowired
    private WasteCategory wasteCategoryService;

    @GetMapping("/{id}")
    public WasteCategory getWasteCategoryById(@PathVariable Long id) {
        return wasteCategoryService.getWasteCategoryById(id);
    }

    @GetMapping("/all")
    public List<WasteCategory> getAllWasteCategories() {
        return wasteCategoryService.getAllWasteCategories();
    }
}
