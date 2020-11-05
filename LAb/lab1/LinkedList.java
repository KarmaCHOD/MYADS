public class LinkedList{
	Node head;
	Node tail;
	int size;

	public LinkedList(){
		head = null;
		tail = null;
		size = 0;
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if (size == 0) {
			return true;
		}
		return false;