
public class CustomizedNode {

	CustomizedNode nextNode;
	int data;

	CustomizedNode(int data) {
		this.data = data;
		nextNode = null;
	}

	public CustomizedNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(CustomizedNode nextNode) {
		this.nextNode = nextNode;
	}

	public Object getData() {
		return data;
	}

	public void setObject(int data) {
		this.data = data;

	}

}
