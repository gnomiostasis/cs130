package edu.csus.csc130.assignment1;

import java.util.Iterator;

/**
 * Modified by FirstName LastName
 *
 * Stack implementation using a Queue
 */
public class StackQ<E> implements StackI<E> {
	LinkedListQueue<E> queue;
	
	public StackQ() {
		queue = new LinkedListQueue<E>();
	}

	@Override
	public Iterator<E> iterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void push(E item) {
		// provide your implementation here
		throw new UnsupportedOperationException();
	}

	@Override
	public E pop() {
		// provide your implementation here
		throw new UnsupportedOperationException();
	}

	@Override
	public E peek() {
		// provide your implementation here
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isEmpty() {
		// provide your implementation here
		throw new UnsupportedOperationException();
	}

	@Override
	public int size() {
		// provide your implementation here
		throw new UnsupportedOperationException();
	}

}
