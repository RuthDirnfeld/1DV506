package rd222dv_assign4.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackMethods implements Stack {

	private Object[] array;
	private int size = 0;
	int length = 8;

	public StackMethods() {
		array = new Object[length];
	}

	public void push(Object element) {
		if (size == array.length) {
			throw new IllegalStateException("Cannot add to full stack");
		}
		array[size++] = element;
	}

	public Object pop() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot pop from empty stack");
		}
		Object result = array[size - 1];
		array[--size] = null;
		return result;
	}

	public Object peek() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot peek into empty stack");
		}
		return array[size - 1];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public Iterator<Object> iterator() {
		return new StackIterator(array, size);
	}
}
