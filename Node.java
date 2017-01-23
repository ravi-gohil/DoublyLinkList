
public class Node {
	private int data;
	private Node next, prev;
	
	public Node(){
		next = null;
		prev = null;
		data = 0;
	}
	
	public Node(int d, Node n, Node p){
		data = d;
		next = n;
		prev = p;
	}
	
	public void setLinkNext(Node n){
		next = n;
	}
	
	public void setLinkPrev(Node p){
		next = p;
	}
	
	public void setData(int d){
		data = d;
	}
	
	public Node getlinkNext(){
		return next;
	}
	
	public Node getlinkPrev(){
		return prev;
	}
	
	public int getData(){
		return data;
	}
	
}
