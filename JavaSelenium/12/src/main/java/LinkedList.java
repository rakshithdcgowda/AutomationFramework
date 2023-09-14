
public class LinkedList {
	
private Node head;
private Node tail;
private int length;
		
	class Node{
		int value;
		Node next;
		
		Node(int value)
		{
			this.value=value;
		}
	}
	
	public LinkedList(int value)
	{
		Node newNode=new Node(value);
	}
	
	
	public void insertFirst(int value)
	{
		Node newNode=new Node(value);
		if(length==0)
		{
			head=newNode;
			tail=newNode;
		}else {
			//Node temp=head;
			newNode.next=head;
			head=newNode;
		}
	}
	
	

}
