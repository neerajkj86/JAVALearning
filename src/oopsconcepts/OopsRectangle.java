package oopsconcepts;

public class OopsRectangle {

	public static void main(String[] args) {
	
		//here object lenght and width will get the memory in heap area however the reference variable will get the memeory in Stack memory
		Rectangle obj = new Rectangle(); // here we are creating the object of Rectange class

		obj.setLenght(10);
		obj.setWidth(25);
		
		obj.getLenght();
		
		obj.getWidth();
		
		obj.calculateArea();
		
		System.out.println(obj.getLenght());
		
		System.out.println(obj.getWidth());
		
				
	}

}


class Rectangle
{
	private int lenght; //instance variable will get the memory at run time 
	private int width;
	
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void calculateArea()
	{
		System.out.println((lenght*width)); 
	}
	
}
