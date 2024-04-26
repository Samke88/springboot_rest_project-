package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecyclingTip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tip;
    private String wasteCategory;
    private String description;

    public RecyclingTip() {
        // Default constructor
    }

    public RecyclingTip(String tip, String wasteCategory, String description) {
        this.tip = tip;
        this.wasteCategory = wasteCategory;
        this.description = description;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getWasteCategory() {
        return wasteCategory;
    }

    public void setWasteCategory(String wasteCategory) {
        this.wasteCategory = wasteCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecyclingTip getRecyclingTipByWasteCategory(String wasteCategory2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRecyclingTipByWasteCategory'");
    }

}