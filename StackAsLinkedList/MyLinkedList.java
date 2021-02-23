public class MyLinkedList<E>{
	
	private Node<E> head, tail;

	public MyLinkedList(){
		head = null;
		tail = null;
	}

	/** Return the head element in the list */
	public E getFirst(){
		if (head == null){
			return null;
		}
		else{
			return head.element;
		}
	}

	/** Return the last element in the list */
	public E getLast(){
		if (head==null){
			return null;
		}
		else{
			return tail.element;
		}
	}
	//iterative method to get the length of a linkedList
	public int getLength(){
		int count =0;
		Node<E> ptr = head;
		while(ptr!=null){
			ptr = ptr.next;
			count++;
		}
		return count;
	}

	// Remove the head node and return the object that is contained in the removed node.
	public E removeFirst(){
		
		if (head == null){
			
			return null;
		}
		else{
			
			E temp = head.element;
			head = head.next;
			if (head == null){
				tail = null;
			}
			return temp;
		}
	}

	// Add an element to the end of the list

	public void append(E item){
		Node<E> newNode = new Node<>(item); // Create a new for element e
		if (head == null){
			head = tail = newNode;          // The new node is the only node in list
		}
		else{
			tail.next = newNode;             // Link the new with the last node
			tail = newNode;                 // tail now points to the last node
		}
	}
	// Add an element to the beginning of the list
	public void prepend(E e){
		Node<E> newNode = new Node<>(e); // Create a new node
		newNode.next = head;             // link the new node with the head
		head = newNode;                  // head points to the new node

		if (tail == null){
			tail = head;                   // the new node is the only node in list
		}

	}

	public boolean delete(E item){
		
		Node<E> ptr = head;             //pointer
		Node<E> prvPtr = null;           //previous pointer
		while (ptr != null && ((Comparable)ptr.element).compareTo(item) != 0){
			prvPtr=ptr;
			ptr=ptr.next;
		}

		if (ptr == null){
		return false;
		}
								//item not found
		if (ptr==head){
			head= head.next;
		}             // item is first element

		else{
		prvPtr.next=ptr.next;
		}                         // general case


		if (ptr==tail){
			tail=prvPtr;
		}

		return true;
	}

	public String toString(){
		String result = "[";

		Node<E> ptr = head;
		for (ptr= head;ptr!=null; ptr=ptr.next){
			
			result = result +  ptr.element.toString();
			if (ptr.next != null){
				
			result = result + ","; // add commas but not to the final 1
			}
		}
		result += "]"; // Insert the closing ] in the string
		return result;
	}


	public void clear(){
		
		head = tail = null;
	}

	public boolean isMember(E item){
		
		Node<E> ptr = head;

		if (head == null){
			return false;
		} //empty lists dont have members


		if (item == null){

		return false;
		} //null items cant be members

		while (ptr!= null){
			int checkMember = ((Comparable)ptr.element).compareTo(item); //simply checking the element at the pointer versus the parameter item
			if (checkMember == 0){
				return true;
			}

			ptr=ptr.next;         // repeats the above operation until the pointer is null (after the tail.)
		}
		return false;
		}

	public MyLinkedList<E> missing(MyLinkedList<E> paramList){
		MyLinkedList<E> newList = new MyLinkedList<E>(); // returned list that displays missing elements

		if (paramList.head == null){        // param is empty
		
			return newList;
		}

		Node<E> paramPtr= paramList.head; // if neither list is empty
		while (paramPtr != null){         // traverse param
		
			if (!this.isMember(paramPtr.element)){ // if this element is not a member of teh param pointer then append the returning list while the param pointer is not null.
				newList.append(paramPtr.element);
			}

			paramPtr=paramPtr.next;               // repeat until you have reached the tail.
		}
		return newList;
}


	//the method 'appears' checks the paramater array for each element of the calling array if there are 2 or more of the same elements
	public MyLinkedList<E> appearsTwice(MyLinkedList<E> paramList){
		MyLinkedList<E> newList = new MyLinkedList<E>();

		if(paramList.head == null){
			return newList;
		}
		//I think I need two pointers...
		//Param pointer 1 is the outer pointer for the first pass of the list.
		//param pointer 2 is the inner pointer to check for duplicates.
		Node<E> paramPtr1 = paramList.head;

		//this will likely only work if you have two or more for loops to check for duplicates.
		while(paramPtr1 != null){
			if(this.isMember(paramPtr1.element)){
				
				if(!newList.isMember(paramPtr1.element)){
				newList.append(paramPtr1.element);
				}
			}
			paramPtr1 = paramPtr1.next;
		}

		return newList;
	}
	//TODO: getMiddle()
	public boolean mergeSort(){
		
		if(head != null){
			
			return true;
		}
	
		else{
			return false;
		}
	}

	private static class Node<E>{
		
		E element;
		Node<E> next;

		public Node(E element){
			
			this.element = element;
			next = null;
	}
}

} // end MyLinkedList class
