package edu.csus.csc130.fall2016.assignment3;
import java.util.HashMap;
public class STClient {
	/**
	 * @param grades arrays of letter grades, assume not null or empty
	 * @return the average of grades, ignore invalid letter in calculation
	 */
	//Q9
	public  static double getAverage(String[] grades) {
		HashMap hash = new HashMap<String, Double>();
		hash.put("A+", 4.33);
		hash.put("A",  4.00);
		hash.put("A-", 3.67);
		hash.put("B+", 3.33);
		hash.put("B",  3.00);
		hash.put("B-", 2.67);
		hash.put("C+", 2.33);
		hash.put("C",  2.00);
		hash.put("C-", 1.67);
		hash.put("D",  1.00);
		hash.put("F",  0.00);
		
		double total = 0;
		double count = 0;
		for (int i = 0; i < grades.length; i++)
		{
			String key = grades[i];
			if (hash.containsKey(key))
			{
				total += (double)hash.get(key);
				count++;
			}
		}
		if (count != 0)
		{
			return total/count;
		}
		return 0;
	}

}
