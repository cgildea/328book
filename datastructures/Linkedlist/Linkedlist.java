public class Linkedlist{
	/*
		inner class, to represent our nodes
	*/
	private class Node{
		public int data;
		public Node next;
		public String toString(){
			Integer d = (Integer) data;
			return d.toString();
		}
	}
	//the data member
	private Node head;
	//default 
	public Linkedlist(){
		head = null;
	}
	public Linkedlist(int val){
		this.head= new Node();
		this.head.data = val;
		this.head.next = null;
	}
	public Linkedlist(Node n){
		this.head = n;
	}
	//shallow copy
	public Linkedlist(Linkedlist a){
		this.head = a.head;
	}
	//needs work
	public Linkedlist clone(){
		Linkedlist a = new Linkedlist();
		return a;
	}
	public String toString(){
		Node n = this.head;
		String out = "";
		while(n != null){
			out = out+ " "+n.toString();
			n = n.next;
		}
		out += " null";
		return out;
	}

	public int compareTo(){
		return 0;
	}
	public int size(){
		Node n = this.head;
		int i = 0;
		while(n != null){
			i++;
			n = n.next;
		}
		return i;
	}
	public void insertAtFront(int val){
		Node insert = new Node();
		insert.data = val;
		insert.next = this.head;
		this.head = insert;
	}
	public void insertNode(int position, int val){
		if(position> this.size() || position < 0){
			System.out.println("Error: You can't place a node there");
			return;
		}
		Node n = this.head;
		if(position==0){
			insertAtFront(val);
			return;
		}
		while(position> 1){
			n = n.next;
			position--;
		}
		Node toInsert = new Node();
		toInsert.data = val;
		toInsert.next = n.next;
		n.next = toInsert;
	}
	private int findKFromEnd(int [] info){
		//until you are at the end, go there
		while(this.head.next != null){
			Linkedlist n = new Linkedlist(this.head.next);
			n.findKFromEnd(info);
		}
		//decrement this counter

	}
	private class IntWrapper{
		private int value;
		public IntWrapper(){
			value = 0;
		}
		public IntWrapper(int v){
			value = v;
		}
		public void setValue(int v){
			this.value =  v;
		}
		public int getValue(){
			return this.value;
		}
	}
	public int findKFromEnd(IntWrapper distance){
		if (this.head.next != null){
			Linkedlist n = new LinkedLIst(this.head.next);
		}
		int kFromEnd = n.findKFromEnd(distance);
		if(distance.getValue() > 0){
			distance.setValue(distance.getValue() - 1);
			return 0;
		}
		else if (distance.getValue() == 0{
			distance.setValue(distance.getValue() - 1);
			return this.head.data;	
		}
		else return kFromEnd;

	}
	public int findKFromEnd(int distFromEnd){
		return this.findKFromEnd(new IntWrapper(distFromEnd));
	}
}