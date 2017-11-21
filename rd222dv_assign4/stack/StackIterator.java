package rd222dv_assign4.stack;

import java.util.Iterator;

public class StackIterator implements Iterator<Object> {

	private int nextElement = 0; // first element at start
	private final Object[] elements;
	private final int max; // final element in array

	public StackIterator(Object[] array, int size) {
		elements = array;
		max = size;
	}

	public boolean hasNext() {
		return nextElement < max;
	}

	public Object next() {
		return elements[nextElement++]; // Pick out and increase
	}
}
