
public class Node {

	private Object data;
	private Node next;

	Node(Object dataToAdd){
		data = dataToAdd;
		next = null;		
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node pointer) {
		this.next = pointer;
	}
	
	
	
	
	
}
