package sort.library;

import java.util.Comparator;

public class SelectionSorter<T extends Comparable<T>> implements Sorter<T> {

	public T[] sort(T[] array) {	
		int length = array.length;

		for (int i = 0; i < length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < length; j++) {
				if (array[j].compareTo(array[min]) < 0) {
					min = j;
				}
			}

			if (min != i) {
				swap(array, i, min);
			}
		}

		return array;
	}

	@Override
	public T[] sort(T[] array, Comparator<T> comparator) {
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
