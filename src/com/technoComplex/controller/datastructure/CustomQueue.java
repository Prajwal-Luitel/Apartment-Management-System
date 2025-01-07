/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.technoComplex.controller.datastructure;

import com.technoComplex.model.CleanFlatModel;
import java.util.LinkedList;
import java.util.List;

/**
 * <b>Custom implementation of a queue data structure for managing
 * CleanFlatModel objects. This queue is implemented using a LinkedList and
 * supports basic operations like enqueue, dequeue, peek, and poll</b>.
 *
 * <p>
 * Features include:</p>
 * <ul>
 * <li>Ability to check if the queue is empty .</li>
 * </ul>
 *
 * <p>
 * Note: This implementation assumes that the queue operations are not accessed
 * concurrently.</p>
 *
 * @author Prajwal Luitel LMU ID 23048626
 */
public class CustomQueue {

    private List<CleanFlatModel> cleaningList; // Internal storage for the queue.   

    /**
     * Constructs a CustomQueue
     */
    public CustomQueue() {
        this.cleaningList = new LinkedList<>();
    }

    /**
     * Removes and returns the first element from the queue.
     *
     * @return the first CleanModel in the queue, or null if the queue is empty.
     */
    public CleanFlatModel deQueue() {
        return cleaningList.removeFirst();
    }

    /**
     * Adds a new element to the end of the queue
     *
     * @param cleanFlatModel the cleanFlatModel to be added to the queue.
     */
    public void enQueue(CleanFlatModel cleanFlatModel) {
        cleaningList.addLast(cleanFlatModel);
    }

    /**
     * Returns the current size of the queue.
     *
     * @return the number of elements in the queue.
     */
    public int poll() {
        return cleaningList.size();
    }

    /**
     * Retrieves, but does not remove, the first element of the queue.
     *
     * @return the first CleanFlatModel in the queue
     */
    public CleanFlatModel peek() {
        return cleaningList.getFirst();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return cleaningList.isEmpty();
    }

}
