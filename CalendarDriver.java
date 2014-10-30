//import java.sql.SQLException;


public class CalendarDriver {

	static int[] dates = new int[366];
	static int dayCounter=0;
	
	public static void main (String args []) throws ClassNotFoundException
	
	{
		//Initialization of arrays
		CalendarGUI[] manyGUIs = new CalendarGUI[12];
		String [] days = new String[7];
		String [] formatDays = new String[7];
		String [] months = new String[12];
		
		//months
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
		
		
      //array to work with SimpleDate
		formatDays[0] = "Monday";
		formatDays[1] = "Tuesday";
		formatDays[2] = "Wednesday";
		formatDays[3] = "Thursday";
		formatDays[4] = "Friday";
		formatDays[5] = "Saturday";
		formatDays[6] = "Sunday";
		
	
	    populate();
	    CalendarDriver.dates[365] = 1;
	    
	    new Keeptime(months,formatDays); //start Keeping time
		new CalendarGUI(months,days,CalendarDriver.dates);
	    
		for(int w=0;w<=11;w++) {
	    	manyGUIs[w] = new CalendarGUI();
	    	manyGUIs[w].setVisible(true);
	    	manyGUIs[w].setEnabled(true);
	    	}
	   // manyGUIs[Keeptime.currentMonth].setEnabled(true);
	  //  manyGUIs[Keeptime.currentMonth].setVisible(true);
	  //  manyGUIs[Keeptime.currentMonth].b3.setText(days[Keeptime.currentDay + 1] + ", " + months[Keeptime.currentMonth] + " " + String.valueOf(Keeptime.currentDayofMonth) + " " + Keeptime.currentYear);
	
	     }

	public static void populate()
	{
		for(int b=0;b<12;b++){
			if(b==0||b==2||b==4||b==6||b==7||b==9||b==11 ){
			thirtyOne();
			}
			if(b==3||b==5||b==8||b==10){
				thirty();
			}
			
			if(b==1){
				feb();
			}
		}
		
	}
public static void thirtyOne()
{
	int f=1;
	if(CalendarDriver.dayCounter==0)
	{
		while(dayCounter<31)
		{
			CalendarDriver.dates[dayCounter]=f;
			dayCounter++;
			f++;
			
		}
		//System.out.println(dayCounter);
	    return;
	}
	    if(dayCounter>=1)
	    {   
	    	int wx=dayCounter+31;
	    	while(CalendarDriver.dayCounter < wx)
	    	{
	    		CalendarDriver.dates[dayCounter]=f;
	    		dayCounter++;
	    		f++;
	    	}
	  return;  
	    }	
	
}
public static void thirty()
{
	
	
	//System.out.println(dayCounter);
	
    int j = dayCounter+30;
	int f=1;
	while(dayCounter < j)
	{
		CalendarDriver.dates[dayCounter]=f;
		dayCounter++;
		f++;
		
		}
	return;
}
public static void feb()
{   
	
	int y=dayCounter+28;
	int f=1;
	while(dayCounter < y)
	   
	{
		
		CalendarDriver.dates[dayCounter]=f;
		dayCounter++;
		f++;
		}
	return;
	
}




}
