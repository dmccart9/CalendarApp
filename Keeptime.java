import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Keeptime {

    static String[]months = new String[12];
	static String[]days = new String[7];
	static int currentMonth = 0;
	static int currentDay = 0;
	static int currentWeekofMonth = 0;
	static int currentDayofMonth = 0;
	static String currentYear = "";
	
	public Keeptime()
	{
		int r = 0;
		
		DateFormat dateFormat = new SimpleDateFormat("w");
		DateFormat dateFormat2 = new SimpleDateFormat("u");
		DateFormat dateFormat3 = new SimpleDateFormat("W");
		DateFormat dateFormat4 = new SimpleDateFormat("d");
		DateFormat dateFormat5 = new SimpleDateFormat("y");
		Calendar cal = Calendar.getInstance();
		
	    String x = dateFormat.format(cal.getTime());
	    String b = dateFormat2.format(cal.getTime());
	    String rar = dateFormat3.format(cal.getTime());
	    String dom = dateFormat4.format(cal.getTime());
	    String year = dateFormat5.format(cal.getTime());
	    
	    
	     int d = Integer.parseInt(dom);
	     int c = Integer.parseInt(rar);
	     int y = Integer.parseInt(x);
	     int w = Integer.parseInt(b);
	     r = (y/4)-1;
	   Keeptime.currentMonth = r;
	   Keeptime.currentDay = w;
	   Keeptime.currentWeekofMonth = (c-1);
	   Keeptime.currentDayofMonth = d;
	   Keeptime.currentYear = year;
	   
	   
	   

	}
	public Keeptime(String[] month, String[] day)
	{
		
		
		
		for(int i=0;i<12;i++){
		Keeptime.months[i]=month[i];
		}
		for(int f=0;f<7;f++){
		
		Keeptime.days[f]=day[f];
		}
		
	}
	
	public String getMonth()
	{
		
		
		return months[currentMonth];
		
	}
	public int getMonthNum()
	{
		
		return currentMonth;
		
	}
public void setMonth(int s)
{
	Keeptime.currentMonth = s;
	
}

public void Monthplus()
{
	currentMonth++;
}

public String getDay()
{
	return days[currentDay];
}
public void setDay(int f)
{
	Keeptime.currentDay=f;
	
}
public void Dayplus()
{
	currentDay++;
}
public int getNumDay()
{
	return currentDay;
}
public int getCurrentWeek()
{
	return currentWeekofMonth;
	
}
public int getCurrentDayM()
{
	return currentDayofMonth;
}
public String getYear(){
	

return currentYear;
}
}

