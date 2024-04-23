package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WasteCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    // Add any other attributes as needed

    // Constructors, getters, and setters

    public WasteCategory() {
        // Default constructor
    }

    public WasteCategory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public WasteCategory(long l, String string, String string2) {
        // TODO Auto-generated constructor stub
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WasteCategory getWasteCategoryById(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWasteCategoryById'");
    }

    public List<WasteCategory> getAllWasteCategories() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllWasteCategories'");
    }
}
