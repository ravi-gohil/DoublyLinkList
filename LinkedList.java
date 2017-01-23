
public class LinkedList {

	private Node start;
	private Node end;
	public int size;
	
	public LinkedList(){
		start = null;
		end  = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return start == null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void insertAtStart(int val){
		Node nptr = new Node(val, null, null);
		size++;
		if(start == null)
		{
			start = nptr;
			end = start;
		}
		else
		{
			start.setLinkPrev(nptr);
			nptr.setLinkNext(start);
			start = nptr;
		}
	}
	
	public void insertAtEnd(int val){
		Node nptr = new Node(val, null, null);
		if(start == null)
		{
			start = nptr;
			end = start;
		}
		else
		{
			end.setLinkPrev(end);
			end.setLinkNext(nptr);
			end = nptr;
		}
		size++;
	}
	
	public void insertAtPos(int val, int pos){
		Node nptr = new Node(val, null, null);
		if (pos == 1)
		{
			 insertAtStart(val);
			 return;
		}
		Node ptr = start;
		pos = pos - 1;
		for (int i = 2 ; i<= size; i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.getlinkNext();
				ptr.setLinkNext(nptr);
				nptr.setLinkPrev(ptr);
				nptr.setLinkNext(tmp);
				tmp.setLinkPrev(nptr);
			}
			ptr = ptr.getlinkNext();
		}
		size++;
	}
	
	public void deleteAtPos(int pos){
		if (pos == 1)
		{
			if(size == 1)
			{
				start = null;
				end = null;
				size =0;
				return;
			}
			start =start.getlinkNext();
			start.setLinkPrev(null);
			size--;
			return;
		}
		
		if (pos == size)
		{
			end = end.getlinkPrev();
			end.setLinkNext(null);
			size--;
		}
		
		Node ptr = start.getlinkNext();
		
		for (int i = 2; i<= size; i++)
		{
			if(i == pos)
			{
				Node p = ptr.getlinkPrev();
				Node n = ptr.getlinkNext();
				p.setLinkNext(n);
				n.setLinkPrev(p);
				size--;
				return;
			}
			ptr = ptr.getlinkNext();
		}
		
	}
	
	public void display(){
		System.out.println("Doubly Linke List");
		
		if(size == 0)
		{
			System.out.println("Empty");
			return;
		}
		
		if(start.getlinkNext() == null)
		{
			System.out.println(start.getData());
			return ;
		}
		
		Node ptr = start;
		System.out.print(start.getData()+"<->");
		ptr = start.getlinkNext();
		while (ptr.getlinkNext() != null)
		{
			System.out.print(ptr.getData()+"<->");
			ptr  = ptr.getlinkNext();
		}
		System.out.print(ptr.getData());
	}
}
