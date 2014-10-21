//import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CalendarGUI {

	static String[] months = new String[12];
	static String[] days = new String[7];
	
	
public CalendarGUI()
{
	

	
	JFrame frame1 = new JFrame("Calendar");
	
	     
	frame1.setEnabled(true);
	frame1.setVisible(true);
	frame1.setSize(500,500);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.setLocationRelativeTo(null);

	JButton[] manybuttons = new JButton[7];
	
	for(int r=0;r<6;r++){
	manybuttons[r] = new JButton(days[r]);
	manybuttons[r].addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event){
			new DateInfo();
		}
	});
	
	frame1.getContentPane().add(manybuttons[r],((r+1)*2));
	
	}
	

	
	
	/*button1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event){
			new DateInfo();
		}
	});*/
	

	

	//frame1.getContentPane().add(,BorderLayout.PAGE_END);
	
 }

public CalendarGUI(String[] month,String[] day)
{
	for(int x=0;x<12;x++){
		
	CalendarGUI.months[x]=month[x];
	}
	for(int j=0;j<7;j++)
	{
		CalendarGUI.days[j]=day[j];
	}
	}
			
		
	
}



