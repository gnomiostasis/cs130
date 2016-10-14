package edu.csus.csc130.assignment2;

import java.util.PriorityQueue;

/**
 * A  wrapper class of JDK PriorityQueue, 
 * which is a MinPQ implementation
 * 
 */
public class MinPQ<Key extends Comparable<Key>> {
	PriorityQueue<Key> queue;
	
	public MinPQ() {
		queue = new PriorityQueue<Key>();
	}
	
	public void insert(Key key) {
		queue.add(key);
	}
	public Key delMin() {
		return queue.poll();
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	public int size() {
		return queue.size();
	}
	public Key min() {
		return queue.peek();
	}	
}
