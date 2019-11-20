package collectionAPI;

public class Laptop 
{
	
	public Laptop(String brand, int ram, int prize) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.prize = prize;
	}

	private String brand;
	
	private int ram;
	
	private int prize;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", prize=" + prize + "]";
	}

	
	

	

	
	
	
}
