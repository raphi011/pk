import java.util.Iterator;

public class MyList<A> implements Iterable<A> {

	private Node head = null;

	private class Node {
		A value;
		Node next;
		Node previous;

		Node(A value, Node next, Node previous) {
			this.value = value;
			this.next = next;
			this.previous = previous;
		}
	}

	public Iterator<A> iterator() {
		return new MyListIterator();
	}

	private class MyListIterator implements Iterator {

		private Node currentNode;

		public MyListIterator() {
		
			currentNode = head;
		}

		public boolean hasNext() {
			return currentNode.next != null;	
		}

		public A next() {
		
			Node node = currentNode;
			currentNode = currentNode.next;
			return node.value;
		}

		public void remove() {

			if (currentNode.previous != null)
			{	
				Node nodeToDelete = currentNode;
				currentNode = nodeToDelete.previous;
				currentNode.next = nodeToDelete.next;
				currentNode.next.previous = currentNode;
			}
			else 
			{
				currentNode = currentNode.next;
				currentNode.previous = null;
			}
		}

	
	
	}

	public void add(A a) {
		Node n = new Node(a, this.head, null);
		this.head.previous = n;
		this.head = n;
	}
		
}
