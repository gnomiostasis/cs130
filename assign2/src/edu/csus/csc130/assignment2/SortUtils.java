package edu.csus.csc130.assignment2;

public class SortUtils {
	
	public static<T extends Comparable<T>> boolean isLessThan(T v, T w) {
		return v.compareTo(w) < 0;
	}

	public static<T> void swap(T[] a, int i, int j) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}
