public class TestMyLinkedList {
public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		MyLinkedList<Integer> returnList = new MyLinkedList<Integer>();

		//test empty list
		System.out.println("Test empty calling list");
		System.out.printf("\nMylist %s",myList);
		myList.insertSorted(Integer.valueOf(13));
		System.out.printf("\nMylist %s\n\n",myList);

		myList.clear();
		System.out.println("Populate empty calling list");
		myList.append(Integer.valueOf(1));
		myList.append(Integer.valueOf(2));
		myList.append(Integer.valueOf(3));
		myList.append(Integer.valueOf(4));
		myList.append(Integer.valueOf(5));
		
		System.out.printf("\n\nPopulated list: %s\n\n", myList);

		//insert at head
		System.out.println("Test value equal to head");
		System.out.printf("\nMylist %s",myList);
		myList.insertSorted(Integer.valueOf(1));
		System.out.printf("\nMylist %s\n\n",myList);

		//insert at tail
		System.out.println("Test value greater than tail");
		System.out.printf("\nMylist %s",myList);
		myList.insertSorted(Integer.valueOf(5));
		System.out.printf("\nMylist %s\n\n",myList);


		//insert at any point
		System.out.println("Test value at any point");
		System.out.printf("\nMylist %s",myList);
		myList.insertSorted(Integer.valueOf(3));
		System.out.printf("\nMylist %s\n\n",myList);


		//insert many values
		System.out.println("Insert Many values");
		System.out.printf("\nMylist %s",myList);
		myList.insertSorted(Integer.valueOf(6));
		myList.insertSorted(Integer.valueOf(12));
		myList.insertSorted(Integer.valueOf(8));
		myList.insertSorted(Integer.valueOf(3));
		myList.insertSorted(Integer.valueOf(1));
		myList.insertSorted(Integer.valueOf(9));
		System.out.printf("\nMylist %s\n\n",myList);

		//insert negative values
		System.out.println("Insert a negative number");
		System.out.printf("\nMylist %s\n", myList);
		myList.insertSorted(Integer.valueOf(-15));
		System.out.printf("\nMylist %s\n", myList);


	}
}
