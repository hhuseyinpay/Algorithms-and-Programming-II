import javax.xml.transform.Templates;

public class MLL {

	CategoryNode head;
	CategoryNode tmp;

	public MLL(int category) {
		head = new CategoryNode(0);
		tmp = head;
		for (int i = 1; i < category; i++) {
			tmp.setDown(new CategoryNode(i));
			tmp = tmp.getDown();
		}
	}

	public void insert(int number) {
		if (head == null)
			System.out.println("Add a Category before Item");
		else {
			CategoryNode tempD = head;
			for (int i = 1; i <= number % 7; i++) {
				tempD = tempD.getDown();
			}
			if (tempD.getRight() != null) {
				ItemNode tempR = tempD.getRight();
				while (tempR.getNext() != null) {
					tempR = tempR.getNext();
				}
				tempR.setNext(new ItemNode(number));
			}
			else {
				tempD.setRight(new ItemNode(number));
			}

		}
	}

	public void display() {
		if (head == null)
			System.out.println("linked list is empty");
		else {
			CategoryNode temp = head;
			int counter = 0;
			while (temp != null) {
				System.out.print(counter + " --> ");
				ItemNode temp2 = temp.getRight();
				while (temp2 != null) {
					System.out.print(temp2.getNumber() + " ");
					temp2 = temp2.getNext();
				}
				temp = temp.getDown();
				System.out.println();
				counter++;
			}

		}
	}
}
