
public class CalendarDriver {

	
	public static void main (String args [])
	
	{
		//Initialization of arrays
		String [] days = new String[7];
		String [] months = new String[12];
		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11]= "December";
		//days
		days[0] = "Sunday";
		days[1] = "Monday";
		days[2] = "Tuesday";
		days[3] = "Wednesday";
		days[4] = "Thursday";
		days[5] = "Friday";
		days[6] = "Saturday";
		 new CalendarGUI(months,days);
		 new Calendar(months,days);
		 new CalendarGUI();
		 
		 //Calendar y = new Calendar();
		
		//String b = "";
		
		//b = y.getMonth();
		//System.out.println(b);
		
		
		 
			
		
		
	}
}