package edu.csus.csc130.assignment2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Modified by Zack Waller
 *  HEY A CHANGE
 */
public class Sorting {
	
	/**
	 * @param list1 a list with elements in non-decreasing order, assume not null
	 * @param list2 a list with elements in non-decreasing order, assume not null
	 * @return a list that is the result of merging two inputs list in non-decreasing order
	 */
	public static <T extends Comparable<T>> List<T> merge(List<T> list1, List<T> list2) {
		List<T> list = new LinkedList<T>();
		
		Iterator iter1 = list1.iterator();
		Iterator iter2 = list2.iterator();
		T item1 = (T)iter1.next();
		T item2 = (T)iter2.next();
		int combined_size = list1.size() + list2.size();
		while (list.size()!=combined_size)
		{
			if( item1 != null && item2 != null)
			{
				if (isLessThan(item1,item2))
				{
					list.add(item1);
					try
					{
						item1 = (T)iter1.next();
					}
					catch(Exception e)
					{
						item1 = null;
					}
					
				}
				else
				{
					list.add(item2);
					try
					{
						item2 = (T)iter2.next();
					}
					catch(Exception e)
					{
						item2 = null;
					}
				}
			}
			else
			{
				if (item1 == null && item2 != null)
				{
					list.add(item2);
					try
					{
						item2 = (T)iter2.next();
					}
					catch(Exception e)
					{
						item2 = null;
					}
				}
				
				if(item2 == null && item1 != null)
				{
					list.add(item1);
					try
					{
						item1 = (T)iter1.next();
					}
					catch(Exception e)
					{
						item1 = null;
					}
				}
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
		int falsepos = 0;
		int truepos = a.length-1;
		for (int i =0 ; i < a.length; i++)
		{
			switch (a[i].toLowerCase())
			{
			case "false":
				if(i>falsepos)
				{
					swap(a,i,falsepos);
					falsepos++;
				}
				break;
			case "maybe":
				break;
			case "true":
				if(i<truepos)
				{
					swap(a,i,truepos);
					truepos--;
				}
				
				break;
			}
		}
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
