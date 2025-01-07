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
public class InsertionSort {

    public InsertionSort() {

    }

    /**
     * Sorts a list of TenantModel objects by their tenant ID in ascending or
     * descending order using insertion sort.
     *
     * @param tenantList the list of TenantModel objects to be sorted
     * @param flatField sort by according to field
     * @param isAsc specifies the sort order (true for ascending, false for
     * descending)
     * @return the sorted list
     */
    public List<TenantModel> sort(List<TenantModel> tenantList
            , int flatField, boolean isAsc) {
        List<TenantModel> TenantDataToSort = new ArrayList<>(tenantList); // list to be sorted
        for (int i = 1; i < TenantDataToSort.size(); i++) {
            TenantModel key = TenantDataToSort.get(i);
            int j = i - 1;

            // Move elements based on the specified field
            while (j >= 0 && shouldSwap(TenantDataToSort.get(j), key, flatField, isAsc)) {
                TenantDataToSort.set(j + 1, TenantDataToSort.get(j));
                j--;
            }
            TenantDataToSort.set(j + 1, key);
        }

        return TenantDataToSort;
    }

    /**
     * Determines whether the current value should move based on sort order and
     * field.
     *
     * @param current the current TenantModel object
     * @param key the key TenantModel object
     * @param flatField specifies the field to be sorted (0 for age, 1 for
     * price, 2 for name)
     * @param isAsc specifies the sort order (true for ascending, false for
     * descending)
     *
     * @return true if the current value should move; false otherwise
     */
    private boolean shouldSwap(TenantModel current, TenantModel key, int flatField, boolean isAsc) {
        return switch (flatField) {
            // Sort by name
            case 2 ->
                isAsc ? current.getName().compareToIgnoreCase(key.getName()) > 0 : current.getName().compareToIgnoreCase(key.getName()) < 0;
            // Sort by age (default case)
            default ->
                isAsc ? current.getAge() > key.getAge() : current.getAge() < key.getAge();
        };

    }

}