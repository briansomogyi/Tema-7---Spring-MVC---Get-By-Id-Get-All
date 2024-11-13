package ro.emanuel.pojo;

public class Phone {

	private int id;
	private String brand;

	public Phone() {
	}

	public Phone(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
