import java.util.LinkedList;

public class LinkedListFindMidEle {

	public static void main(String[] args) {
		class Node {
			int data;
			Node next;

			Node(int d) {
				data = d;
				next = null;
			}

			void setNext(Node next) {
				this.next = next;
			}

			Node getNext() {
				return next;
			}
		}
		LinkedList<Node> linkedList = new LinkedList<Node>();
		Node before = new Node(1);
		linkedList.add(before);
		Node after = new Node(2);
		linkedList.add(after);
		before.next = after;
		for (int i = 3; i <= 10; i++) {
			before = after;
			after = new Node(i);
			linkedList.add(after);
			before.next = after;
		}

		boolean isAdvance = false;
		Node mid = linkedList.getFirst();

		for (Node n : linkedList) {
			System.out.println(mid.data + " " + n.data + " " + isAdvance);
			if (n.next != null) {

				mid = isAdvance ? mid.next : mid;
				isAdvance = !isAdvance;
			}

		}
		// Node fast = linkedList.peekFirst();
		// Node slow = linkedList.peekFirst();
		// while (slow.next != null && fast.next.next != null) {
		// slow = slow.next;
		// fast = fast.next.next;
		// }
		// System.out.println(slow.data);
	}

}
