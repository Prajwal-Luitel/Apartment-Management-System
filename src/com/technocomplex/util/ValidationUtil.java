/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.technocomplex.util;

import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * <b>Validation Util provide the utility method for validating the field using
 * Regular Expression also display the error message and change the text field
 * border to red.</b>.
 *
 * <p>
 * Features include:</p>
 * <ul>
 * <li>Validation using Regular Expression</li>
 * <li>Validating the range of field</li>
 * <li>Display error message and show red border in incorrect field</li>
 * </ul>
 *
 * @author Prajwal Luitel LMU ID 23048626
 */
public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]{2,50}$"); //alphabetic value only and must be in range 2 to 50
    private static final Pattern ID_PATTERN = Pattern.compile("^[1-9]\\d{2}$");  // does'nt start with 0 and is 3 digit value 
    private static final Pattern CONTACT_PATTERN = Pattern.compile("^98\\d{8}$");  // must start with 98 and has 10 digit

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
        return ID_PATTERN.matcher(Id).matches();
    }

    /**
     * Validates if the contact number starts with 98 and has 10 digits in
     * total.
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

    /**
     * Validates a single input field based on specific criteria and updates its
     * visual state.
     *
     * @param textField the JTextField to validate
     * @param fieldName the name of the field for error display
     * @param errorLbl the JLabel to show error messages
     * @param errorMsg the error message to display for invalid input
     * @param isValidFormat whether the input satisfies the field-specific
     * validation criteria
     * @return true if the field passes validation, false otherwise
     */
    public static boolean validateField(JTextField textField, String fieldName, JLabel errorLbl, String errorMsg, boolean isValidFormat) {
        if (ValidationUtil.isNullOrEmpty(textField.getText())) {
            textField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
            errorLbl.setText(fieldName + " cannot be empty!");
            return false;

        } else if (!isValidFormat) {
            textField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
            errorLbl.setText(errorMsg);
            return false;

        } else {
            textField.setBorder(null);
            errorLbl.setText(null);
            return true;
        }
    }

}
