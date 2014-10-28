import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Color;



import javax.swing.*;


@SuppressWarnings("serial")
public class CalendarGUI extends JFrame implements ActionListener {

	static String[] months = new String[12];
	static String[] days = new String[7];
	static int[] dateDay = new int[366];
	static int monthTracker=0;
	static int dateDayIndex=0;
	static int oneTime=0;
	
	
	JButton[][] manybuttons = new JButton[5][7];
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JButton b3 = new JButton();
	Keeptime cld = new Keeptime();
	
	
public CalendarGUI(String[] month,String[] day, int[] dateInYear)
{
	
	for(int x=0;x<12;x++){
		CalendarGUI.months[x]=month[x];
		}
	for(int j=0;j<7;j++){
			CalendarGUI.days[j]=day[j];
		}
	for(int z=0;z<366;z++){
		CalendarGUI.dateDay[z]=dateInYear[z];
	//System.out.println(CalendarGUI.dateDay[z]);
	}
	
}

public CalendarGUI()
{
	
	//System.out.println("Hello");
	
		
	
	new JFrame();
	
	
	setSize(1050,750);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setTitle("Calendar");
	panel1.setLayout(new GridLayout(5,7));
	addButtons();
	
	panel2.setLayout(new BorderLayout());
	panel2.add(b3,BorderLayout.NORTH);
	panel2.add(panel1,BorderLayout.CENTER);
	

	getContentPane().add(panel2);
	setEnabled(false);
	setVisible(false);
	
}
	
	
public void addButtons()
{
	b3.setPreferredSize(new Dimension(500,100));
	//b3.setText(days[0] + ", " + months[0] + " " + dateDay[] + ", " + cld.getYear());
	b3.setBackground(Color.white);
	b3.addActionListener(this);
	b3.setToolTipText("Month Summary");
	
	
	for(int r=0;r<5;r++)
	{
		for(int l=0;l<7;l++)
		{
			if(l<3 && r==0 && CalendarGUI.oneTime<3)
			{
				manybuttons[r][l]=new JButton();
				manybuttons[r][l].addActionListener(this);
		        manybuttons[r][l].setFont(new Font("Arial",Font.PLAIN,20));
		        CalendarGUI.oneTime++;
				
			}else {
				manybuttons[r][l] = new JButton(String.valueOf(dateDay[dateDayIndex]));
				manybuttons[r][l].addActionListener(this);
		        manybuttons[r][l].setFont(new Font("Arial",Font.PLAIN,20));
		       
		    	if(dateDay[dateDayIndex]==1 && r>1)
				{
					int temp=r;
					while(temp<5){
						for(int temp2=l;temp2<7;temp2++){
							manybuttons[temp][temp2]=new JButton();
							manybuttons[temp][temp2].addActionListener(this);
					        manybuttons[temp][temp2].setFont(new Font("Arial",Font.PLAIN,20));
							
						}
						
						return;
					}
				}
		        
		        
		        
		        dateDayIndex++;
		        System.out.println(dateDayIndex);
		        
			}
			
			
			
		
				
	        int y = 0;
	        int x = 0;
	        y = cld.getCurrentWeek();
	        x = cld.getNumDay();
	        
	       if(manybuttons[r][l]==manybuttons[y][x])
	        		{
	  
	    	   manybuttons[r][l].setBackground(Color.yellow);
	    	   
	        		}else
	        			manybuttons[r][l].setBackground(Color.white);
			
	        panel1.add(manybuttons[r][l]);
	        
	  
	   
	}
	  
  }
	  /*if(cld.getMonth().equals(months[9]));
      {
    	  manybuttons[4][6].setEnabled(false);
   	   for(int cs=0;cs<1;cs++)
   	   {
   		   for(int q=0;q<=2;q++)
   		   {
   			   manybuttons[cs][q].setEnabled(false);
   		   }
   	   }
      }*/
	
}

public CalendarGUI(String[] month,String[] day)
{
	 
	  }
public void actionPerformed(ActionEvent e) {
	
	for(int k=0;k<5;k++)
	{
		for(int z=0;z<7;z++)
		{
	if(e.getSource()==manybuttons[k][z]){
		
	new DateInfo(days[z]);
	 }
	   
		}
	}
	
	if(e.getSource()==b3)
	{
		new MonthSummary();
		
	}
	
                                           }


}