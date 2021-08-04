import java.awt.*;
import java.awt.event.*;
public class FirstProgram2 extends Frame {
	Label l1,l2;
	Button b1,b2,b3;
	TextField t1,t2;
	public FirstProgram2()
	{
     setSize(700,400);
     setLocationRelativeTo(this);
     setBackground(Color.red);
     setUndecorated(true);
     setTitle("MyFrame");
     setLayout(new FlowLayout());
     l1=new Label("Username");
     l2=new Label("Password");
     t1=new TextField(10);
     t2=new TextField(10);
     b1=new Button("SAve");
     b2=new Button("REset");
    add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);
     addWindowListener(new WindowAdapter() {
    	 @Override
    	 public void windowClosing(WindowEvent e)
    	 {
    		
    		 System.exit(0);}
	});
    }
     public static void main(String args[])
	{
		FirstProgram2 obj=new FirstProgram2();
		obj.setVisible(true);
	}
	}
