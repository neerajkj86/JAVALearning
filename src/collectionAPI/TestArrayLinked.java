package collectionAPI;
import java.util.*;    
class TestArrayLinked{    
 /**
 * Difference b/w arraylist and linklist 
 * 1. Array list uses the concept of the inde number so searching is faster 
 * 2. but inserting any element is slower because all the elements need to be shift the location but it is easier in link list because link list use
 * the concept of ouble link list but in projects we mostly use array list only.
 * 
 */
public static void main(String args[]){    
  
	 
	 
	 
	 
	 
  List<String> al=new ArrayList<String>();//creating arraylist    
  al.add("Ravi");//adding object in arraylist    
  al.add("Vijay");    
  al.add("Ravi");    
  al.add("Ajay");    
    
  List<String> al2=new LinkedList<String>();//creating linkedlist    
  al2.add("James");//adding object in linkedlist    
  al2.add("Serena");    
  al2.add("Swati");    
  al2.add("Junaid");    
    
  System.out.println("arraylist: "+al);  
  System.out.println("linkedlist: "+al2);  
  
  
  al.add(2, "Neeraj");
  
  Set <Integer> a = new HashSet<Integer>();
  
  a.add(1);
  a.add(2);
  a.add(45);
  a.add(32);
  a.add(32);
  System.out.println(a); //Set is not maintaing the sorting order and set is not allowing to enter duplicate values
  
  
  
  //we can also implement tree set for maintaining the order 
  
  Set <Integer> abc = new TreeSet<Integer>();
  
  abc.add(1);
  abc.add(34);
  abc.add(12);
  abc.add(34);
  System.out.println(abc);
  
  
  
  
  
  
  System.out.println("arraylist: "+al);  
  
  
  
 }    
}    