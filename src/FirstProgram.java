import java.awt.*;
import java.awt.event.*;
public class FirstProgram extends Frame implements ActionListener{
	Label l1,l2;
	Button b1,b2,b3;
	TextField t1,t2;
	public FirstProgram()
	{
     setSize(700,400);
     setLocationRelativeTo(this);
     setBackground(Color.red);
     //setUndecorated(true);
     setTitle("MyFrame");
     setLayout(new FlowLayout());
     l1=new Label("Username");
     l2=new Label("Password");
     t1=new TextField(10);
     t2=new TextField(10);
     b1=new Button("Save");
     b2=new Button("Reset");
     b3=new Button("Registration page");
     add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);add(b3);
     b3.addActionListener(this);
     addWindowListener(new WindowAdapter() {
    	 @Override
    	 public void windowClosing(WindowEvent e)
    	 {
    		
    		 System.exit(0);}
	});
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b3)
		{
			RegistrationPage obj=new RegistrationPage(this);
			obj.setVisible(true);
			dispose();
		}}
     public static void main(String args[])
	{
		FirstProgram obj=new FirstProgram();
		obj.setVisible(true);
	}
	}
