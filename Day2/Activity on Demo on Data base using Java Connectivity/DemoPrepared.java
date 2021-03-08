package DemoProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoPrepared {

		public static void main(String[] args) throws Exception
		{
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik","root","root");
			PreparedStatement ps=c.prepareStatement(null);
			
		}
}
                                                                                                                                                           
