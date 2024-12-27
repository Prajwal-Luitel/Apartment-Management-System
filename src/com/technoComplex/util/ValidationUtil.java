/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.technoComplex.util;

import java.util.regex.Pattern;

/**
 *
 * @author prajwal Luitel LMU Id 23048626
 */
public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]{2,50}$"); //alphabetic value only and must be in range 2 to 50
    private static final Pattern ID_PATTERN = Pattern.compile("^[1-9]\\d{2}$");  // does'nt start with 0 and is 3 digit value a
    private static final Pattern CONTACT_PATTERN = Pattern.compile("^98\\d{8}$");  // must start with 98 , has 10 digit

   
    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets and spaces.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates if the ID is exactly 3 digits.
     *
     * @param Id the ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidId(String Id) {
        return  ID_PATTERN.matcher(Id).matches();
    }

  
    /**
     * Validates if the contact number starts with 98 and has 10 digits in total.
     *
     * @param contact the contact number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidContact(String contact) {
        return CONTACT_PATTERN.matcher(contact.toLowerCase()).matches();
    }

    /**
     * Validates if the age is between 18 and 60 (inclusive).
     *
     * @param age the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAge(short age) {
        return age >= 18 && age <= 60;
    }
    /**
     * Validates if the price is between 20000 and 500000 (inclusive).
     *
     * @param price the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPrice(int price) {
        return price >= 20000 && price <= 500000;
    }
    
    /**
     * Validates if the age is between 350 and 2500 (inclusive).
     *
     * @param size the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidSize(int size) {
        return size >= 350 && size <= 2500;
    }
    

}
