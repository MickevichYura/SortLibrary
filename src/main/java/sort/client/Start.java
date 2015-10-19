package sort.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import sort.library.CombSorter;
import sort.library.SelectionSorter;
import sort.library.CoctailSorter;
import sort.library.Sorter;
import sort.test.MyClass;
import sort.test.Tester;

public class Start {
	
	public static void main(String[] args) {

		List<Sorter<Integer>> sorters = new ArrayList<>();
		sorters.add(new SelectionSorter<Integer>());
		sorters.add(new CombSorter<Integer>());
		sorters.add(new CoctailSorter<Integer>());
		
		
		List<Sorter<MyClass>> sorters1 = new ArrayList<>();
		sorters1.add(new SelectionSorter<MyClass>());
		sorters1.add(new CombSorter<MyClass>());
		sorters1.add(new CoctailSorter<MyClass>());
		
		Tester tester = new Tester();
		
		System.out.println(tester.testInteger(sorters));
		System.out.println(tester.testMyClass(sorters1));
		System.out.println(tester.testMyClassWithComparator(sorters1));


	}

}




