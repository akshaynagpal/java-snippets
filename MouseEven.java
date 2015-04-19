import java.awt.* ;
import java.awt.event.* ;
import java.applet.* ;
/*
<applet code = "MouseEvents" width=300 height=300>
</applet>
*/
public class MouseEven extends Applet implements MouseListener, MouseMotionListener {
	String msg="";
	int mouseX = 0, mouseY=0;

	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}

public void mouseClicked(MouseEvent me){
	mouseX = me.getX();
	mouseY = me.getY();
	showStatus("Mouse clicked. \n"+ mouseX+" , "+mouseY );
	repaint();
}

public void mouseEntered(MouseEvent me){
	mouseX= me.getX();
	mouseY= me.getY();
	showStatus("Mouse entered. \nX:"+ mouseX+" ,Y:"+mouseY );
	repaint();
}

public void mouseExited(MouseEvent me){
	showStatus("Mouse exited.");
	repaint();
}

public void mousePressed(MouseEvent me){
	mouseX= me.getX();
	mouseY= me.getY();
	showStatus("Mouse pressed. \nX:"+ mouseX+" ,Y:"+mouseY );
	repaint();
}

public void mouseReleased(MouseEvent me){
	mouseX= me.getX();
	mouseY= me.getY();
	showStatus("Mouse released. \nX:"+ mouseX+" ,Y:"+mouseY );
	repaint();
}

public void mouseDragged(MouseEvent me){
	mouseX= me.getX();
	mouseY= me.getY();
	msg="*";
	showStatus("Mouse dragged \n X:"+ mouseX+" ,Y:"+mouseY);
	repaint();
}

public void mouseMoved(MouseEvent me){
    mouseX= me.getX();
	mouseY= me.getY();
 showStatus("Moving mouse. \n X:"+mouseX+" ,Y:"+mouseY);
 repaint();
}

public void paint(Graphics g){
	g.drawString(msg,mouseX,mouseY);
}
}