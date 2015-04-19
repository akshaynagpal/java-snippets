import java.awt.* ;
import java.awt.event.* ;
import java.applet.* ;
/*
<applet code = "MouseKey" width=300 height=300>
</applet>
*/
public class MouseKey extends Applet implements MouseListener, MouseMotionListener,KeyListener {
	String msg="", msg2="";
	int mouseX = 0, mouseY=0;

	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
	}

public void keyPressed(KeyEvent ke){
	showStatus("Key pressed.");
}
public void keyReleased(KeyEvent ke){
    showStatus("Key released.");
}

public void keyTyped(KeyEvent ke){
	msg2+=ke.getKeyChar();
	repaint();
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
	g.drawString(msg2,10,20);
}
}