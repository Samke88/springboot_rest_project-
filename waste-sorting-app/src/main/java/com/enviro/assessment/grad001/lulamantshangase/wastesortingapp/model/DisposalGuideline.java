package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
 @jakarta.persistence.Entity
 public class DisposalGuideline {
 
     @jakarta.persistence.Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
 
     private String wasteCategory;
     private String guideline;

 
     // Constructors, getters, and setters
 
     public DisposalGuideline() {
         // Default constructor
     }
 
     public DisposalGuideline(String wasteCategory, String guideline) {
         this.wasteCategory = wasteCategory;
         this.guideline = guideline;
     }
 
     // Getters and setters
     public Long getId() {
         return id;
     }
 
     public void setId(Long id) {
         this.id = id;
     }
 
     public String getWasteCategory() {
         return wasteCategory;
     }
 
     public void setWasteCategory(String wasteCategory) {
         this.wasteCategory = wasteCategory;
     }
 
     public String getGuideline() {
         return guideline;
     }
 
     public void setGuideline(String guideline) {
         this.guideline = guideline;
     }

    public String getDescription() {
        return "Disposal guideline for " + wasteCategory + ": " + guideline;
    }
 }
 