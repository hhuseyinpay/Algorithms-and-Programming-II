
public class ItemNode {
		private int number;
		private ItemNode next;
		
		public ItemNode(int data)
		{
			number= data;
			next=null;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public ItemNode getNext() {
			return next;
		}

		public void setNext(ItemNode next) {
			this.next = next;
		}
		
	

}
