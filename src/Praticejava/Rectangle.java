package Praticejava;

class TestRectangle 
{
	int lenght ;
	
	int width;
	
	public void insert(int l,int W)
	{
		lenght = l;
		width =W;
	}
	
	public void calculateArea()
	{
		System.out.println("Area is "+lenght*width);
	}

	
}

class Rectangle{  
	
	public static void main(String[] args) {
	
		TestRectangle obj = new TestRectangle();
		
		obj.insert(5, 10);
		obj.calculateArea();
		
	}
}
