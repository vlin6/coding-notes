public interface StackADT<T> {

	public void push(T item);
	public T pop();
	public boolean isEmpty();
}