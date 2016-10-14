package edu.csus.csc130.assignment2;

/**
 * Modified by firstname lastname
 *
 */
public class MedianFinding {
	MinPQ<Integer> minPQ;
	MaxPQ<Integer> maxPQ;
	
	public MedianFinding() {
		minPQ = new MinPQ<Integer>();
		maxPQ = new MaxPQ<Integer>();
	}
	
	// worst case running time: O(lgn) 
	public void insert(int n) {
		throw new UnsupportedOperationException();
	}
	
	// worse case running time: O(1)
	public double getMedian() {
		throw new UnsupportedOperationException();
	}
	
	// worst case running time: O(lgn)
	// If there are even number of elements, delete the larger one of the middle two
	public void deleteMedian() {
		throw new UnsupportedOperationException();
	}
	
}
