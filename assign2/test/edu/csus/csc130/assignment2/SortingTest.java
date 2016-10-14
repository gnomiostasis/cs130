package edu.csus.csc130.assignment2;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SortingTest {
	@Test
	public void testMerge1() {
		Integer[] a1 = {2, 3, 4, 5};
		List<Integer> list1 = createList(a1);
		Integer[] a2 = {1, 6, 7, 8};
		List<Integer> list2 = createList(a2);
		Integer[] result = {1, 2, 3, 4, 5, 6, 7, 8};
		List<Integer> resultList = Sorting.merge(list1, list2);
		Assert.assertEquals(result.length, resultList.size());
		for (int i=0; i<result.length; i++) {
			Assert.assertEquals(result[i], resultList.get(i));
		}
	}
	
	@Test
	public void testMerge2() {
		Integer[] a1 = {1, 3, 5, 7};
		List<Integer> list1 = createList(a1);
		Integer[] a2 = {2, 4, 6, 8};
		List<Integer> list2 = createList(a2);
		Integer[] result = {1, 2, 3, 4, 5, 6, 7, 8};
		List<Integer> resultList = Sorting.merge(list1, list2);
		Assert.assertEquals(result.length, resultList.size());
		for (int i=0; i<result.length; i++) {
			Assert.assertEquals(result[i], resultList.get(i));
		}
	}
	
	@Test
	public void testMerge3() {
		Integer[] a1 = {6, 7, 8};
		List<Integer> list1 = createList(a1);
		Integer[] a2 = {1, 2, 3, 4, 5};
		List<Integer> list2 = createList(a2);
		Integer[] result = {1, 2, 3, 4, 5, 6, 7, 8};
		List<Integer> resultList = Sorting.merge(list1, list2);
		Assert.assertEquals(result.length, resultList.size());
		for (int i=0; i<result.length; i++) {
			Assert.assertEquals(result[i], resultList.get(i));
		}
	}
	
	private static<T> List<T> createList(T[] a) {
		List<T> list = new LinkedList<T>();
		if (a!=null) {
			for (int i=0; i<a.length; i++) {
				list.add(a[i]);
			}
		}
		return list;
	}
	
	@Test 
	public void rearrange_1() {
		String[] a = {"true", "false", "maybe", "false"};
		String[] result = {"false", "false", "maybe", "true"};
		Sorting.rearrange(a);
		for (int i=0; i<a.length; i++) {
			Assert.assertEquals(a[i], result[i]);
		}
		Assert.assertEquals(a.length, result.length);
	}

	@Test 
	public void rearrange_2() {
		String[] a = {"maybe", "false", "maybe", "false"};
		String[] result = {"false", "false", "maybe", "maybe"};
		Sorting.rearrange(a);
		for (int i=0; i<a.length; i++) {
			Assert.assertEquals(a[i], result[i]);
		}
		Assert.assertEquals(a.length, result.length);
	}

	@Test 
	public void rearrange_3() {
		String[] a = {"true", "false", "true", "false"};
		String[] result = {"false", "false", "true", "true"};
		Sorting.rearrange(a);
		for (int i=0; i<a.length; i++) {
			Assert.assertEquals(a[i], result[i]);
		}
		Assert.assertEquals(a.length, result.length);
	}
	
	@Test 
	public void rearrange_4() {
		String[] a = {"true", "maybe", "true", "maybe"};
		String[] result = {"maybe", "maybe", "true", "true"};
		Sorting.rearrange(a);
		for (int i=0; i<a.length; i++) {
			Assert.assertEquals(a[i], result[i]);
		}
		Assert.assertEquals(a.length, result.length);
	}	


}
