
public class SLL {

	private Node head;

	public Node getHead() {
		return head;
	}

	public void add(Object data) {

		if (head == null) {

			Node newNode = new Node(data);
			head = newNode;

		}

		else {

			Node temp = head;

			while (temp.getNext() != null)
				temp = temp.getNext();

			Node newNode = new Node(data);
			temp.setNext(newNode);

		}
	}

	public void display() {

		Node temp = head;

		while (temp != null) {

			System.out.print(temp.getData() + " ");
			temp = temp.getNext();

		}

	}

	public int size() {

		int counter = 0;

		Node temp = head;

		while (temp != null) {

			counter++;
			temp = temp.getNext();

		}

		return counter;

	}

	public void remove(Object data) {

		if (head == data) {
			head = head.getNext();
		}

		Node temp = head;
		Node p = null;

		while (temp != null) {

			if (temp.getNext() == data) {
				p = temp.getNext();
				temp.setNext(p.getNext());
			}

			temp = temp.getNext();

		}

	}

}
