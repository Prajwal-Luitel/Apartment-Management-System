/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.technocomplex.controller.datastructure;

import com.technocomplexr.model.FlatModel;
import java.util.LinkedList;
import java.util.List;

/**
 * <b>Custom implementation of a stack data structure for managing
 * CleanFlatModel objects. This stack is implemented using a LinkedList and
 * supports basic operations like push, pop, peek, and poll</b>.
 *
 * <p>
 * Features include:</p>
 * <ul>
 * <li>Ability to check if the stack is empty .</li>
 * </ul>
 *
 * <p>
 * Note: This implementation assumes that the stack operations are not accessed
 * concurrently.</p>
 *
 * @author Prajwal Luitel LMU ID 23048626
 */
public class CustomStack {

    private final List<FlatModel> cleanedList; // Internal storage for the stack.   

    /**
     * Constructs a CustomStack with the specified capacity.
     *
     */
    public CustomStack() {
        this.cleanedList = new LinkedList<>();
    }

    /**
     * Removes and returns the last element from the stack.
     *
     * @return the first CleanModel in the stack, or null if the queue is empty.
     * @throws IllegalStateException if the stack is empty.
     */
    public FlatModel pop() {
        try {
            return cleanedList.removeLast();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot remove from empty stack."); // Indicates the stack is full.
        }

    }

    /**
     * Adds a new element to the end of the stack
     *
     * @param cleanFlatModel the cleanFlatModel to be added to the stack.
     */
    public void push(FlatModel cleanFlatModel) {
        cleanedList.addLast(cleanFlatModel);
    }

    /**
     * Returns the current size of the stack.
     *
     * @return the number of elements in the queue.
     */
    public int poll() {
        return cleanedList.size();
    }

    /**
     * Retrieves, but does not remove, the last element of the stack.
     *
     * @return the last CleanFlatModel in the stack
     * @throws IllegalStateException if the stack is empty.
     */
    public FlatModel peek() {
        try {
            return cleanedList.getLast();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot peek from empty stack."); // Indicates the stack is full.
        }
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return cleanedList.isEmpty();
    }

}
