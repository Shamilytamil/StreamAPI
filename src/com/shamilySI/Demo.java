package com.shamilySI;
import java.sql.*;
	

public class Demo {

	public static void main(String[] args) throws Exception
		{
		String url="jdbc:mysql://127.0.0.1:3306/student";
		String uname="root";
		String pass="root";
		String query="select sname from student.stuinfo where rollno=321";
		
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,uname,pass);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	rs.next();
	String name = rs.getString("sname");
	System.out.println(name);
	st.close();
	con.close();
	
	

	}

} 
