public class MyList<A> {
	protected Node<A> head = null;
	
	public boolean isEmpty() {
		return head == null;
	}

	protected class Node<A> {
		private A val;
		private Node<A> next = null; 

		Node(A v, Node<A> l) {
			val = v;
			next = l;
		}

		public A getValue()
		{
			return val;
		}

		public Node<A> getNext()
		{
			return next;
		}

		public void setNext(Node<A> n)
		{
			next = n;
		}
	}

	public int size()
	{
		Node<A> node = head;
		int count = 0;
		
		while (node != null)
		{
			count++;
			node = node.getNext();
		}

		return count;
	}

	private Node<A> getNode(int index)
	{
		int counter = 0;
		Node<A> currentNode = head;

		for (int i = 0; i < index; i++)
		{
			currentNode = currentNode.getNext();

			if (currentNode == null)
				throw new IndexOutOfBoundsException();
		}
		
		return currentNode;
	}

	public A get(int index)
	{
		return getNode(index).getValue();
	}
	
	public void addFirst(A n)
	{
		head = new Node<A>(n, head);	
	}

	public A removeFirst()
	{
		Node<A> first = head;
		head = head.getNext();	
		return first.getValue();
	}

	public void addLast(A n)
	{
		Node<A> last = getNode(size() - 1);
		last.setNext(new Node<A>(n, null));
	}

	public A removeLast()
	{
		int size = size();
		A value = null;

		if (size == 1)
			head = null;
		else if (size > 1) 
		{
			Node<A> secondLast = getNode(size() - 2);
			value = secondLast.getNext().getValue();
			secondLast.setNext(null);
		}

		return value;
	}
	
	public void enqueue(A n)
	{
		addLast(n);	
	}

	public A dequeue()
	{
		return removeFirst();
	}




}
