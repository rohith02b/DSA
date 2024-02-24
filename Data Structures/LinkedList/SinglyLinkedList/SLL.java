class SLL {
	public Node head;
	public int size;
	
	public SLL() {
		head = new Node(0,null);
		size = 0;	
	}


	// O(n)
	public void insertNodeAtEnd(int value) {

		try{
			// If LinkedList is empty
			if(size == 0) {
				Node node = new Node(value,null);
				this.head.next = node;
				size++;
			}
			// If linkedList is not empty
			else {
				Node cur = new Node(0,head.next);
				while(cur.next != null) {
					cur = cur.next;
				}

				Node node = new Node(value,null);
				cur.next = node;
				size++;
			}
		}
		catch(Exception e) {
			System.out.println("Memory error");
		}
	}


	// O(1)
	public void insertNodeAtStart(int value) {
		try {
			Node firstNode = this.head.next;
			Node node = new Node(value,firstNode);
			this.head.next = node;
			size++;
		}
		catch(Exception e) {
			System.out.println("Memory Error");
		}
	}

	public void display() {

		if(size == 0) {
			System.out.println("Linked list is empty");
			return;
		}
		Node cur = this.head.next;
		while(cur != null) {
			System.out.print(cur.value + " -> ");
			cur = cur.next;
		}
	}
}
