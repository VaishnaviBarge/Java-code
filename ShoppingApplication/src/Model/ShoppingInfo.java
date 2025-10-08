package Model;

import java.util.Date;
import java.util.Scanner;

public class ShoppingInfo {
	Scanner sc=new Scanner(System.in);
	
	public Customer createProduct() {
		System.out.println("Enter customer id :");
		int custId=sc.nextInt();
		System.out.println("Enter customer Name :");
		String custName=sc.next();
		System.out.println("Enter customer Mobile Number :");
		String mobNo=sc.next();
		
		System.out.println("Enter customer City :");
		String city=sc.next();
		System.out.println("Enter customer State :");
		String state=sc.next();
		System.out.println("Enter customer Pincode :");
		int pinCode=sc.nextInt();
		
		Address addr=new Address(city, state, pinCode);
		
		System.out.println("Enter the Number of Products :");
		int n=sc.nextInt();
		Product prodArr[]=new Product[n];
		for(int i=0;i<prodArr.length;i++) {
			System.out.println("-----------Enter "+(i+1)+"Product Details-----------");
			System.out.println("Enter the product Id:");
			int prodId=sc.nextInt();
			System.out.println("Enter the product Name :");
			String prodName=sc.next();
			System.out.println("Enter the product Price :");
			int prodPrice=sc.nextInt();
			System.out.println("Enter the product Quantity :");
			int prodQty=sc.nextInt();
			
			Product prodObj=new Product(prodId, prodName, prodPrice, prodQty);
			prodArr[i]=prodObj;
		}
		
		Customer custObj=new Customer(custId, custName, mobNo, addr, prodArr);
		
		return custObj;
	}
	
	public void displayProduct(Customer cust,Bill bobj) {
		System.out.println("Customer Id "+cust.getCustId());
		System.out.println("Customer Name :"+cust.getCustName());
		System.out.println("Customer Mobile Number :"+cust.getMobNo());
		System.out.print("Customer Address :");
		System.out.println("\tcity :"+cust.getAddr().getCity()+"\t state :"+cust.getAddr().getState()+"\t pincode :"+cust.getAddr().getPinCode());
		System.out.println("Product List :");
		Product p[]=cust.getProd();
		for(int i=0;i<cust.getProd().length;i++) {
			System.out.println(p[i].getProdId()+"\t"+p[i].getProdName()+"\t"+p[i].getProdPrice()+"\t"+p[i].getProdQty());
		}
		
		System.out.println("----------bill---------");
		System.out.println("bill no : "+bobj.getBillNumber());
		System.out.println("bill date : "+bobj.getDate());
		System.out.println("bill total : "+bobj.getTotal());
		System.out.println("cgst : "+bobj.getCgst());
		System.out.println("sgst : "+bobj.getSgst());
		System.out.println("Final total :"+bobj.getFinalTotal());
		
	}
	
	public Bill calculateBill(Customer cust) {
		Product p[]=cust.getProd();
		double total=0;
		double cgst;
		double sgst;
		double finalTotal;
		
		for(int i=0;i<cust.getProd().length;i++) {
//			System.out.println(p[i].getProdId()+"\t"+p[i].getProdName()+"\t"+p[i].getProdPrice()+"\t"+p[i].getProdQty());
			total+=p[i].getProdPrice()*p[i].getProdQty();
		}
		cgst=total*0.06;
		sgst=total*0.06;
		finalTotal=total+cgst+sgst;
		Bill billObj=new Bill(1, new Date() , total, cgst, sgst, finalTotal);
//		System.out.println("total Bill is :"+finalTotal);
		return billObj;
	}
}
