package edu.csus.csc130.assignment1;

import java.util.Iterator;

/**
 * Modified by Zack Waller
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
		queue.enqueue(item);
	}

	@Override
	public E pop() {
		for (int i = 0; i<queue.size()-1; i++)
		{
			shift();
		}
		return queue.dequeue();
	}

	@Override
	public E peek() {
		E item = pop();
		push(item);
		return item;
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public int size() {
		return queue.size();
	}
	
	private void shift()
	{
		queue.enqueue(queue.dequeue());
	}

}
