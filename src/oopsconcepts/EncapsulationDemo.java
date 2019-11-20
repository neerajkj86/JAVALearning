package oopsconcepts;



class student
{
	
	private int rollno;
	private String name;
	
	public int getRollno() {
		System.out.println("fetching the value"); //log maintaince
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("Values of roll number is changed"); //to maintain the log file for you..
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		
	student a = new student();
	
	a.setRollno(3);  // here we are assigning the values of variable using getter and setter method  
	
	a.getRollno();

	a.setName("neeraj");
	
	System.out.println(a.getName());
	
	System.out.println(a.getRollno());
	
	
	}

}
