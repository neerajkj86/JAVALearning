package Praticejava;

public class Counter2 {

static int count=0;//will get memory only once when class is loaded and it will retain its value 
  
Counter2(){  
count++;//incrementing value  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//Creating objects  
Counter2 c1=new Counter2();  
Counter2 c2=new Counter2();  
Counter2 c3=new Counter2();  
}  
}  