import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class DemoJFrame extends JFrame{
	public DemoJFrame()
	{
		 setSize(500,300);
		 setLocationRelativeTo(this);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String args[])
	{
		 DemoJFrame obj=new DemoJFrame();
		 obj.setVisible(true);
	}

}
