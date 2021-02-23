
public class QueueAsMyArrayList<E>
{   
	private MyArrayList<E> theQueue;  // list header
	
    public QueueAsMyArrayList()
    {  theQueue = new MyArrayList<E>();  
    }
	
    public void enqueue(E newElement) //insert at position size
    {  
	    if (theQueue.getSize()== theQueue.getMAXELEMENTS())
		   throw new IndexOutOfBoundsException
           ("Queue out of bounds");
        theQueue.add(theQueue.getSize(),newElement);		
    }
	
	public  E dequeue() //remove from position 0
    {  
		E temp = null;
		boolean isDone = false;
		if (theQueue.getSize() > 0)
		{
		  temp=theQueue.remove(0);
		}
		return temp; // temp will be null in special case of empty list
    }
	public String toString()
	{
		return theQueue.toString();
	}
   
}//end class

