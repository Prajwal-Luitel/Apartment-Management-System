/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.technoComplex.model;

import java.util.Date;

/**
 *
 * @author prajw
 */
public class CleanFlatModel {
    private int flatId;
    private int size;
    private String flatStatus;
    private String cleanDate;
    public int getFlatId() {
        return flatId;
    }
    public CleanFlatModel(){
        
    }
    public CleanFlatModel(int flatId, int size, String flatStatus) {
        this.flatId = flatId;
        this.size = size;
        this.flatStatus = flatStatus;
    }
    
    public CleanFlatModel(int flatId, int size, String flatStatus, String cleanDate) {
        this.flatId = flatId;
        this.size = size;
        this.flatStatus = flatStatus;
        this.cleanDate = cleanDate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFlatStatus() {
        return flatStatus;
    }

    public void setFlatStatus(String flatStatus) {
        this.flatStatus = flatStatus;
    }

    public String getCleanDate() {
        return cleanDate;
    }

    public void setCleanDate(String cleanDate) {
        this.cleanDate = cleanDate;
    }
    
    
}
