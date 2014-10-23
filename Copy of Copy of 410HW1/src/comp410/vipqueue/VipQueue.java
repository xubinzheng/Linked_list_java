package comp410.vipqueue;

public class VipQueue<C> {
	private Node<C> listHead;
	private Node<C> listTail;
	
	private class Node<C> {
		C data;
		Node<C> next;
		public Node(C d) {
			data = d;		
		}
	}
	
	public VipQueue(){
		listHead=null;
	}
	
	public boolean isEmpty(){
		return (listHead==null);
	}
	
	public C peek(){
		if(listTail != null){
    		return(listTail.data);
    	}else{
    		throw new RuntimeException("Stack tail is null.");
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
	
	public void enqueue(C element){
		Node<C> newNode = new Node<C>(element);
		if (isEmpty()) {
			listHead = listTail = newNode;
		} else {		
			listTail.next = newNode;
			listTail = newNode;	
		}
	}
	
	public void vipEnqueue(C element){
		Node<C> newNode = new Node<C>(element);
        newNode.next = listHead;
        listHead = newNode;
	}

}
