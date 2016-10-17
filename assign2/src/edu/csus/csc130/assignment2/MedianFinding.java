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
		
		 if (minPQ.size() == 0)
		 {
			 minPQ.insert(n);
		 }
		 else if (maxPQ.size() == 0)
		 {
			 maxPQ.insert(n); 
		 }
		 else
		 {
			 if (n>minPQ.min())
			 {
				 minPQ.insert(n); //if N is generally larger
			 }
			 else
			 {
				 maxPQ.insert(n); //if N is generally smaller
			 }
		 }
			 
		 balanceQueues();
	}
	
	// worse case running time: O(1)
	public double getMedian() {
		if (maxPQ.size() ==minPQ.size())
		{
			return (maxPQ.max() + minPQ.min())/2.0;
		}
		else if(maxPQ.size()>minPQ.size())
		{
			return (double) maxPQ.max();
		}
		else
		{
			return (double) minPQ.min();
		}
	}
	
	// worst case running time: O(lgn)
	// If there are even number of elements, delete the larger one of the middle two
	public void deleteMedian() {
		if (maxPQ.size() == minPQ.size())
		{
			minPQ.delMin();
		}
		else if(maxPQ.size()>minPQ.size())
		{
			maxPQ.delMax();
		}
		else
		{
			minPQ.delMin();
		}
	}
	
	private void balanceQueues()
	{
		
		if (!isBalancedQueues())
		{
			redistribute();
		}
		if (maxPQ.size() != 0 && minPQ.size()!=0)
		{
			if (maxPQ.max()>minPQ.min())
			{
				swapMinMax();
			}	
		}
		
		
	}
	private boolean isBalancedQueues()
	{
		//tests to see if maxpq and minpq are equal size +/- 1
		if( maxPQ.size() == minPQ.size()
			|| maxPQ.size()-1 == minPQ.size()
			|| maxPQ.size() == minPQ.size()-1)
		{
			return true;
		}
		return false;
	}
	private void redistribute()
	{
		if (maxPQ.size()>minPQ.size())
		{
			while (!isBalancedQueues())
			{
				minPQ.insert(maxPQ.max());
				maxPQ.delMax();
			}
		}
		else
		{
			while (!isBalancedQueues())
			{
				maxPQ.insert(minPQ.min());
				minPQ.delMin();
			}
		}
	}
	
	private void swapMinMax()
	{
		int frommax = maxPQ.max();
		int frommin = minPQ.min();
		maxPQ.delMax();
		minPQ.delMin();
		maxPQ.insert(frommin);
		minPQ.insert(frommax);
	}
	
}
