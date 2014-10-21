import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class CalendarGUI extends JFrame implements ActionListener{

	static String[] months = new String[12];
	static String[] days = new String[7];
	JButton[][] manybuttons = new JButton[5][7];
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	
public CalendarGUI()
{
	
	new JFrame("Calendar");
	
	setEnabled(true);
	setVisible(true);
	setSize(1050,750);
	setBackground(Color.BLACK);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);

	addButtons();
	panel1.setLayout(new GridLayout(5,7));
	panel2.setLayout(new BorderLayout());
	panel2.add(panel1,BorderLayout.CENTER);
	getContentPane().add(panel2);
	}
	
	
public void addButtons()
{
	for(int r=0;r<5;r++)
	{
		for(int l=0;l<7;l++)
		{
		
			manybuttons[r][l] = new JButton(days[l]);
			manybuttons[r][l].addActionListener(this);
					
					/*.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event){
			
			new DateInfo();
			
			
		}
	});*/
	        manybuttons[r][l].setFont(new Font("Arial",Font.PLAIN,20));
			
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


@Override
public void actionPerformed(ActionEvent e) {
	
	for(int w=0;w<days.length;w++)
	
		if (e.getSource()==days[w])
	{
		new DateInfo(days[w]);
		
	}
	
}
			
}



