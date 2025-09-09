
package jdbc;

import java.util.Scanner;
import java.sql.*;

public class JDBCApp {
	
	//C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib\Ojdbc14.jar
	
	public static void main(String[] args) {
		
		try {
			//step1: load driver
			Class.forName("oracle.jdbc.OracleDriver");
			//step2: connect to DB
			//Connection Details: C:\oraclexe\app\oracle\product\10.2.0\server\NETWORK\ADMIN\tnsnames
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
			System.out.println("Connection to DB "+con);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Roll Number ");
			int rollno=sc.nextInt();
			System.out.println("Enter Student name ");
			String fname=sc.next();
			System.out.println("Enter student Marks for Percentage");
			float perct=sc.nextFloat();
			
			
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1,rollno);
			ps.setString(2, fname);
			ps.setFloat(3, perct);
			
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("Record Saved !");
			}
			else {
				System.out.println("Record not saved !");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
