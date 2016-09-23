package edu.csus.csc130.assignment1;

public interface QueueI<E> extends Iterable<E> {
    public void enqueue(E item);// add an item to the end of the queue
    public E dequeue();			// remove an item from the front of the queue
    public E peek();			// return the item from the front of the queue without out removing it
    public boolean isEmpty();	// return true if the queue is empty otherwise false
    public int size();			// return the number of items in the queue
}
