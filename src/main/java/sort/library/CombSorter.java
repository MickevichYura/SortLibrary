package sort.library;

import java.util.Comparator;

public class CombSorter<T extends Comparable<T>> implements Sorter<T> {

	@Override
	public T[] sort(T[] array) {

		T[] sortArray = combSort(array, new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				return o1.compareTo(o2);
			}
		});

		return sortArray;
	}

	@Override
	public T[] sort(T[] array, Comparator<T> comparator) {

		T[] sortArray = combSort(array, comparator);

		return sortArray;
	}

	private T[] combSort(T[] array, Comparator<T> comparator) {
		double shrink = 1.247330950103979;
		int gap = array.length;
		boolean swapped = true;
		while (gap > 1 || swapped) {
			if (gap > 1)
				gap = (int) (gap / shrink);

			int i = 0;
			swapped = false;
			while (i + gap < array.length) {
				if (comparator.compare(array[i], array[i + gap]) > 0) {
					swap(array, i, i + gap);

					swapped = true;
				}
				i++;
			}

		}
		return array;
	}

}
