package Model;

public class Product {
	private int prodId;
	private String prodName;
	private double prodPrice;
	private int prodQty;
	
	
	public Product() {
		super();
		
	}

	public Product(int prodId, String prodName, double prodPrice, int prodQty) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
	}
	
	/*
	 constructor -
	constructor is a special funtion in the program its name and class name is always same  
	constructor is used to create a Object of class  (instance of class)
	
	default constructor
	if you don't hve any constructor in a class then java will profide a default constructor 
	
	parametric constructor
	if we have parametric constructor in cass then java don't provide default constructor
	
	
	this Keyword 
	there are three use of this keywords
	
	1.Resolve the ambiguity between instance variable and parameters 
	2.we can call another constructor of the same class using this keyword 
	3.this means current object , it always points to current object
	*/
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	
	//private 
		//we can access it within the same class only 
		//we can't access private variable directly outside a class
		
		//Default - 
		//default data members we can use within the same package
		
		// Protected - 
		//Protected data members we can use in any derived child class 
			
		//Public 
		//data member we can access anywhere in any package or class using objects
			
		//Setter and getters -
		// we use setters and getters in encapsulation
		//used to protect our data, particularly when creating classes.
		
		
		//for each instance variable a getter method returns it value 
		//while setter method sets or updates it's value; 
		//setter and getter is also called as accessors and mutators
		
		
	
}
