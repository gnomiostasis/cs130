package edu.csus.csc130.assignment2;

import java.util.LinkedList;
import java.util.List;


/**
 * Modified by firstname lastname
 *
 */
public class Sorting {
	
	/**
	 * @param list1 a list with elements in non-decreasing order, assume not null
	 * @param list2 a list with elements in non-decreasing order, assume not null
	 * @return a list that is the result of merging two inputs list in non-decreasing order
	 */
	public static <T extends Comparable<T>> List<T> merge(List<T> list1, List<T> list2) {
		List<T> list = new LinkedList<T>();
		
		// provide implementation here
		int list1_index = 0;
		int list2_index = 0;
		int combined_size = list1.size() + list2.size();
		while (list.size()<=combined_size)
		{
			T item1 = list1.get(list1_index);
			T item2 = list2.get(list2_index);
			//if item1<item2
			if (isLessThan(item2,item1))
			{
				list.add(item1);
				list1_index++;
			}
			else
			{
				list.add(item2);
				list2_index++;
			}
		}
		
		return list;
	}
	
	/**
	 * @param a String array where each element has one of the three values: "false", "maybe", or "true"
	 * Give an O(N) algorithm to rearrange the elements so that all �false� elements precede �maybe� elements, 
	 * which in turn precede �true� elements. You may use only constant extra space.  
	 */
	public static void rearrange(String[] a) {
		throw new UnsupportedOperationException();
	}
	
	public static<T extends Comparable<T>> boolean isLessThan(T v, T w) {
		return v.compareTo(w) < 0;
	}	
	
	public static<T> void swap(T[] a, int i, int j) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}	

}
