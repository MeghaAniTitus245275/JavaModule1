package serialization;

import java.io.Serializable;

public class  Car implements Serializable {	//marker interface :no variables or methods
	private String name;
	private transient int price;	//this variable will not be serialized,static variables also will not be serialized
	
	private static final long serialVersionUID = 11;
	
	private String color;
	
	public Car() {
	}


	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
