public class TestMyArrayList {
  public static void main(String[] args) {
    
    MyArrayList<Integer> list1 = new MyArrayList<>();
	MyArrayList<Integer> list2 = new MyArrayList<>();
	MyArrayList<Integer> list3 = new MyArrayList<>();
	
	System.out.println("\nTEST 1: Both lists empty");
    list3=list1.merge(list2);
    System.out.println("list1 = " + list1);
	System.out.println("list2 = " + list2);
	System.out.println("list3 = " + list3);
	
    System.out.println("\nTEST 2: Param list empty");
	list1.add(0,new Integer(3));
    list1.add(1,new Integer(8));
    list1.add(2,new Integer(17));
    list3=list1.merge(list2);
    System.out.println("list1 = " + list1);
	System.out.println("list2 = " + list2);
	System.out.println("list3 = " + list3);
	

	
	System.out.println("\nTEST 3: Calling list empty");
	list1.clear();
	list2.add(0,new Integer(3));
    list2.add(1,new Integer(8));
    list2.add(2,new Integer(17));
    list3=list1.merge(list2);
    System.out.println("list1 = " + list1);
	System.out.println("list2 = " + list2);
	System.out.println("list3 = " + list3);
	
	System.out.println("\nTEST 4: Calling list shorter than param list");
	list1.clear();
	list2.clear();
	
	list1.add(0,new Integer(8));
    list1.add(1,new Integer(17));
    list2.add(0,new Integer(6));
	list2.add(1,new Integer(12));
    list2.add(2,new Integer(19));
	list2.add(3,new Integer(20));
    list3=list1.merge(list2);
    System.out.println("list1 = " + list1);
	System.out.println("list2 = " + list2);
	System.out.println("list3 = " + list3);
	
	System.out.println("\nTEST 5: Calling list longer than param list");
	list1.clear();
	list2.clear();
	list1.add(0,new Integer(8));
    list1.add(1,new Integer(17));
    list1.add(2,new Integer(18)); 
	list1.add(3,new Integer(20));
    list2.add(0,new Integer(6));
	list2.add(1,new Integer(12));
    list3=list1.merge(list2);
    System.out.println("list1 = " + list1);
	System.out.println("list2 = " + list2);
	System.out.println("list3 = " + list3);
	
	System.out.println("\nTEST 6: Equal sizes");
	list1.clear();
	list2.clear();
	list1.add(0,new Integer(8));
    list1.add(1,new Integer(17));
    list1.add(2,new Integer(18)); 
	list1.add(3,new Integer(20));
    list2.add(0,new Integer(6));
	list2.add(1,new Integer(12));
	list2.add(2,new Integer(19));
	list2.add(3,new Integer(21));
    
    list3=list1.merge(list2);
    System.out.println("list1 = " + list1);
	System.out.println("list2 = " + list2);
	System.out.println("list3 = " + list3);
	   
	
  }
  
}