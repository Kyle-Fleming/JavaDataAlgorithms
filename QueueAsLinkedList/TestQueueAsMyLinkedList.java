
public class TestQueueAsMyLinkedList
{
	public static void main(String [] args)
	{
	 Integer first = null;
	 QueueAsMyLinkedList<Integer> myQueue = new QueueAsMyLinkedList<Integer>();
/*
	 QueueAsMyLinkedList<Film> myQueue1 = new QueueAsMyLinkedList<Film>();   
     QueueAsMyLinkedList<Film> myQueue2 = new QueueAsMyLinkedList<Film>();   
     
     myQueue1.enqueue(new Film("Jaws","R",122));
     myQueue1.enqueue(new Film("Batman","R",130));
     myQueue1.enqueue(new Film("Casino","R",130));
     myQueue1.enqueue(new Film("Rocky","R",130));
     myQueue1.enqueue(new Film("Unforgiven","PG-13",126));
     myQueue1.enqueue(new Film("Fearless","PG",124));
     
     myQueue2.enqueue(myQueue1.dequeue());
     myQueue2.enqueue(myQueue1.dequeue());
         
	 System.out.println(myQueue2); //Will display
	 System.out.println(myQueue1); //Will display
*/
	 
	 System.out.println("\nInitial list: ");
	 System.out.println(myQueue +"\n");
	
	 System.out.println("\nAdd One item: ");// Add item to Empty queue
	 myQueue.enqueue(Integer.valueOf(3));
	 System.out.println(myQueue +"\n");
	 
	 System.out.println("\nAdd a few more:");
	 myQueue.enqueue(Integer.valueOf(2));
	 System.out.println(myQueue +"\n");
	 myQueue.enqueue(Integer.valueOf(9));
	 System.out.println(myQueue +"\n");
	 myQueue.enqueue(Integer.valueOf(5));
	 System.out.println(myQueue +"\n");
	
		 System.out.println("\nDequeue one");
	 first = (Integer) myQueue.dequeue();
	 if (first != null)
		System.out.println("first is: " + first.intValue() +" ");
	 else
		 System.out.println("Empty Queue");
	 System.out.println(myQueue +"\n");
	 
	 System.out.println("\nDequeue one");
	 first = (Integer) myQueue.dequeue();
	 if (first != null)
		System.out.println("first is: " + first.intValue() +" ");
	 else
		 System.out.println("Empty Queue");
	 System.out.println(myQueue +"\n");
	 
	 System.out.println("\ndequeue one");
	 first = (Integer) myQueue.dequeue();
	 if (first != null)
		System.out.println("first is: " + first.intValue() +" ");
	 else
		 System.out.println("Empty Queue");
	 System.out.println(myQueue +"\n");
	 
	 System.out.println("\ndequeue one");
	 first = (Integer) myQueue.dequeue();
	 if (first != null)
		System.out.println("first is: " + first.intValue() +"  ");
	 else
		 System.out.println("Empty Queue");
	 System.out.println(myQueue +"\n");
	 
	 System.out.println("\ndequeue one");
	 first = (Integer) myQueue.dequeue();
	 if (first != null)
		System.out.println("first is: " + first.intValue() +"  ");
	 else
		 System.out.println("Empty Queue");
	 System.out.println(myQueue +"\n");
	 
	
	}
}