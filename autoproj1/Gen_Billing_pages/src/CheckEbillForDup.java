
public class CheckEbillForDup {

	

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadJsonCheck {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://10.103.2.91:3306/ebill_online_api_sit";
		String username = "root";
		String password = "talktalk";
		Statement stmt = null;
		ResultSet rs = null;
		
		

		System.out.println("Attempting Connection to Database.....");

		try
		(Connection connection = DriverManager.getConnection(url, username, password)) 
		{
		    System.out.println("Database connection Success");
		
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("Starting Duplicate checks....");
        System.out.println("-------------------------------");
        
        
        String invoiceId;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Invoice ID:");
        invoiceId=(scanner.next());
        
              
        
        
        
        
		stmt = connection.createStatement();
		String invoice_number = invoiceId;
		String query = "select count(*) from invoice_details where inv_number ='" + invoice_number+"'";
		
		//Section 1: Check for Inv_details Table//
		
		rs = stmt.executeQuery(query);
		
		if (rs.next()) {
		int count = rs.getInt("count(*)");
		
		if (count == 0)
		{
			System.out.println("Invoice number enetered is invalid");
		}
		else if (count == 1)
		
		{
			System.out.println("inv_details: No Duplicate found");
		}
		
		else 
		{
			System.err.println("inv_details:"+count+" Duplicate found");
		}
		}
		//-----------------------------End of Section------------------------ 1//
		
				
		
		//Section 2: Check for payment_advice Table//
		
		String query2 = "select count(*) from payment_advice where inv_number ='" + invoice_number+"'";
		rs = stmt.executeQuery(query2);
		
		if (rs.next()) {
		int count = rs.getInt("count(*)");
		if (count == 0)
		{
			System.out.println("Invoice number enetered is invalid");
		}
		else if (count == 1)
		{
			System.out.println("payment_advice: No Duplicate found");
		}
		else 
		{
			System.err.println("payment_advice:"+count+" Duplicate found");
		}
		}
		
		//-----------------------------End of Section------------------------ 1//
		
		
		//Section 3: Check for statement Table//
		
		String query3 = "select count(*) from statement where inv_number ='" + invoice_number+"'";
		rs = stmt.executeQuery(query3);
		
		if (rs.next()) {
		int count = rs.getInt("count(*)");
		if (count == 0)
		{
			System.out.println("Invoice number enetered is invalid");
		}
		else if (count == 1)
		{
			System.out.println("statement: No Duplicate found");
		}
		else 
		{
			System.err.println("statement:"+count+" Duplicate found");
		}
		}
		
		
		
		//-----------------------------End of Section------------------------ 1//
		
		
		//Section 4: Check for account_bill_addr Table//
		
		
		String query4 = "select count(*) from account_bill_addr where inv_number ='" + invoice_number+"'";
		rs = stmt.executeQuery(query4);
		
		if (rs.next()) {
		int count = rs.getInt("count(*)");
		if (count == 0)
		{
			System.out.println("Invoice number enetered is invalid");
		}
		else if (count == 1)
		{
			System.out.println("account_bill_addr: No Duplicate found");
		}
		else 
		{
			System.err.println("account_bill_addr:"+count+" Duplicate found");
		}
		}
		
		
		
		//-----------------------------End of Section------------------------ 1//
		
		//Section 5: Check for Inv_details Table//
		
		
		String query5 = "select count(*) from account_level_transaction where inv_number ='" + invoice_number+"'";
		rs = stmt.executeQuery(query5);
		
		if (rs.next()) {
		int count = rs.getInt("count(*)");
		if (count == 0)
		{
			System.out.println("account_level_transaction: No Entries found");
		}
		else if (count == 1)
		{
			System.out.println("account_level_transaction: No Duplicates found");
		}
		else 
		{
			System.err.println("account_level_transaction:"+count+" Entries found");
			
				
			}
			
		}
		}
				
		
		
		//-----------------------------End of Section------------------------ 1//
		
		//Section 2: Check for Inv_details Table//
		
		
		//-----------------------------End of Section------------------------ 1//
		
		//Section 2: Check for Inv_details Table//
		
		
		//-----------------------------End of Section------------------------ 1//
		
		//Section 2: Check for Inv_details Table//
		
		
		//-----------------------------End of Section------------------------ 1//
		
		//Section 2: Check for Inv_details Table//
		
		
		//-----------------------------End of Section------------------------ 1//
		
		
		
		 catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
		
    }

}

	
	
}
