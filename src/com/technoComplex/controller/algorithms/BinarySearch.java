/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.technoComplex.controller.algorithms;

import com.technoComplex.model.TenantModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prajwal Luitel LMU Id 23048626
 */
public class BinarySearch {

    /**
     * Constructor for BinarySearch
     */
    public BinarySearch() {

    }

    /**
     * Search TenantModel objects by their name
     *
     * @param tenantList the list of TenantModel objects to be searched
     * @param searchValue the name to be searched
     * @return index of multiple searchedValue object
     */
    public List<Integer> searchByName(List<TenantModel> tenantList, String searchValue) {
        List<Integer> multipleValueList = new ArrayList(); // to store index of multiple search value
        int initialValue = binarySearch(tenantList, searchValue, 0, tenantList.size() - 1); // index of the search value        

        if (initialValue == -1) {
            return multipleValueList; // not found 
        }
        addMultipleResultInList(multipleValueList, tenantList, initialValue, searchValue); // searching for multiple same value
        return multipleValueList;
    }

    /**
     * Search TenantModel objects by their name and store all the matched result
     * index in list
     *
     * @param multipleValueList store index of all the matched object
     * @param tenantList the list of TenantModel objects to be searched
     * @param initialValue starting point to search the value from
     * @param searchValue the name to be searched
     *
     */
    private void addMultipleResultInList(List<Integer> multipleValueList, List<TenantModel> tenantList, int initialValue, String searchValue) {
        multipleValueList.add(initialValue);
        int i = initialValue - 1;
        int j = initialValue + 1;
        // searching in left side to find multiple matched result
        while (i >= 0 && searchValue.trim().equalsIgnoreCase(tenantList.get(i).getName().trim())) {
            multipleValueList.add(i--);
        }
        // searching in right side to find multiple matched result
        while (j < tenantList.size() && searchValue.trim().equalsIgnoreCase(tenantList.get(j).getName().trim())) {
            multipleValueList.add(j++);
        }
    }

    /**
     * Search TenantModel objects by their name
     *
     * @param tenantList the list of TenantModel objects to be searched
     * @param searchValue the name to be searched
     * @param left left most index to search
     * @param right right most index to search
     *
     * @return index of searched Value
     */
    private int binarySearch(List<TenantModel> tenantList, String searchValue, int left, int right) {
        // base case
        if (right < left) {
            return -1;

        }
        // mathmatical expension of (left+right)/2 to ensure no overflow occur
        int mid = left + (right - left) / 2;
        // search value found
        if (searchValue.trim().equalsIgnoreCase(tenantList.get(mid).getName().trim())) {
            return mid;
        }
        if (searchValue.compareToIgnoreCase(tenantList.get(mid).getName()) < 0) {
            return binarySearch(tenantList, searchValue, left, mid - 1); //search in left half
        } else {
            return binarySearch(tenantList, searchValue, mid + 1, right); // search in right half
        }
    }
}
