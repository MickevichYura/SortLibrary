package sort.library.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import sort.library.Sorter;

public class Tester {
	
	private Map<String, Long> speedTest;
	private int bound = 10000;

	public Map<String, Long> testSorters(List<Sorter<Integer>> sorters, int arrayLength){
		Integer[] array;
		speedTest = new HashMap<String, Long>();
		array = new Integer[arrayLength];
		Random rand = new Random();
		for (int i = 0; i < arrayLength; i++) {
			array[i] = rand.nextInt(bound);

		}

		for (Sorter<Integer> sorter : sorters) {
			long before = System.currentTimeMillis();
			sorter.sort(array.clone());
			long after = System.currentTimeMillis();
			speedTest.put(sorter.getClass().getName(), after - before);
			//System.out.println(Arrays.toString(sorter.sort(array)));
		}
			
		return speedTest;
	}
}
