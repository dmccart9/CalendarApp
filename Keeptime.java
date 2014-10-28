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
		
		//using DateFormat to get data from Calendar class
		DateFormat dateFormat = new SimpleDateFormat("w");
		DateFormat dateFormat2 = new SimpleDateFormat("u");
		DateFormat dateFormat3 = new SimpleDateFormat("W");
		DateFormat dateFormat4 = new SimpleDateFormat("d");
		DateFormat dateFormat5 = new SimpleDateFormat("y");
		Calendar cal = Calendar.getInstance();
		
		//getting time variables
	    String x = dateFormat.format(cal.getTime());
	    String b = dateFormat2.format(cal.getTime());
	    String rar = dateFormat3.format(cal.getTime());
	    String dom = dateFormat4.format(cal.getTime());
	    String year = dateFormat5.format(cal.getTime());
	    
	   //converting them to integers
	     int d = Integer.parseInt(dom);
	     int c = Integer.parseInt(rar);
	     int y = ((Integer.parseInt(x))/(4))-2;
	     int w = ((Integer.parseInt(b))-1);
	   
	 //setting class variables
	   Keeptime.currentMonth = y;
	   Keeptime.currentDay = w;
	   Keeptime.currentWeekofMonth = (c-1);
	   Keeptime.currentDayofMonth = d;
	   Keeptime.currentYear = year;
	   
	  //System.out.println(w);
	   
	   
	   

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
	
	if(currentDay==0){
		return 1;
       }
	if(currentDay==1){
		return 2;
       }
	if(currentDay==2){
		return 3;
	   }
	if(currentDay==3){
		return 4;
	}
	if(currentDay==4){
		return 5;
	}
	if(currentDay==5){
		return 6;
	}
	if(currentDay==6){
		return 0;
	}
	else{
		return 0;
	}

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

