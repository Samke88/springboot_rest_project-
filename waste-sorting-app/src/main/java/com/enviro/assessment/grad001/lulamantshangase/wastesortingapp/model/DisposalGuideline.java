 package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;

import org.apache.commons.math3.analysis.function.Identity;
 
 Identity
 public class DisposalGuideline {
 
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
 
     private String wasteCategory;
     private String guideline;
     // Add any other attributes as needed
 
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
 }
 
// import org.springframework.boot.autoconfigure.domain.EntityScan;

// import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.GeneratedValue;
// import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.GenerationType;
// import com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.Id;

// @EntityScan
// public class DisposalGuideline {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String wasteCategory;
//     private String guideline;
//     // Add any other attributes as needed

//     // Constructors, getters, and setters

//     public DisposalGuideline() {
//         // Default constructor
//     }

//     public DisposalGuideline(String wasteCategory, String guideline) {
//         this.wasteCategory = wasteCategory;
//         this.guideline = guideline;
//     }

//     // Getters and setters
//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getWasteCategory() {
//         return wasteCategory;
//     }

//     public void setWasteCategory(String wasteCategory) {
//         this.wasteCategory = wasteCategory;
//     }

//     public String getGuideline() {
//         return guideline;
//     }

//     public void setGuideline(String guideline) {
//         this.guideline = guideline;
//     }
// }
