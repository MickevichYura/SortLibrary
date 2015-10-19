package sort.library;

import java.util.Comparator;

public class CoctailSorter<T extends Comparable<T>> implements Sorter<T> {

	@Override
	public T[] sort(T[] array) {

		T[] sortArray = coctailSort(array, new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				return o1.compareTo(o2);
			}
		});

		return sortArray;
	}

	@Override
	public T[] sort(T[] array, Comparator<T> comparator) {

		T[] sortArray = coctailSort(array, comparator);

		return sortArray;
	}

	private T[] coctailSort(T[] array, Comparator<T> comparator) {
		int leftMark = 1;
		int rightMark = array.length - 1;
		while (leftMark <= rightMark) {
			for (int i = rightMark; i >= leftMark; i--) {
				if (comparator.compare(array[i - 1], array[i]) > 0) {
					swap(array, i, i - 1);
				}
			}
			leftMark++;

			for (int i = leftMark; i <= rightMark; i++) {
				if (comparator.compare(array[i - 1], array[i]) > 0) {
					swap(array, i, i - 1);
				}
			}
			rightMark--;
		}

		return array;
	}

}
