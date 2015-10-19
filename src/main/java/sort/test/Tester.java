package sort.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import sort.library.Sorter;

public class Tester {

	private final int bound = 10000;
	private final int length = 10000;

	public Map<String, Long> testInteger(List<Sorter<Integer>> sorters) {
		Integer[] array = generateIntegerArray();
		Map<String, Long> speedTest = new HashMap<>();

		for (Sorter<Integer> sorter : sorters) {
			long before = System.currentTimeMillis();
			sorter.sort(array.clone());
			long after = System.currentTimeMillis();
			speedTest.put(sorter.getClass().getName(), after - before);
		}

		return speedTest;
	}

	public Map<String, Long> testMyClass(List<Sorter<MyClass>> sorters) {
		Map<String, Long> speedTest = new HashMap<>();
		MyClass[] array;
		array = generateMyClassArray();

		for (Sorter<MyClass> sorter : sorters) {
			long before = System.currentTimeMillis();
			sorter.sort(array.clone());
			long after = System.currentTimeMillis();
			speedTest.put(sorter.getClass().getName(), after - before);
		}
		return speedTest;
	}

	public Map<String, Long> testMyClassWithComparator(List<Sorter<MyClass>> sorters) {
		Map<String, Long> speedTest = new HashMap<>();
		MyClass[] array;
		array = generateMyClassArray();

		for (Sorter<MyClass> sorter : sorters) {
			long before = System.currentTimeMillis();
			sorter.sort(array.clone(), new Comparator<MyClass>() {

				@Override
				public int compare(MyClass o1, MyClass o2) {
					return o1.getSecondInteger().compareTo(o2.getSecondInteger());
				}
			});
			long after = System.currentTimeMillis();
			speedTest.put(sorter.getClass().getName(), after - before);
		}
		return speedTest;
	}

	private Integer[] generateIntegerArray() {
		
		Integer[] array;
		array = new Integer[length];
		Random rand = new Random();
		for (int i = 0; i < length; i++) {
			array[i] = rand.nextInt(bound);

		}
		return array;
	}

	private MyClass[] generateMyClassArray() {
		
		MyClass[] array;
		array = new MyClass[length];
		Random rand = new Random();
		for (int i = 0; i < length; i++) {
			array[i] = new MyClass(rand.nextInt(1000), rand.nextInt(1000));
		}
		return array;
	}

}
