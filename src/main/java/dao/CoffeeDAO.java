package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import dao.ConnectionDAO;

import model.Coffee;

public class CoffeeDAO {
	
	
	public void saveCoffee(Coffee newCoffee) {
		
		ConnectionDAO dao = new ConnectionDAO();
		
		String insert = "INSERT INTO CAFE(NAME, DESCRIPTION, WEIGHT, PRICE, TYPE, ROAST) "
				+ "VALUES (?,?,?,?,?,?)";
		
		try {
			Connection con = dao.connect();
			
			PreparedStatement pst = con.prepareStatement(insert);
			
			pst.setString(1, newCoffee.getName());
			pst.setString(2, newCoffee.getDescription());
			pst.setDouble(3, newCoffee.getWeight());
			pst.setDouble(4, newCoffee.getPrice());
			pst.setInt(5, newCoffee.getType().ordinal());
			pst.setInt(6, newCoffee.getRoast().ordinal());
			
			pst.executeUpdate();
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
