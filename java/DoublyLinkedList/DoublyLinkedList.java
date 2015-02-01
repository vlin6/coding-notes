public class DoublyLinkedList {
	protected Node head;
	public void addToFront(String data) {
		//in the original, because of the lack of two cases, it was pretty much a singly linked list.
		//but, since the class name is DoublyLinkedList, I'm going to assume it was a code error and handle both cases.
		//draw it out if you don't see how it was necessary. essentially, if you only had *, the nodes following
		//head would have null in previous.
		if (head == null) {
			head = new Node(data, head, null); //*
		} else {
			head = new Node(data, head, null);
			head.next.previous = head;
		}
	}
	public void removeFirstOccurrence(String data) {
		Node firstOccurrence = findFirstOccurrence(data);
		System.out.println("We found a first occurrence:");
		System.out.println(firstOccurrence.data);

		//list remains unchanged if nothing is found
		if (firstOccurrence == head && firstOccurrence.next == null) { //checks case 1: size of 1, or both head and tail.
			head = null;
		} else if (firstOccurrence == head) {
			Node newHead = firstOccurrence.next;
			newHead.previous = null;
			head = newHead;
		} else if (firstOccurrence.next == null) {
			Node newTail = firstOccurrence.previous;
			newTail.next = null;
		} else {
			Node prevNode = firstOccurrence.previous;
			Node nextNode = firstOccurrence.next;
			prevNode.next = nextNode;
			nextNode.previous = prevNode;
		}
	}
	private Node findFirstOccurrence(String data) {
		Node cur = head;
		Node prev;
		while (cur != null && cur.data != data) { //just be cautious about what you're doing.
		//when writing a while loop, ask, what are we trying to achieve?
		//what condition reflects that?
		//and, what logical operator should we use to reflect that?
		//just be cautious. you used a || for the &&, previously.
			cur = cur.next;
		}
		return cur;
	}
	protected class Node {
		protected Node previous;
		protected Node next;
		protected String data;
		private Node(String data, Node next, Node previous) {
			this.data = data;
			this.next = next;
			this.previous = previous;
		}
	}
	public void printAll() {
		Node cur = head;
		System.out.println("Printing all elements in linked list:");
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		if (head != null) {
			System.out.println("head is: " + head.data);
		} else {
			System.out.println("head is: null");
		}
	}
}