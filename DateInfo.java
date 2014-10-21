import javax.swing.*;
@SuppressWarnings("serial")
public class DateInfo extends JFrame{

	String t = "";

	public DateInfo(String s)
	{   
	
		
		this.t=s;
		
		
		new JFrame(t);
		setEnabled(true);
		setVisible(true);
		setSize(750,750);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	
	
}
