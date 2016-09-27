package edu.csus.csc130.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Modified by Zack Waller
 *
 */
public class Miscellaneous {
	
	public static long powI(long x, int n) {
		// provide your implementation here
		try 
		{
			while(n>=0)
			{
				if(n == 0)
				{
					return 1;
				}
				 
				if (n == 1)
				{
					return x;
				}
				
				if (n % 2 == 0)
				{
					x = x*x;
				}
				else
				{
					x = x*x*x;
				}
					 
				n = n/2;
			}
			 
		}
		catch (Exception e)
		{ 
			throw e;
		}
		return x;
	}
	
	public static int binarySearch(int[] a, int key) {
		// provide your implementation here
		int return_index=-1;
		try{
			int low = 0;
			int high = a.length - 1;
		          
			while(high >= low) {
		        int middle = (low + high) / 2;
		        if(a[middle] == key) {
		            return_index = middle;
		        }
		        if(a[middle] < key) {
		             low = middle + 1;
		        }
		        if(a[middle] >= key) {
		        	 high = middle - 1;
		        }
		    }
		}
		catch(Exception e)
		{
			throw e;
		}
		return return_index;
	}
	
	public static<E> List<E> getSelected(List<E> items, List<Integer> positions) {
		// provide your implementation here
		List <E> return_list = new ArrayList<E>();
		try{
			Iterator itr = positions.iterator();
			while (itr.hasNext())
			{
				Integer pos = (Integer)itr.next();
				if (pos.intValue() >=0 && pos.intValue()<items.size())
				{
					return_list.add(items.get(pos));
				}
			}
		}
		catch(Exception e)
		{
			throw e;
		}
		return return_list;
	}

}
