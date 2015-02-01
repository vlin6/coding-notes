import java.lang.Iterable; //classes are capitalized
import java.util.Iterator;

public class IterableDoublyLinkedList extends DoublyLinkedList implements Iterable<String> {
	public Iterator<String> iterator() { //beguiling, this is not a constructor, this is a getter method for this instance's iterator
		// so, it returns an Iterator class.
		return new DoublyLinkedListIterator(this); //so, write your code accordingly.
		//*we pass in /this/ because we want the iterator for a /particular instance/ of linked list.
	}
	private class DoublyLinkedListIterator implements Iterator<String> {//don't forget the iterator must implement the Iterator interface
		Node curNode;
		//set up your constructor for hasNext. typically, we're forward looking; keep in mind what that means.
		//it's like, we're 'peeking' into the future.
		//the iterator will take in the class, so we can play with it.
		private DoublyLinkedListIterator(IterableDoublyLinkedList dll) {//private constructor for private inner class.
			curNode = dll.head;
		}

		//write the hasNext method first, because you'll need it in next.
		public boolean hasNext() { //public, beause you'll call this from main.
			return curNode != null; //this is the forward looking component. we're already 'at the next'. think what this means.
		}

		//the reason why we specify generics is because we return that type in next().
		public String next() {
			if (hasNext()) {
				Node retNode = curNode;
				curNode = curNode.next;
				return retNode.data;
			} else {
				throw new java.util.NoSuchElementException("There's no such element!"); //don't forget you're throwing a class,
				//so you need the 'new' modifier
			}
		}
	}

}