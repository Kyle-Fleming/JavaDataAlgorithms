public class TestStackAsMyLinkedList {
  public static void main(String[] args) {
	 Integer top = null;
	 StackAsMyLinkedList<Integer> myStack = new StackAsMyLinkedList<Integer>();

	 StackAsMyLinkedList<Integer> myStack1 = new StackAsMyLinkedList<Integer>();
      myStack1.push(Integer.valueOf(1));
      myStack1.push(Integer.valueOf(5));
      myStack1.push(Integer.valueOf(9));
      myStack1.push(Integer.valueOf(2));
      myStack1.push(Integer.valueOf(4));
      myStack1.push(Integer.valueOf(3));
      
      StackAsMyLinkedList<Integer> myStack2 = new StackAsMyLinkedList<Integer>();
      myStack2.push(myStack1.pop());
      myStack2.push(myStack1.pop());
	  myStack2.push(myStack1.pop());
	  System.out.println(myStack1); 
	  System.out.println(myStack2); 
	 
	 System.out.println("\nInitial stack: ");
	 System.out.println(myStack +"\n");
	
	 
	 System.out.println("\nAdd One item: ");// Add item to Empty stack
	 myStack.push(Integer.valueOf(3));
	 System.out.println(myStack +"\n");
	 
	 System.out.println("\nAdd a few more:");
	 myStack.push(Integer.valueOf(2));
	 myStack.push(Integer.valueOf(9));
	 myStack.push(Integer.valueOf(5));
	 System.out.println(myStack +" ");
	
	 
	 System.out.println("\nPop one");
	 top = (Integer) myStack.pop();
	 if (top != null)
		System.out.println("Top is: " + top.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +" ");
	 
	 System.out.println("\nPop one");
	 top = (Integer) myStack.pop();
	 if (top != null)
		System.out.println("Top is: " + top.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +" ");
	 
	 System.out.println("\nPop one");
	 top = (Integer) myStack.pop();
	 if (top != null)
		System.out.println("Top is: " + top.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +" ");
	 
	 System.out.println("\nPop one");
	 top = (Integer) myStack.pop();
	 if (top != null)
		System.out.println("Top is: " + top.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +" ");
	 
	 System.out.println("\nPop one");
	 top = (Integer) myStack.pop();
	 if (top != null)
		System.out.println("Top is: " + top.intValue() +"\n");
	 else
		 System.out.println("Empty Stack");
	 System.out.println(myStack +"\n ");
	 
	
	}
}
    
   