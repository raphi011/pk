import java.util.Iterator;

public class MyList<A> implements Iterable<A> {

	private Node head = null;

	public Iterator<A> iterator() {
		return new MyListIterator();
	}

	public void add(A a) {
		Node n = new Node(a, null, this.head);
		
		if (this.head != null)
			this.head.previous = n;
		
		this.head = n;
	}

	private class Node {
		A value;
		Node previous;
		Node next;

		Node(A value, Node previous, Node next) {
			this.value = value;
			this.previous = previous;
			this.next = next;
		}
	}

	private class MyListIterator implements Iterator<A> {

		private Node currentNode;

		public MyListIterator() {
			currentNode = head;
		}

		public boolean hasNext() {
			return currentNode != null;	
		}

		public A next() {
			Node node = currentNode;
			currentNode = currentNode.next;
			return node.value;
		}

		public void remove() {
			
			Node nodeToDelete = currentNode.previous;
			
			if (nodeToDelete.previous != null)
			{	
				currentNode = nodeToDelete.previous;
				currentNode.next = nodeToDelete.next;
				currentNode.next.previous = currentNode;
			}
			else 
			{
				currentNode.previous = null;
				head = currentNode;
			}
		}
	}
}
