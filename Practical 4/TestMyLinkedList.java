public class TestMyLinkedList {
public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
		MyLinkedList<Integer> returnList = new MyLinkedList<Integer>();

		System.out.printf("\nTest isMember: empty list");
	
		if (myList.isMember(Integer.valueOf(4))) // test empty list
			System.out.println("\n 4 is found in the list");
		else
			System.out.println("\n 4 is NOT found");

		System.out.println("\nInitial list: ");
		System.out.printf("\nMylist %s",myList);

		// test both empty lists for missing
		System.out.printf("\nTest missing: both empty lists ");

		returnList=myList.missing(testList);

		System.out.printf("\nMylist %s",myList);
		System.out.printf("\nTestList %s",testList);
		System.out.printf("\nReturnList: %s",returnList);
		System.out.printf("\nMylist %s",myList);
		System.out.println("\nAdd items: ");// Add item to Empty list
		
		myList.append(Integer.valueOf(2));
		myList.append(Integer.valueOf(4));
		myList.append(Integer.valueOf(6));
		myList.append(Integer.valueOf(1));
		
		System.out.printf("\nmylist %s",myList);

		// test missing with empty parameter list
		System.out.printf("\nTest missing: parameter list is empty ");
		
		returnList=myList.missing(testList);
		
		System.out.printf("\nMylist %s",myList);
		System.out.printf("\nTestList %s",testList);
		System.out.printf("\nReturnList: %s",returnList);
		System.out.printf("\nMylist %s",myList);


		System.out.printf("\nTest isMember: parameter in list  ");
		if (myList.isMember(Integer.valueOf(4)))
			System.out.println("\n 4 is found in the list");
		else
			System.out.println("\n 4 is NOT found");
			System.out.printf("\nTest isMember: parameter not in list  ");
		
		if (myList.isMember(Integer.valueOf(8)))
			System.out.println("\n 8 is found in the list");
		else
			System.out.println("\n 8 is NOT found ");

		System.out.printf("\nTest missing: no empty list");
		
		testList.append(Integer.valueOf(1));
		testList.append(Integer.valueOf(3));
		testList.append(Integer.valueOf(2));
		testList.append(Integer.valueOf(8));
		
		returnList=myList.missing(testList);
		
		System.out.printf("\nMylist %s",myList);
		System.out.printf("\nTestList %s",testList);
		System.out.printf("\nReturnList: %s",returnList);
		System.out.printf("\nMylist %s",myList);
	}
}


