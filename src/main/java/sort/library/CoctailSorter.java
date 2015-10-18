package sort.library;

import java.util.Comparator;

public class CoctailSorter<T extends Comparable<T>> implements Sorter<T> {

	public T[] sort(T[] array) {
		int leftMark = 1;
		int rightMark = array.length - 1;
		while (leftMark <= rightMark) {
			for (int i = rightMark; i >= leftMark; i--) {
				if (array[i - 1].compareTo(array[i]) > 0) {
					swap(array, i, i - 1);
				}
			}
			leftMark++;

			for (int i = leftMark; i <= rightMark; i++) {
				if (array[i - 1].compareTo(array[i]) > 0) {
					swap(array, i, i - 1);
				}
			}
			rightMark--;
		}

		return array;
	}

	@Override
	public T[] sort(T[] array, Comparator<T> comparator) {
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
