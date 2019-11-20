package Praticejava;

class TestJava2
{  
 public static void main(String args[]){  
  StudentABC s1=new StudentABC();  
  StudentABC s2=new StudentABC();  
  s1.insertRecord(111,"Karan");  
  s2.insertRecord(222,"Aryan");  
  s1.displayInformation();  
  s2.displayInformation();  
 }  
}  


class StudentABC{  
	 int rollno;  
	 String name;  
	public void insertRecord(int rollno, String name){  
	  this.rollno =rollno;  
	  this.name = name;  
	 }  
	 public void displayInformation()
	 {System.out.println(rollno+" "+name);}  
	}  