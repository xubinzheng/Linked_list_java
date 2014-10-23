package comp410.vipqueue;

public class Stack<C> {
	private Node<C> listHead;
	
	private class Node<C> {
		C data;
		Node<C> next;
		public Node(C d) {
			data = d;		
		}
	}
	
	public Stack(){
		listHead=null;	
	}
	
	public void push(C d){
		Node<C> newNode = new Node<C>(d);
        newNode.next = listHead;
        listHead = newNode;
	}
	
	public C pop(){
		C data = listHead.data;
		if (listHead != null){
			listHead = listHead.next;	
		}else{
			listHead =  null;
		}
		return data;
	}
	
	public C peek(){
    	Node<C> current = listHead;
    	Node<C> temp = current;
        while(current != null){
            current = current.next;   
        } return temp.data;
	}
	
	public boolean isEmpty(){
		 return (listHead==null);
	}
	
	public C watch(){
		return listHead.next.next.data;
	}

}
