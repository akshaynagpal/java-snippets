
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MouseEvents extends Applet implements MouseListener, MouseMotionListener{
    
    String msg= "";
    int mouseX = 0, mouseY = 0;
    
    @Override
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent me){
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse Clicked";
        repaint();
    }
    
    @Override
    public void mouseMoved(MouseEvent me){
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse entered";
        repaint();
    }
    @Override
    public void mouseExited(MouseEvent me){
        mouseX = 0;
        mouseY =10;
        msg="Mouse exited";
        repaint();        
    }
    
    @Override
    public void mousePressed(MouseEvent me){
        mouseX = 0;
        mouseY =10;
        msg="Mouse pressed";
        repaint();
    }
    
    @Override
    public void mouseDragged(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg="mouse dragged";
        showStatus("mouse drag at "+mouseX +","+ mouseY);
        repaint();
    }
    
    @Override
    public void mouseReleased(MouseEvent me){
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }

    
    
   
    @Override
     public void mouseEntered(MouseEvent e) {
         showStatus("Mouse Entered");
         repaint();
     
    }
     
    @Override
    public void paint(Graphics g){
        g.drawString(msg,mouseX,mouseY);
    }
    
}
