public class TestMyLinkedList {
public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
		MyLinkedList<Integer> returnList = new MyLinkedList<Integer>();

		System.out.println("\n\nTest for multiple instances of integers of the paramater list that appear in the calling list.");

		System.out.println("Test appearsTwice, both empty lists:\n");
			returnList=myList.appearsTwice(testList);
			System.out.printf("\nMylist %s",myList);
			System.out.printf("\nTestList %s",testList);
			System.out.printf("\nReturnList: %s",returnList);
			System.out.printf("\nMylist %s",myList);
		
		System.out.println("\n\nPopulate 'mylist'");
			myList.append(Integer.valueOf(3));
			myList.append(Integer.valueOf(8));
			myList.append(Integer.valueOf(7));
			myList.append(Integer.valueOf(4));
			myList.append(Integer.valueOf(2));
			myList.append(Integer.valueOf(9));
			
		System.out.printf("\n\nmyList = %s", myList);

		System.out.println("\n\nTest .appearsTwice, empty parameter list:\n");
			returnList = myList.appearsTwice(testList);
			System.out.printf("\nMylist %s",myList);
			System.out.printf("\nTestList %s",testList);
			System.out.printf("\nReturnList: %s",returnList);
			System.out.printf("\nMylist %s",myList);
		
		System.out.println("\n\nPopulate testList: only 2 of original values\n");
			testList.append(3);
			testList.append(8);
			testList.append(7);
			testList.append(4);
			testList.append(2);
			testList.append(9);
			testList.append(3);
			testList.append(8);
			testList.append(7);
			testList.append(4);
			testList.append(2);
			testList.append(9);
			
		System.out.printf("Test list: %s", testList);
		System.out.println("\n\nTest .appearsTwice, calling list containing duplicates 2x");
			//testlist needs to check that its value appearsTwice in myList so testList is the calling list in this case.
			returnList = testList.appearsTwice(myList);
			System.out.printf("\nMylist %s",myList);
			System.out.printf("\nTestList %s",testList);
			System.out.printf("\nReturnList: %s",returnList);
			System.out.printf("\nMylist %s",myList);
		
		System.out.println("\n\nTest .appearsTwice, param list containing duplicates 2x");
			//normal order of operation
			returnList = myList.appearsTwice(testList);
			System.out.printf("\nMylist %s",myList);
			System.out.printf("\nTestList %s",testList);
			System.out.printf("\nReturnList: %s",returnList);
			System.out.printf("\nMylist %s",myList);

		testList.clear();
		System.out.println("\n\nPopulate testList: only values equal to tail value(9)\n");
			testList.append(9);
			testList.append(9);
			testList.append(9);
			testList.append(9);
			testList.append(9);
			testList.append(9);
			testList.append(9);
			testList.append(9);
			testList.append(9);
			System.out.printf("Test list: %s", testList);

		System.out.println("\n\nTest .appearsTwice, param list containing duplicates 9x");
			returnList = myList.appearsTwice(testList);
			System.out.printf("\nMylist %s",myList);
			System.out.printf("\nTestList %s",testList);
			System.out.printf("\nReturnList: %s",returnList);
			System.out.printf("\nMylist %s",myList);
	}
}


