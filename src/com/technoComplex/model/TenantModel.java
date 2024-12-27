/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.technoComplex.model;

/**
 *
 * @author prajwal Luitel LMU Id 23048626
 */
public class TenantModel {
    private short tenantId;
    private String name;
    private short age;
    private String contact;
    private String joinDate;
    private short flatId;
    private String gender;
    /**
     * Constructor to initialize a tenant with the provided details.
     * 
     * @param tenantId  the unique Id for the tenant
     * @param name      the name of the tenant
     * @param age       the age of the tenant
     * @param contact   the contact information of the tenant
     * @param joinDate  the date when the tenant joined
     * @param flatId    the unique flat Id which tenant is renting
     * @param gender    the gender of the tenant
     */
    public TenantModel(short tenantId, String name, short age, String contact, String joinDate, short flatId, String gender) {
        this.tenantId = tenantId;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.joinDate = joinDate;
        this.flatId = flatId;
        this.gender = gender;
    }
    
    /**
     * Gets the unique Id for the tenant
     *
     * @return tenantId
     */
    public int getTenantId() {
        return tenantId;
    }
    
    /**
     * Sets the unique Id for the tenant.
     *
     * @param tenantId the tenant ID to set
     */
    public void setTenantId(short tenantId) {
        this.tenantId = tenantId;
    }
    
    /**
     * Gets the name of the tenant
     *
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the tenant.
     *
     * @param name used to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets the age of the tenant
     *
     * @return age
     */
    public short getAge() {
        return age;
    }
    
    /**
     * Sets the age of the tenant.
     *
     * @param age used to set
     */
    public void setAge(short age) {
        this.age = age;
    }
    
    /**
     * Gets the contact of the tenant
     *
     * @return contact
     */
    public String getContact() {
        return contact;
    }
    
    /**
     * Sets the contact of the tenant.
     *
     * @param contact used to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
    
    /**
     * Gets the join date of the tenant
     *
     * @return joinDate
     */
    public String getJoinDate() {
        return joinDate;
    }
    
    /**
     * Sets the join date of the tenant.
     *
     * @param joinDate used to set
     */
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
    
    /**
     * Gets the unique Flat Id of the tenant
     *
     * @return flatId the unique identifier
     */
    public int getFlatId() {
        return flatId;
    }
    
    /**
     * Sets the  unique flat Id of the tenant.
     *
     * @param flatId used to set
     */
    public void setFlatId(short flatId) {
        this.flatId = flatId;
    }
    
    /**
     * Gets the gender of the tenant
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }
    
    /**
     * Sets the gender of the tenant.
     *
     * @param gender used to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
