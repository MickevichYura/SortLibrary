package sort.library;

import java.util.Comparator;

public interface Sorter<T extends Comparable<T>> {

	T[] sort(T[] array);

	T[] sort(T[] array, Comparator<T> comparator);

	default void swap(T[] x, int a, int b) {
		T t = x[a];
		x[a] = x[b];
		x[b] = t;
	}
}
