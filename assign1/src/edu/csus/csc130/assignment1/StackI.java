package edu.csus.csc130.assignment1;

public interface StackI<E>  extends Iterable<E>{
    public void push(E item);	// add an item to the top
    public E pop();				// remove the top item
    public E peek();			// return the top item without removing it
    public boolean isEmpty();	// return true if the stack is empty otherwise false
    public int size();			// return the number of items on the stack
}
