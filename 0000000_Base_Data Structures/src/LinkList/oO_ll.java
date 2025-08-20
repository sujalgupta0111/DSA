package LinkList;

//operations of link list
public class oO_ll {

	node head;
	int size = 0;

	/**************************** Add node*********************************************/
	public void addnewnode(int add) {
		size++;
		node nayi = new node(add);

		if (head == null) {
			head = nayi;

		} else {

			node temp = head;
			while (temp.next != null) {

				temp = temp.next;
			}
			/* temp.pre= temp; */ // if want to add previous nodes
			temp.next = nayi;
		}

	}

	/************************** print node *******************************/
	public void print() {
		node temp = head;
		while (temp != null) {
			temp.dp();

			// System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/************************** delete node at last *******************************/
	public void dellast() {
		--size;
		node temp = head;

		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		System.out.println("Delete Last NOde Sucessfully");

	}

	/************************** delete node at mid *******************************/

	public void delmid(int position) {
		if (position > size || position < 1) {
			System.out.println("Please enter valid position");
		}
		node temp = head;
		int nu = position;

		for (int i =0 ; i<position-1;i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
		System.out.println("Delete  NOde  at position " + nu + "Sucessfully");

	}

	/*************************** * delete node at begin *******************************/
	public void delbig() {
		--size;
		if (head == null) {
			System.out.println("Link list is empty");
			return;
		}
		head = head.next;

	}
	/*************************** insert node at start*******************************/
	
	public void insertbeg(int data)
	{
		size++;
		node nayi = new node(data);
		nayi.next= head;
        head = nayi;
				
	}

	/************************** insert node at last *******************************/
	public void insertlast(int data)
	{
		size++;
		node nayi = new node(data);
		node temp = head;
		while(temp.next!=null)
		{
			temp= temp.next;
		}
		temp.next=nayi;
		
				
	}
	/************************** insert node at mid *******************************/
	public void insertmid(int postion ,int data)
	{
		if(postion>size ||postion<=0)
		{System.out.println("Please enter valid position");}
		size++;
		node nayi = new node(data);
		node temp = head;
		
		for (int i =0 ; i<postion-1;i++)
		{
			temp = temp.next;
		}
		
		nayi.next = temp.next.next;
		temp.next= nayi;
		
		
				
	}
	

}
