package Model;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		Product pobj=new Product();
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("Enter the product Id:");
		int prodId=sc.nextInt();
		System.out.println("Enter the product Name :");
		String prodName=sc.next();
		System.out.println("Enter the product Price :");
		int prodPrice=sc.nextInt();
		System.out.println("Enter the product Quantity :");
		int prodQty=sc.nextInt();
		
		pobj.setProdId(prodId);
		pobj.setProdName(prodName);
		pobj.setProdPrice(prodPrice);
		pobj.setProdQty(prodQty);
		
		Product prod2=new Product(102,"Mobile",15000,10);
		
		System.out.println("Product Id :"+ pobj.getProdId());
		System.out.println("Product Name :"+ pobj.getProdName());
		System.out.println("Product Price :"+ pobj.getProdPrice());
		System.out.println("Product Quantity :"+ pobj.getProdQty());
		
		System.out.println("Product Id :"+ prod2.getProdId());
		System.out.println("Product Name :"+ prod2.getProdName());
		System.out.println("Product Price :"+ prod2.getProdPrice());
		System.out.println("Product Quantity :"+ prod2.getProdQty());
		*/
		ShoppingInfo sinfo=new ShoppingInfo();
		Customer cust=sinfo.createProduct();
		
		Bill billObj=sinfo.calculateBill(cust);
		
		sinfo.displayProduct(cust,billObj);
		
		
	}

}
