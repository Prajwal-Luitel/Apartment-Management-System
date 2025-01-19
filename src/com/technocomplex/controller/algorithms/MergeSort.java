/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.technocomplex.controller.algorithms;

import com.technocomplex.model.FlatModel;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>
 * The MergeSort class provides a method to sort a list of FlatModel objects
 * based on their flat Id, Price and Size using the merge sort algorithm. It
 * supports sorting in both ascending and descending orders as specified.
 * </b>
 *
 * <p>
 * Features:</p>
 * <ul>
 * <li>Sorts a list of FlatModel objects by their Flat ID, Price, or Size.</li>
 * <li>Offers both ascending and descending order sorting options.</li>
 * <li>Implements the merge sort algorithm with a time complexity of O(n log
 * n).</li>
 * </ul>
 *
 * <h3>Notes:</h3>
 * <p>
 * The field parameter determines the sorting criteria:
 * <ul>
 * <li><b>1:</b> Sort by Price</li>
 * <li><b>2:</b> Sort by Size</li>
 * <li><b>Default:</b> Sort by Flat ID</li>
 * </ul>
 * <b>The input list is not modified; a new sorted list is returned.</b>
 * </p>
 *
 * @author prajwal Luitel LMU Id 23048626
 */
public class MergeSort {

    /**
     * MergeSort Constructor
     */
    public MergeSort() {

    }

    /**
     * Sorts a list of FlatModel objects according to their field in ascending
     * or descending order.
     *
     * @param flatList the list of FlatModel objects to be sorted
     * @param flatField the field according to which the object should be sorted
     * @param isAscending specifies the sort order (true for Ascending, false
     * for descending)
     * @return the sorted list
     */
    public List<FlatModel> sort(List<FlatModel> flatList, int flatField, boolean isAscending) {
        List<FlatModel> flatDataToSort = new ArrayList(flatList); // list to be sorted
        divide(flatDataToSort, flatField, isAscending, 0, flatDataToSort.size() - 1);
        return flatDataToSort;
    }

    /**
     * Sorts a list of FlatModel objects by dividing into two halve and merging
     * the resultant sorted list
     *
     * @param flatList the list of FlatModel objects to be sorted
     * @param flatField the field according to which the object should be sorted
     * @param isAscending specifies the sort order (true for Ascending, false
     * for descending)
     * @return the sorted list
     */
    private void divide(List<FlatModel> sortFlatList, int flatField, boolean isAscending, int left, int right) {
        // base case
        if (left >= right) {
            return;
        }
        // mathmatical expension of (left+right)/2 to ensure no overflow occur
        int mid = left + (right - left) / 2;

        divide(sortFlatList, flatField, isAscending, left, mid); // left halve
        divide(sortFlatList, flatField, isAscending, mid + 1, right); // rigth halve
        // merging the two divided soreted halve into single list
        merge(sortFlatList, flatField, isAscending, left, mid, right);
    }

    /**
     * Merges two sublists of a given list of FlatModel objects based on the
     * specified sorting criteria. This method is a part of a merge sort
     * algorithm, ensuring the elements within the specified range are sorted in
     * the desired order (ascending or descending).
     *
     * @param flatList the list of FlatModel objects to be sorted
     * @param flatField the field to sort by :- 1: Price, 2: Size, Default: Flat
     * ID
     * @param isAscending indicates the sorting order true for ascending and
     * false for descending
     * @param start the starting index of the sublist to be merged
     * @param mid the midpoint index of the sublist
     * @param end the ending index of the sublist to be merged
     */
    private void merge(List<FlatModel> flatList, int flatField, boolean isAscending, int start, int mid, int end) {
        List<FlatModel> tempFlatList = new ArrayList(); // temporary arrayLIst to hold the sorted object
        int leftIndex = start;
        int rightIndex = mid + 1;
        // combining in specified order
        while (leftIndex <= mid && rightIndex <= end) {
            boolean condition;
            switch (flatField) {
                case 1: // Compare by price
                    condition = isAscending
                            ? flatList.get(leftIndex).getPrice() <= flatList.get(rightIndex).getPrice()
                            : flatList.get(leftIndex).getPrice() >= flatList.get(rightIndex).getPrice();
                    break;
                case 2: // Compare by size
                    condition = isAscending
                            ? flatList.get(leftIndex).getSize() <= flatList.get(rightIndex).getSize()
                            : flatList.get(leftIndex).getSize() >= flatList.get(rightIndex).getSize();
                    break;
                default: // by Flat Id
                    condition = isAscending
                            ? flatList.get(leftIndex).getFlatId() <= flatList.get(rightIndex).getFlatId()
                            : flatList.get(leftIndex).getFlatId() >= flatList.get(rightIndex).getFlatId();
            }

            if (condition) {
                tempFlatList.add(flatList.get(leftIndex++));
            } else {
                tempFlatList.add(flatList.get(rightIndex++));
            }
        }
        // adding the remaining object
        while (leftIndex <= mid) {
            tempFlatList.add(flatList.get(leftIndex++));
        }
        while (rightIndex <= end) {
            tempFlatList.add(flatList.get(rightIndex++));
        }
        //transfering from temporary list to needed list
        for (int i = start; i <= end; i++) {
            flatList.set(i, tempFlatList.get(i - start));
        }
    }
}
