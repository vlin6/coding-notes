public class Stack<T> implements StackADT<T> { //for a stack
	private T[] backend; //just remember that for an array as backend
	private int size; //you just need T[] and int as instance variables to manipulate everythiing else.

	//whereas for queue you need front and back as well, since you enqueue from front, dequeue from the back.
	public Stack() {
		backend = (T[]) new Object[100];
		size = 0;
	}
	public void push(T item) {
		if (size == backend.length) {
			throw new java.lang.RuntimeException("Array is full!");
		} else { //you'll be incrementing size and using size as your index
			//so depending on where you increment
			backend[size] = item; //you may have to substract 1 for you index.
			size++;
			//for personal preference, I let size 'catch up' to the operation.
		}
	}
	public T pop() {
		if (isEmpty()) {
			throw new java.util.EmptyStackException();
		} else {
			T result = backend[size-1]; //pay attention to the size and using size as index relation
			backend[size-1] = null; //you'll have to -1 to get the top of the stack, if you're using size.
			size--;
			return result;
		}
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void printAll() {
		System.out.print("Top: " );
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(backend[i] + " ");
		}
		System.out.println();
	}
}