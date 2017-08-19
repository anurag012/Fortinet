# Fortinet
**There are two solutions in this repository. One is to reverse linked list and other is factory design pattern.**
## Reverse a Linked List
The main logic to reverse a linked list is as follows.
```
public Node reverseList(Node head) {

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
  ```
  I have added another method to detect cycle if a circular list is given as input. It will return the same list if it has a cycle.
  
  ## Factory Design Pattern
  I have implemented two variants of factory design pattern. These variants are:
  
  **Creator being abstract and not providing implementation of factory method.**
  
  **Creator being concrete class and providing the implementaion of factory method.**
