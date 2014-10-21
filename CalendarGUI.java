import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CalendarGUI {

	static String[] months = new String[12];
	static String[] days = new String[7];
	JButton[][] manybuttons = new JButton[5][7];
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	
public CalendarGUI()
{
	JFrame frame1 = new JFrame("Calendar");
	
	
	frame1.setEnabled(true);
	frame1.setVisible(true);
	frame1.setSize(1050,750);
	frame1.setBackground(Color.BLACK);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.setLocationRelativeTo(null);

	addButtons();
	panel1.setLayout(new GridLayout(5,7));
	panel2.setLayout(new BorderLayout());
	panel2.add(panel1,BorderLayout.CENTER);
	frame1.getContentPane().add(panel2);
	}
	
	
public void addButtons()
{
	for(int r=0;r<5;r++)
	{
		for(int l=0;l<7;l++)
		{
    
			manybuttons[r][l] = new JButton(days[l]);
			manybuttons[r][l].addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event){
			new DateInfo();
		}
	});
	
			panel1.add(manybuttons[r][l]);
	
	}
	  
  }
	
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



