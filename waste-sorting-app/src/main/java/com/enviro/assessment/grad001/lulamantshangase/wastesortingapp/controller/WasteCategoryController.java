package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.controller;

import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model.WasteCategory;
import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.service.WasteCategoryService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wastecategory")
public class WasteCategoryController {

    private static final WasteCategoryService wasteCategoryService = null;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<WasteCategory> createWasteCategory(@RequestBody WasteCategory wasteCategory) {
        WasteCategory createdCategory = wasteCategoryService.createWasteCategory(wasteCategory);
        if (createdCategory != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(createdCategory);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}  