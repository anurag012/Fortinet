package reverseList;

public class ReverseLinkedList {

	public Node reverseList(Node head) {

		boolean hasCycle = detectCycle(head);
		if(hasCycle) {
			return head;
		}else {
		Node previous = null;
		Node current = head;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
		}
	}

	private boolean detectCycle(Node head) {
		Node node1 = head;
	    Node node2 = head;
	    if(head == null){
	        return false;
	    }
	    while(node2 != null && node2.next != null){
	        node1 = node1.next;
	        node2 = node2.next.next;
	        if(node1 == node2){
	            return true;
	        }
	    }
	    return false;
	}

}

class Node{
	Node next;
	int value;
}
