/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.technoComplex.model;

/**
 *
 * @author prajwal Luitel LMU Id 23048626
 */
public class FlatModel {
    private short flatId;
    private int price;
    private int size;
    private byte livingroom;
    private byte bedroom;
    private byte kitchen;
    private String furnising;
    private String flatStatus;
    
    /**
     * Constructor to initialize a flat with the provided details.
     * 
     * @param flatId     the unique Id for the flat
     * @param price      the price of the flat
     * @param size       the size of the flat in square feet
     * @param livingroom the number of living rooms in the flat
     * @param bedroom    the number of bedrooms in the flat
     * @param kitchen    the number of kitchens in the flat
     * @param furnising  the furniture status of the flat
     * @param flatStatus the current status of the flat (available, not available)
     */
    public FlatModel(short flatId, int price, int size, byte livingroom, byte bedroom, byte kitchen, String furnising, String flatStatus) {
        this.flatId = flatId;
        this.price = price;
        this.size = size;
        this.livingroom = livingroom;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.furnising = furnising;
        this.flatStatus = flatStatus;
    }
    
    /**
     * Gets the unique Id for the flat.
     *
     * @return the flat ID
     */
    public short getFlatId() {
        return flatId;
    }
    
    /**
     * Sets the unique Id for the flat.
     *
     * @param flatId the flat ID to set
     */
    public void setFlatId(short flatId) {
        this.flatId = flatId;
    }
    
    /**
     * Gets the price of the flat.
     *
     * @return the price
     */
    public int getPrice() {
        return price;
    }
    
    /**
     * Set the price of the flat.
     *
     * @param  price used to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    /**
     * Gets the size of the flat.
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Set the size of the flat.
     *
     * @param  size used to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Gets the  number of livingroom
     *
     * @return livingroom
     */
    public byte getLivingroom() {
        return livingroom;
    }
    
    /**
     * set the  number of livingroom
     *
     * @param livingroom set the number of livingroom
     */
    public void setLivingroom(byte livingroom) {
        this.livingroom = livingroom;
    }
    
    /**
     * Gets the  number of bedroom
     *
     * @return bedroom number
     */
    public byte getBedroom() {
        return bedroom;
    }
    
    /**
     * Set the number ofbedroom of the flat.
     *
     * @param  bedroom used to set
     */
    public void setBedroom(byte bedroom) {
        this.bedroom = bedroom;
    }
    
    /**
     * get the number of kitchen of the flat.
     *
     * @return  kitchen number
     */
    public byte getKitchen() {
        return kitchen;
    }
    
    /**
     * set the number of kitchen of the flat.
     *
     * @param   kitchen used to set
     */
    public void setKitchen(byte kitchen) {
        this.kitchen = kitchen;
    }
    
    /**
     * get the furnishing status of the flat.
     *
     * @return  furnishing status
     */
    public String GetFurnising() {
        return furnising;
    }
    
    /**
     * set the furnishing status of the flat.
     *
     * @param   furnising used to set
     */
    public void setFurnising(String furnising) {
        this.furnising = furnising;
    }
    
    /**
     * get the flat status
     *
     * @return  flatStatus
     */
    public String GetFlatStatus() {
        return flatStatus;
    }
    
    /**
     * set the flat Status of the flat.
     *
     * @param  flatStatus used to set  
     */
    public void setFlatStatus(String flatStatus) {
        this.flatStatus = flatStatus;
    }
    
    
    
}
