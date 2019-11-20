package Praticejava;

class TestRectangles 
{
	int lenght ;
	
	int width;
	
	
	public TestRectangles(int l,int w)
	{
		this.lenght =l;
		this.width=w;
	}
	
	
	public void calculateArea()
	{
		System.out.println("Area is "+lenght*width);
	}

	
}

class Rectangle2{  
	
	public static void main(String[] args) {
	
		TestRectangles obj = new TestRectangles(5,10);
		
		//obj.insert(5, 10);
		obj.calculateArea();
		
	}
}
