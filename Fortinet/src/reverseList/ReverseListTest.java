package reverseList;
import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseListTest {

	// null => null
	@Test
	public void test1() {
		ReverseLinkedList list1 = new ReverseLinkedList();
		Node node1 = null;
		assertEquals(null, list1.reverseList(node1));
	}
	
	// 1->null => 1
	@Test
	public void test2() {
		ReverseLinkedList list2 = new ReverseLinkedList();
		Node node1 = new Node();
		node1.value = 1;
		node1.next = null;
		assertEquals("1",nodeToString(list2.reverseList(node1)));
	}
	
	//1->2->3->null => 3->2->1
	@Test
	public void test3() {
		ReverseLinkedList list3 = new ReverseLinkedList();
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		node1.value = 1;
		node2.value = 2;
		node3.value = 3;
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		assertEquals("321",nodeToString(list3.reverseList(node1)));
	}
	
	//-1 -> 2 -> 2 -> -1 ->null => -1 -> 2 -> 2 -> -1
	@Test
	public void test4() {
		ReverseLinkedList list3 = new ReverseLinkedList();
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		node1.value = -1;
		node2.value = 2;
		node3.value = 2;
		node4.value = -1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		assertEquals("-122-1",nodeToString(list3.reverseList(node1)));
		
	}
	
	//20 -> -2 -> 30 -> -15 -> null => -15 -> 30 -> -2 -> 20
	@Test
	public void test5() {
		ReverseLinkedList list3 = new ReverseLinkedList();
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		node1.value = 20;
		node2.value = -2;
		node3.value = 30;
		node4.value = -15;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		assertEquals("-1530-220",nodeToString(list3.reverseList(node1)));
		
	}
	
	//Integer.MIN_VALUE -> 0 -> Integer.MAX_VALUE => Integer.MAX_VALUE -> 0 -> Integer.MIN_VALUE
	@Test
	public void test6() {
		ReverseLinkedList list = new ReverseLinkedList();
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		node1.value = Integer.MIN_VALUE;
		node2.value = 0;
		node3.value = Integer.MAX_VALUE;
		node1.next = node2;
		node2.next = node3;
		assertEquals(Integer.MAX_VALUE+"0"+Integer.MIN_VALUE, nodeToString(list.reverseList(node1)));
	}
	
	// circular linked list
	@Test
	public void test7() {
		ReverseLinkedList list = new ReverseLinkedList();
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		node1.value = 1;
		node2.value = 2;
		node3.value = 3;
		node1.next = node2;
		node2.next = node3;
		node3.next = node1;
		assertEquals(node1, list.reverseList(node1));
	}
	
	// this method converts the reversed linked list values into a string so that it can be tested.
	public String nodeToString(Node node) {
		String res = "";
		while(node != null) {
			res += node.value;
			node = node.next;
		}
		return res;
	}
	

}
