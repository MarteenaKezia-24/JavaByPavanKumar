package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo{

	public static void main(String[] args) {
		//declaration
//				ArrayList  mylist = new ArrayList();  //store heterogenous data
//				List mylist = new ArrayList();

		//if you want to store homogeneous data
		//		ArrayList<Integer> mylist = new ArrayList<Integer>(); //stores only int data types 
		//		ArrayList<Employee> mylist = new ArrayList<Employee>(); //stores employee class 
	
		ArrayList mylist = new ArrayList();
		//adding data into arraylist
		mylist.add(100);
		mylist.add("welcome");
		mylist.add(null);
		mylist.add(100);
		mylist.add(null);
		mylist.add('A');
		mylist.add(true);		
		
		//size of arraylist
		System.out.println("size of an arraylist:" +mylist.size());
		
		//print of arraylist
		System.out.println("printing data from arraylist:" +mylist);
		
		System.out.println();
		
		//remove any element/objects/item from arraylist
		mylist.remove(3); //3 is index of element
		System.out.println("size of an arraylist:" +mylist.size());
		System.out.println("After removing:" +mylist);
		
		System.out.println();
		
		//inserting the element in the arraylist
		mylist.add(3, "Hello");
		System.out.println("size of an arraylist:" +mylist.size());
		System.out.println("After inserting:" +mylist);
		
		System.out.println();
		
		//change the element in the arraylist
		mylist.set(5, "Marteena");
		System.out.println("size of an arraylist:" +mylist.size());
		System.out.println("After editing:" +mylist);
		
		System.out.println();
		
		//access specific element from arraylist
//		String m=(String) mylist.get(3);
//		System.out.println(m);
		System.out.println(mylist.get(2));
		
		System.out.println();

//approach1-for loop
		//reading all the elements from arraylist
		for(int i=0; i<mylist.size(); i++)
		{
			System.out.println(mylist.get(i));
		}
		System.out.println();
		
//approach2-for each
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		System.out.println();
		
//approach3-using iterator only for collections will support
		Iterator it = mylist.iterator();
		
		while(it.hasNext()) //it will next position and execute it 
		{
			System.out.println(it.next()); //which element is focused on index, next method get the data		}
		}

		System.out.println();
		
		//checking arraylist is empty or not
		System.out.println(mylist.isEmpty());

		//remove all elements
		mylist.clear();  
		mylist.removeAll(mylist);
		System.out.println("remove all elements:" +mylist);
		
		//remove random elements from arraylist
		//add need to remove elements in one list and with original list remove 
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		mylist2.add(null);
		
		mylist.removeAll(mylist2);
		System.out.println("remove random elements:" +mylist);
}
}
