package DemoProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

	public class DemoMain
	{
		public static void main(String[] args) throws Exception	
			{
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik","root","root");
				Statement s=c.createStatement();
				s.execute("insert into customer values(1,' karthik','9592336132')");
				s.execute("insert into customer values(2,' shiva','7095020263')");
				s.execute("insert into customer values(3,' Sudheer/Cutter Pro','8309545010')");
				s.execute("insert into customer values(4,' Pro','9309545010')");
				
				c.close();
			}
	}	
