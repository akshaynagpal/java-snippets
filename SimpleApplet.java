import java.awt.* ;
import java.applet.* ;
/*

	<html>
<body>
	<applet code="SimpleApplet" width=200 height=200>
		<Param name="name" value="">
			<Param name="img" value="p5.jpg">
	</applet>
</body>
</html>
*/	
public class SimpleApplet extends Applet
	{
		String msg;
		Image img;
		AudioClip ac;
		
		public void init()
			{
				setBackground(Color.yellow);
				setForeground(Color.red);
				msg=getParameter("name");
				if(msg==null)
					msg="No message given!";
					msg="Hello " + msg;
					img=getImage(getDocumentBase(),getParameter("img"));
					ac = getAudioClip(getCodeBase(),"Alarm09.wav");
					ac.play();
				}
		public void paint(Graphics g)
		{
			g.drawString(msg,20,20);
		//	g.drawImage(img,30,30,this);
		}
	}	
	