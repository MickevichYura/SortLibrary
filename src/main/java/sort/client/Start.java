package sort.client;

import java.util.ArrayList;
import java.util.List;

import sort.library.CombSorter;
import sort.library.SelectionSorter;
import sort.library.CoctailSorter;
import sort.library.Sorter;
import sort.library.test.Tester;

public class Start {
	
	public static void main(String[] args) {

		List<Sorter<Integer>> sorters = new ArrayList<>();
		sorters.add(new SelectionSorter<Integer>());
		sorters.add(new CombSorter<Integer>());
		sorters.add(new CoctailSorter<Integer>());

		System.out.println(new Tester().testSorters(sorters, 10000));

	}

}
