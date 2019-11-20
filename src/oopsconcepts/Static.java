package oopsconcepts;

class Studend{  
    int rollno;  
    String Name;  
   static String college="ITS";  //Java static Proprty is shared to all the objects
   
   
   public Studend(int rollno ,String Name) { //Parameterized constructor
	this.rollno= rollno;
	this.Name= Name;
   }
   public void show()
   {
	   System.out.println(rollno+"------" +Name+"--------" +college);
   }

  
   
}  








public class Static {
	
	
	
	
	

	public static void main(String[] args) {
		
		Studend S1 = new Studend(1, "Neeraj");
		Studend S2 = new Studend(2, "Rahul");
		S1.show();
		S2.show();
		
	}

}
