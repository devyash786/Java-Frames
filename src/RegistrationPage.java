import java.awt.*;
import java.awt.event.*;
public class RegistrationPage extends Frame implements ActionListener {
	
	Button b,b1;
	Frame f;
	public RegistrationPage(Frame f)
	{
     setSize(700,400);
     setLocationRelativeTo(this);
     setBackground(Color.cyan);
     setLayout(new FlowLayout());
     setTitle("Registration");
     b=new Button("Previous");
     b1=new Button("next");
     add(b);
     b.addActionListener(this);
     b1.addActionListener(this);
     this.f=f;
     addWindowListener(new WindowAdapter() {
    	 @Override
    	 public void windowClosing(WindowEvent e)
    	 {
    		 
    		 System.exit(0);;
    		  
    	 }
	});
     }
    @Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			f.setVisible(true);
			dispose();
		}
		
		
	}
	

}
