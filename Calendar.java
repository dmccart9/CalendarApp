
public class Calendar {

    static String[]months = new String[12];
	static String[]days = new String[7];
	
	
	public Calendar()
	{
		
	}
	public Calendar(String[] month, String[] day)
	{
		
		
		
		for(int i=0;i<12;i++){
		Calendar.months[i]=month[i];
		}
		for(int f=0;f<7;f++){
		
		Calendar.days[f]=day[f];
		}
		
	}
	
	public String getMonth()
	{
		
		
		return months[1];
		
	}


}
