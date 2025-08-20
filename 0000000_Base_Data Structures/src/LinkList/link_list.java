package LinkList;

public class link_list {

	public static void main(String[] args) {
		oO_ll a = new oO_ll();
		a.addnewnode(1);
		a.addnewnode(16);
		a.addnewnode(11);
		a.addnewnode(13);
		a.addnewnode(14);
		a.addnewnode(12);
		a.insertmid(2,6);
		a.print();
     
      
       System.out.println(a.size);
	}

}
