package com.enviro.assessment.grad001.lulamantshangase.wastesortingapp.model;

@Entity
public class RecyclingTip {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    private String tip;
    // Add any other attributes as needed
    

    
    public RecyclingTip() {
        // Default constructor

    

        this.wasteCategory = wasteCategory;
        this.tip = tip;
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

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public RecyclingTip getRecyclingTipByWasteCategory(String wasteCategory2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRecyclingTipByWasteCategory'");
    }
}
