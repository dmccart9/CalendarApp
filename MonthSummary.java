import javax.swing.*;


@SuppressWarnings("serial")
public class MonthSummary extends JFrame{

	Keeptime kt = new Keeptime();
	
	public MonthSummary()
	{
		
		setSize(500,500);
		setTitle(kt.getMonth());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setEnabled(true);
		setVisible(true);
		
		
		
	}
	
	
	
}
