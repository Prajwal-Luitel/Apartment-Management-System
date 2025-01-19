/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.technocomplex.controller.algorithms;

import com.technocomplexr.model.TenantModel;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>
 * The SelectionSort class provides a method to sort a list of TenantModel
 * objects based on their Tenant ID using the selection sort algorithm. It
 * supports sorting in both ascending and descending orders as specified.
 * </b>
 *
 * <p>
 * Features:</p>
 * <ul>
 * <li>Sorts a list of TenantModel objects by their Tenant ID.</li>
 * <li>Supports ascending and descending order sorting.</li>
 * <li>Implements the classic selection sort algorithm with O(n<sup>2</sup>)
 * time complexity.</li>
 * </ul>
 *
 * <p>Notes:The input list is not modified; a new sorted list is returned.<p>
 *
 * @author prajwal Luitel LMU Id 23048626
 */
public class SelectionSort {

    /**
     * SelectionSort Constructor
     */
    public SelectionSort() {

    }

    /**
     * Sorts a list of TenantModel objects by their Tenant ID in ascending or
     * descending order.
     *
     * @param tenantList the list of TenantModel objects to be sorted
     * @param isAsec specifies the sort order (true for Ascending, false for
     * descending)
     * @return the sorted list
     */
    public List<TenantModel> sortByTenantId(List<TenantModel> tenantList, boolean isAsec) {
        List<TenantModel> tenantDataToSort = new ArrayList<>(tenantList); // list to be sorted

        for (int i = 0; i < tenantDataToSort.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(tenantDataToSort, i, isAsec);
            if (i != extremumIndex) {
                swap(tenantDataToSort, i, extremumIndex);
            }
        }
        return tenantDataToSort;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param TenantList the list of TenantModel objects
     * @param startIndex the index to start searching from
     * @param isAsec specifies whether to find the minimum (true) or maximum
     * (false)
     * @return the index of the extremum value (minimum or maximum).
     */
    private int findExtremumIndex(List<TenantModel> TenantList, int startIndex, boolean isAsec) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < TenantList.size(); j++) {
            if (shouldSwap(TenantList.get(j).getTenantId(), TenantList.get(extremumIndex).getTenantId(), isAsec)) {

                extremumIndex = j;
            }
        }
        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isAsec specifies the sort order (true for Ascending, false for
     * descending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(int current, int extremum, boolean isAsec) {
        return isAsec ? current < extremum : current > extremum;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param tenantList the list of TenantModel objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<TenantModel> tenantList, int i, int j) {
        TenantModel temp = tenantList.get(i);
        tenantList.set(i, tenantList.get(j));
        tenantList.set(j, temp);
    }
}
