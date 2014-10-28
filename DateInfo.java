import java.awt.BorderLayout;
import java.awt.Dimension;


import java.sql.SQLException;

import javax.swing.*;
@SuppressWarnings("serial")
public class DateInfo extends JFrame{

	String t = "";
	
	
	public DateInfo(String s)
	{   
		DataBConnect getInfo = null;
		try {
			getInfo = new DataBConnect();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		this.t=s;
		
		
		new JFrame();
		setTitle(t);
		setSize(290,290);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		JLabel info = new JLabel();
		info.setPreferredSize(new Dimension(300,500));
		
		
		getContentPane().add(info, BorderLayout.CENTER);
		
		info.setText(getInfo.getEvent());
		
		
		
		
		
		
		info.setEnabled(true);
		info.setVisible(true);
		setEnabled(true);
		setVisible(true);
		
	}
	
	
}
