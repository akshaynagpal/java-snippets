import java.applet.* ;
import java.awt.* ;
import java.awt.event.* ;
/*
	<html>
<body>
	<applet code="Applet3" width=400 height=400>
	</applet>
</body>
</html>
*/	
public class Applet3 extends Applet implements ActionListener
	{
		String msg;
		TextField t1,t2;
		Label l;
		public void init()
			{
				Label l1= new Label("User Name");
				Label l2= new Label("Password");
				t1= new TextField(8);
			    t2= new TextField(8);
				t2.setEchoChar('*');
				Button b=new Button("Go");
				l=new Label(" ");
				add(l1);   add(t1);
				add(l2);   add(t2);
				add(b);    
				add(l);
				b.addActionListener(this);
				}
		public void actionPerformed(ActionEvent ae)
			{
			String str1=t1.getText();
			String str2=t2.getText();
			if(str1.equals("aaa")&&str2.equals("bbb"))
				{ msg="Access granted";
				l.setText(msg);
			}
			else
				{
					msg="Access Denied.";
					l.setText(msg);
					}
					//repaint();
			}
	//public void paint(Graphics g)
	//	{
	//		g.drawString(msg,20,50);
	//		}	
		
	}