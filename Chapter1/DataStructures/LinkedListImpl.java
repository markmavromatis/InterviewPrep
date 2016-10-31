package org.markmavromatis;


// Implement a linked list

// Linked list is a forward looking data structure
// Consists of a Node and a link to the next node.
// Keep a pointer to the first (head) node
public class LinkedListImpl {

	public class LinkedListNode {
		String data;
		LinkedListNode next;

		public LinkedListNode(String data) {
			this.data = data;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public LinkedListNode getNext() {
			return next;
		}

		public void setNext(LinkedListNode next) {
			this.next = next;
		}

	}

	private LinkedListNode head;

	public LinkedListNode addNode(String data) {
		LinkedListNode returnNode = null;
		if (head == null) {
			head = new LinkedListNode(data);
			returnNode = head;
		} else {
			LinkedListNode previousNode = head;
			while (previousNode.next != null) {
				previousNode = previousNode.next;
			}
			previousNode.next = new LinkedListNode(data);
			returnNode = previousNode.next;
		}
			
		return returnNode;
	}	

	public void updateNode(LinkedListNode node, String data) {
		node.setData(data);
	}

	public LinkedListNode insertNode(LinkedListNode newNode, LinkedListNode insertNode) {
		// Is this the head node?
		if (insertNode == head) {
			newNode.setNext(head);
			head = newNode;		
		} else {
			// Find previous node
			LinkedListNode previousNode = head;
			while (previousNode.getNext() != insertNode) {
				previousNode = previousNode.getNext();
			}
			// Update previous node next pointer
			previousNode.setNext(newNode);
			// Update new node next pointer
			newNode.setNext(insertNode);
		}
		return newNode;
	}

	public void deleteNode(LinkedListNode nodeToDelete) {
		// Get previous node
		// Reset previous node next pointer to following node
		// 'Delete' node
		LinkedListNode previousNode = head;
		while (previousNode.getNext() != nodeToDelete) {
			previousNode = previousNode.getNext();
		}
		previousNode.setNext(nodeToDelete.getNext());
		nodeToDelete = null;

	}

	public LinkedListNode getHead() {
		return head;
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
			
		LinkedListImpl impl = new LinkedListImpl();
		LinkedListNode newNode = impl.addNode("a");
		LinkedListNode head = impl.getHead();
		System.out.println("Head node is now:" + head.getData());

		LinkedListImpl impl2 = new LinkedListImpl();
		impl2.addNode("a");
		impl2.addNode("b");
		impl2.addNode("c");
		LinkedListNode impl2Head = impl2.getHead();
		LinkedListNode impl2Node = impl2Head;
		while (impl2Node != null) {
			System.out.println(impl2Node.getData());
			impl2Node = impl2Node.getNext();
		}

		System.out.println("\nInsert test");
		LinkedListImpl impl3 = new LinkedListImpl();
		impl3.addNode("z");
		impl3.insertNode(impl3.new LinkedListNode("y"), impl3.getHead());
		impl3.insertNode(impl3.new LinkedListNode("x"), impl3.getHead());
		LinkedListNode impl3Node = impl3.getHead();
		while (impl3Node != null) {
			System.out.println(impl3Node.getData());
			impl3Node = impl3Node.getNext();
		}

		System.out.println("\nDelete test");
		LinkedListImpl impl4 = new LinkedListImpl();
		impl4.addNode("z");
		impl4.insertNode(impl4.new LinkedListNode("y"), impl4.getHead());
		impl4.insertNode(impl4.new LinkedListNode("x"), impl4.getHead());
		LinkedListNode impl4Node = impl4.getHead();
		impl4.deleteNode(impl4Node.getNext());
		while (impl4Node != null) {
			System.out.println(impl4Node.getData());
			impl4Node = impl4Node.getNext();
		}
	

	}

}

