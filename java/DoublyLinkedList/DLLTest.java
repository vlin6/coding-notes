public class DLLTest {
	public static void main(String[] args) {
		DoublyLinkedList a = new DoublyLinkedList();
		a.addToFront("5");
		a.addToFront("4");
		a.addToFront("3");
		a.addToFront("2");
		a.addToFront("1");
		a.printAll();

		//Test 1 - head removal
	/*	a.removeFirstOccurrence("1");
		a.printAll();*/

		//Test 2 - tail removal
		a.removeFirstOccurrence("5");
		a.printAll();

		//Test 3 - general removal
	/*	a.removeFirstOccurrence("1");
		a.printAll();*/

		//Test 4 - no removal
	/*	a.removeFirstOccurrence("1");
		a.printAll();*/

		//Test 5 - empty
	/*	a.removeFirstOccurrence("1");
		a.printAll();*/
	}
}