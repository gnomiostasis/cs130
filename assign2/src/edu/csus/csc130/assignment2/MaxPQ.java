package edu.csus.csc130.assignment2;

public class MaxPQ<Key extends Comparable<Key>> {
	private static int DEFAULT_CAPCITY=12;
	// heap-ordered complete binary tree
	// in pq[1..N] with pq[0] unused
	private Key[] pq; 
	private int size = 0;
	
	public MaxPQ() {
		this(DEFAULT_CAPCITY+1);
	}

	@SuppressWarnings("unchecked")
	public MaxPQ(int maxN) {
		pq = (Key[]) new Comparable[maxN + 1];
		size = 0;
	}	
	
	public void insert(Key v) {
		// double size of array if necessary
        if (size == pq.length - 1) resize(2 * pq.length);
		pq[++size] = v;
		swim(size);
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}
	
	public Key max() {
		if (size==0) {
			return null;
		} else {
			return pq[1];
		}
	}

	public Key delMax() {
		if (isEmpty()) return null;
		
		Key max = pq[1]; // Retrieve max key from top.
		swap(1, size--); // Exchange with last item.
		pq[size + 1] = null; // Avoid loitering.
		sink(1); // Restore heap property.
		
		if ((size > 0) && (size == (pq.length - 1) / 4)) resize(pq.length  / 2);
		return max;
	}
	
	// bottom-up repheapify
	private void swim(int k) {
		while (k > 1 && SortUtils.isLessThan(pq[k/2], pq[k])) {
			SortUtils.swap(pq, k/2, k);
			k = k/2;
		}
	}

	// top-down repheapify
	private void sink(int k) {
		while (2*k <= size) {
			int j = 2*k;
			if (j < size && SortUtils.isLessThan(pq[j], pq[j + 1]))
				j++; // j is the index of the largest children
			if (!SortUtils.isLessThan(pq[k], pq[j]))
				break;
			SortUtils.swap(pq, k, j);
			k = j;
		}
	}
	
	@SuppressWarnings("unchecked")
	private void resize(int capacity) {
        assert capacity > size;
        Key[] temp = (Key[]) new Comparable[capacity];
        for (int i = 1; i <= size; i++) {
            temp[i] = pq[i];
        }
        pq = temp;
    }

	private void swap(int i, int j) {
		Key t = pq[i];
		pq[i] = pq[j];
		pq[j] = t;
	}

}
