package edu.csus.csc130.assignment2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MedianFindingTest {
	private MedianFinding uut;

	@Before
	public void setUp() throws Exception {
		uut = new MedianFinding();
	}

	@Test
	public void testInsertGetMedian() {
		int[] a = {6, 27, 15, 2, 19, 29, 4, 7, 19};
		double[] result = {6, 16.5, 15, 10.5, 15, 17, 15, 11, 15};
		for (int i=0; i<a.length; i++) {
			uut.insert(a[i]);
			double median = uut.getMedian();
			Assert.assertEquals(result[i], median, 0.01);
		}
	}


	@Test
	public void testDeleteGetMedian() {
		int[] a = {6, 27, 15, 2, 19, 29, 4, 7, 19};
		double[] result = {13, 7, 12.5, 6, 15.5, 4, 15.5, 2};
		for (int i=0; i<a.length; i++) {
			uut.insert(a[i]);
		}
		for (int i=0; i<a.length-1; i++) {
			uut.deleteMedian();
			double median = uut.getMedian();
			Assert.assertEquals(result[i], median, 0.01);			
		}
	}

}
