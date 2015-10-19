package sort.library;

import java.util.Comparator;

public class SelectionSorter<T extends Comparable<T>> implements Sorter<T> {

	@Override
	public T[] sort(T[] array) {

		T[] sortArray = selectonSort(array, new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				return o1.compareTo(o2);
			}
		});

		return sortArray;
	}

	@Override
	public T[] sort(T[] array, Comparator<T> comparator) {

		T[] sortArray = selectonSort(array, comparator);

		return sortArray;
	}

	
	private T[] selectonSort(T[] array, Comparator<T> comparator) {
		int length = array.length;

		for (int i = 0; i < length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < length; j++) {
				if (comparator.compare(array[j], array[min]) < 0) {
					min = j;
				}
			}

			if (min != i) {
				swap(array, i, min);
			}
		}

		return array;
	}

}
