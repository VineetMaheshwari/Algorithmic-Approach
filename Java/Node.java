public class Node {
	public int value;
	public Node next;
	public Node(int val,Node next) {
		value=val;
		this.next=next;
	}
	public Node() {
		value=0;
		next=null;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int n) {
		value=n;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node n) {
		next=n;
	}
}
