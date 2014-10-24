import javax.swing.*;
@SuppressWarnings("serial")
public class DateInfo extends JFrame{

	String t = "";

	public DateInfo(String s)
	{   
	
		
		this.t=s;
		
		
		new JFrame();
		setTitle(t);
		setSize(750,750);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setEnabled(true);
		setVisible(true);
		
	}
	
	
}
