import java.applet.* ;
import java.awt.* ;
import java.awt.event.* ;
/*
	<html>
<body>
	<applet code="Applet2" width=400 height=200>
	</applet>
</body>
</html>
*/	
public class Applet2 extends Applet implements ActionListener
	{
		String msg;
		public void init()
			{
				
				Label l1= new Label("MS-Word");
				Label l2= new Label("MS-Excel");
				Label l3= new Label("MS-Paint");
				add(l1);
				add(l2);
				add(l3);
				Button b1= new Button("C");
				Button b2= new Button("C++");
				Button b3= new Button("Java");
				add(b1);
				add(b2);
				add(b3);
				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
			}
			public void actionPerformed(ActionEvent ae)
				{
					String str= ae.getActionCommand();
					if(str.equals("C"))
					msg="C is a procedural language.";
					else if(str.equals("C++"))
					msg="C++ is an object oriented language.";
					else
					msg="Oracle is a RDBMS.";
					repaint();
					}
			public void paint(Graphics g)
				{
					g.drawString(msg,10,50);
					}
	}		