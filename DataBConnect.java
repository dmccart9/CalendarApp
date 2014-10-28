import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.hsqldb.Server;
//import org.hsqldb.Statement;


public class DataBConnect 
{

	static int test2=0;
	static String larb;
	
	public DataBConnect() throws 
	  SQLException,ClassNotFoundException 
	{
		Server calServer = null;
		
		try{
			calServer = new Server();
		    calServer.setLogWriter(null);
		    calServer.setSilent(true);
		    
		    calServer.setDatabaseName(0, "xdb");
		    calServer.setDatabasePath(0,"file:testdb");
		    
		    calServer.start();
		    
		
		//java.sql.Statement s1 = null;
		//ResultSet result = null;
		Connection c = null;
		
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
		
		 c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA", "");
		 
	    
		 if(c != null)
	    {
	    	System.out.println("Connected to database");
	    	
	    }
	    
	      c.prepareStatement("drop table CalendarEvents;")
	          .execute();
	    c.prepareStatement("create table CalendarEvents (Month INTEGER, " +
	    "Event VARCHAR(255));")
	    .execute();
	    c.prepareStatement(
	    	"insert into CalendarEvents(Month,Event) " +
	        "values (1, 'Wedding');")
	        .execute();
	    ResultSet rs = c.prepareStatement(
	    		"select * from CalendarEvents;").executeQuery();
	    
	    rs.next();
	    
	    DataBConnect.test2=rs.getInt(1);
	    DataBConnect.larb=rs.getString(2);
	   /* System.out.println("Month: " + rs.getInt(1) + " Event: " 
	    		+ rs.getString(2));*/
	    
	   System.out.println(c.getCatalog());
	    
	    
		} finally {
			if(c != null){
				c.close();
			}
		}
		} finally {
			if (calServer != null){
				calServer.stop();
			}
		}
	  
	    
		// s1 = c.createStatement();
	   
	    //result = s1.executeQuery("SELECT * FROM Tablef");
	    
	   // c.commit();
	   
	    
	   
	    
	  //  while(result.next()){
	    	//ans=result.getString("DATEINFO");
	    	//System.out.println(ans);
	    //}
	    
	    
	    
		
	}

public int getEventMonth()
{
	return test2;
}
public String getEvent()
{
	return larb;
}

}



