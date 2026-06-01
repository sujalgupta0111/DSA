package A_2_LinkedList.SinglyLinkedList;

public class SLLNode<T extends Object> {
	private T data;
	private SLLNode next;
	private int sizeofLinkedlist;
	private SLLNode head;

	public SLLNode(T data) {
		this.data = data;
	}

	public void add(T data) {
		if(head==null) {
			head = new SLLNode<T>(data);
			sizeofLinkedlist++;
		}else {
			SLLNode<T>	newNode = new SLLNode<T>(data);
			SLLNode temp = head;
			while(temp.next!=null) {
				temp= temp.next;
			}
			temp.next=newNode;
			sizeofLinkedlist++;
			}
	}
	public void print() {
		SLLNode node =head;
		
		
	}

}
