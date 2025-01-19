package com.technocomplexr.model;

/**
 * The FlatModel class represents a flat entity of Techno Complex. It
 * encapsulates the attributes such as the flat Id, price, size, room counts,
 * furnishing status, availability status, and cleaning date.
 *
 * The class has constructors, getter and setter methods to initialize and
 * manipulate flat details.
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
    private String furnishing;
    private String flatStatus;
    private String cleanDate;

    /**
     * Constructor to initialize a flat model.
     *
     */
    public FlatModel() {

    }

    /**
     * Constructor to initialize a flat with the provided details.
     *
     * @param flatId the unique Id for the flat
     * @param price the price of the flat
     * @param size the size of the flat in square feet
     * @param livingroom the number of living rooms in the flat
     * @param bedroom the number of bedrooms in the flat
     * @param kitchen the number of kitchens in the flat
     * @param furnishing the furniture status of the flat
     * @param flatStatus the current status of the flat (available, not
     * available)
     */
    public FlatModel(short flatId, int price, int size, byte livingroom, byte bedroom, byte kitchen, String furnishing, String flatStatus) {
        this.flatId = flatId;
        this.price = price;
        this.size = size;
        this.livingroom = livingroom;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.furnishing = furnishing;
        this.flatStatus = flatStatus;
    }

    /**
     * Constructor to initialize a flat with the provided details.
     *
     * @param flatId the unique Id for the flat
     * @param size the size of the flat in square feet
     * @param flatStatus the current status of the flat (available, not
     * available)
     * @param cleanDate the date in which flat is cleaned
     */
    public FlatModel(short flatId, int size, String flatStatus, String cleanDate) {
        this.flatId = flatId;
        this.size = size;
        this.flatStatus = flatStatus;
        this.cleanDate = cleanDate;
    }

    /**
     * Constructor to initialize a flat with the provided details.
     *
     * @param flatId the unique Id for the flat
     * @param size the size of the flat in square feet
     * @param flatStatus the current status of the flat (available, not
     * available)
     */
    public FlatModel(short flatId, int size, String flatStatus) {
        this.flatId = flatId;
        this.size = size;
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
     * @param price used to set
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
     * @param size used to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Gets the number of livingroom
     *
     * @return number of livingroom
     */
    public byte getLivingroom() {
        return livingroom;
    }

    /**
     * set the number of livingroom
     *
     * @param livingroom set the number of livingroom
     */
    public void setLivingroom(byte livingroom) {
        this.livingroom = livingroom;
    }

    /**
     * Gets the number of bedroom
     *
     * @return number of bedroom
     */
    public byte getBedroom() {
        return bedroom;
    }

    /**
     * Set the number of bedroom of the flat.
     *
     * @param bedroom used to set
     */
    public void setBedroom(byte bedroom) {
        this.bedroom = bedroom;
    }

    /**
     * get the number of kitchen of the flat.
     *
     * @return number of kitchen
     */
    public byte getKitchen() {
        return kitchen;
    }

    /**
     * set the number of kitchen of the flat.
     *
     * @param kitchen used to set
     */
    public void setKitchen(byte kitchen) {
        this.kitchen = kitchen;
    }

    /**
     * get the furnishing status of the flat.
     *
     * @return furnishing status
     */
    public String getFurnishing() {
        return furnishing;
    }

    /**
     * set the furnishing status of the flat.
     *
     * @param furnishing used to set
     */
    public void setFurnising(String furnishing) {
        this.furnishing = furnishing;
    }

    /**
     * get the flat status
     *
     * @return flatStatus
     */
    public String getFlatStatus() {
        return flatStatus;
    }

    /**
     * set the flat Status of the flat.
     *
     * @param flatStatus used to set
     */
    public void setFlatStatus(String flatStatus) {
        this.flatStatus = flatStatus;
    }

    /**
     * get the date in which flat is cleaned
     *
     * @return the cleaned date
     */
    public String getCleanDate() {
        return cleanDate;
    }

    /**
     * set the flat cleaned date
     *
     * @param cleanDate date in which flat is cleaned
     */
    public void setCleanDate(String cleanDate) {
        this.cleanDate = cleanDate;
    }
}
