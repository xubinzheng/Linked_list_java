package comp410.vipqueue;

public class Queue<C> {
	private Node<C> listHead;
	private Node<C> listTail;

	private class Node<C> {
		C data;
		Node<C> next;
		public Node(C d) {
			data = d;	
		}
	}
	public Queue(){
		listHead=null;
	}

	public void enqueue(C d) {
		Node<C> newNode = new Node<C>(d);
		if (isEmpty()) {
			listHead = listTail = newNode;
		} else {
			
			listTail.next = newNode;
			listTail = newNode;	
		}
	}
	
	public C dequeue(){
		C data = listHead.data;
		if (listHead != null){
			listHead = listHead.next;	
		}else{
			listHead = listTail = null;
		}
		return data;
	}
	
	public C peek(){
		if(listTail != null){
    		return(listTail.data);
    	}else{
    		throw new RuntimeException("Stack tail is null.");
    	}
	}
	
	public boolean isEmpty() {
		return (listHead == null);
		
	}
	
	public C watch(){
		return listHead.next.next.next.next.data;
	}
	
}
