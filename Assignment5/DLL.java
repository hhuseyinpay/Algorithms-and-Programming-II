
public class DLL {

	private Node head;
	private Node tail;

	public DLL() {
		head = null;
		tail = null;
	}

	public void insert(int data)
	{
		Node node = new Node(data);
		if (head == null && tail == null) {
			head = node;
			tail = node;
		} else if (data % 2 == 1) {
			node.setNext(head);
			head.setPrev(node);
			head = node;
		} else if (data % 2 == 0) {
			node.setPrev(tail);
			tail.setNext(node);
			tail = node;
		}
	}

	public void display()
	{
		if (head == null) {
			System.out.println("Linked list is empty!");
		} else {
			Node temp = tail;
			while (temp != null) {
				System.out.print(temp.getData()+ " ");
				temp = temp.getPrev();
			}
		}
	}

}
