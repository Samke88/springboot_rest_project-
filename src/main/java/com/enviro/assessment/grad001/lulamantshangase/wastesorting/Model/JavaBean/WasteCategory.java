package com.enviro.assessment.grad001.lulamantshangase.wastesorting.Model.JavaBean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "WasteCategory")
public class WasteCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="categoryName")
    private String categoryName;
    @Column(name="disposalGuide")
    private String disposalGuide;
    @Column(name="recyclingTips")
    private String recyclingTips;


    //GETTERS

    public long getID() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getDisposalGuide() {
        return disposalGuide;
    }

    public String getRecycleTips() {
        return recyclingTips;
    }


    //SETTERS

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setDisposalSteps(String disposalGuide) {
        this.disposalGuide = disposalGuide;
    }

    public void setRecyclingTips(String recyclingTips) {

        this.recyclingTips = recyclingTips;
    }


    @Override
    public String toString() {
        return "{\"id\":"+ id+ ", \"categoryName\":\"" + categoryName+ "\", \"disposalGuide\":\"" + disposalGuide + "\", \"recyclingTips\":\"" + recyclingTips + "\"}";

    }
}
