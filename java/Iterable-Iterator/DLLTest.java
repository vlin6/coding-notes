public class DLLTest {
	public static void main(String[] args) {
		IterableDoublyLinkedList a = new IterableDoublyLinkedList();
		a.addToFront("5");
		a.addToFront("4");
		a.addToFront("3");
		a.addToFront("2");
		a.addToFront("1");
		for (String data: a) {
			System.out.println(data); //you should print data, not a
			// data is the string, after all. not sure why I was confused.
		}
	}
}