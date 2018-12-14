package com.naveen.datastructures;


 class Link {
	public int idata;
	public double ddata;
	public Link next;
	public Link(int id, double dd){
		this.idata=id;
		this.ddata=dd;
	}
	
	public void displayLink(){
		System.out.println( +idata  );
	}
 
 
}
public class LinkList {
private Link first;
	LinkList(){
	 first=null;
	}

	public void insertFirst(int id,double dd) {
		Link newLink= new Link(id,dd);
		newLink.next=first;
		first=newLink;
	}
	
	public Link find(int key){
		Link current=first;
		while(current.idata!=key){
			if(current.next==null)
				return null;
			else
				current=current.next;
		}
		return current;
	}
	
	public Link delete(int key){
		Link current =first;
		Link previous= first;
		while(current.idata!=key){
			if(current.next==null)
				return null;
			else{
				previous=current;
				current=current.next;
			}
			if(current==first){
				first=first.next;
			}
			
		}
		previous.next=current.next;
		return current;
	}
	
	public Link reverse(){
		Link firsttemp=null;
		Link lasttemp=null;
		Link current=first;
		while(current!=null){
			firsttemp=lasttemp;
			lasttemp=current;
			current=lasttemp.next;
			lasttemp.next= firsttemp;
			
			
			}
		
		first=lasttemp;
		return first;
	}
	public Link removeDuplicates(){
		Link current=first;
		while(current!=null){
		Link runner=current;
		while(runner.next!=null){
			if(runner.next.idata==current.idata){
				runner.next=runner.next.next;
			}else{
				runner=runner.next;
			}
		}
		current=current.next;	
		}
		return current;
	}
	
	//Removing the duplicates by using caching
	/*public Link removeDuplicates(){
		Link current=first;
		Link previous=null;
		Hashtable hashtable= new Hashtable();
		while(current!=null){
			if(hashtable.containsKey(current.idata)){
				previous.next=current.next;	
			}else{
				hashtable.put(current.idata, true);
				previous=current;
			}
			current=current.next;
		}
		return current;
	}*/
	
	
	
	public Link sortList(){
		Link firsttemp=null;
		Link lasttemp=null;
		Link current=first;
		while(current.next!=null){
			if(current.idata < current.next.idata) {
			firsttemp=lasttemp;
			lasttemp=current;
			current=lasttemp.next;
			lasttemp.next= lasttemp;
			
			}
			}
		
		first=lasttemp;
		return first;
	}

	public void countSize(){
		Link current=first;
		int count=0;
		while(current!=null){
			count+=1;
			current=current.next;
			
		}
		System.out.println("Size of the link List:"+count);
	}
	
	public void middleElement(){
		Link current = first;
	      int length = 0;
	      Link middle = first;
	    
	      while(current.next != null){
	          length++;
	          if(length%2 ==0){
	              middle = middle.next;
	          }
	          current = current.next;
	      }
	    
	      if(length%2 == 1){
	          middle = middle.next;
	      }

	      System.out.println("length of LinkedList: " + length);
	      System.out.println("middle element of LinkedList : " + middle.idata);
	      
	    } 

	
	public void display(){
		Link current=first;
		
		while(current!=null){
			current.displayLink();
			current=current.next;
			System.out.println("  ");
		}
	}

}
