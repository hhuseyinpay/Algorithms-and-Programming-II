
public class CategoryNode {
 
	private int name;
	private CategoryNode down;
	private ItemNode right;
	
	public CategoryNode(int name)
	{
		this.name=name;
		down=null;
		right=null;
	}

	public int getName() {
		return name;
	}

	public CategoryNode getDown() {
		return down;
	}

	public void setDown(CategoryNode down) {
		this.down = down;
	}

	public ItemNode getRight() {
		return right;
	}

	public void setRight(ItemNode right) {
		this.right = right;
	}
	
}
