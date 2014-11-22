
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyEvents extends Applet implements KeyListener{
    
    String msg = "";
    int X=10, Y=20;
    
    @Override
    public void init(){
        setSize(1000, 500);
        addKeyListener(this);
    }
    @Override
    public void keyPressed(KeyEvent ke){
        showStatus("Key Down");
    }
    @Override
    public void keyReleased(KeyEvent ke){
        showStatus("Key UP");
    }
    @Override
    public void keyTyped(KeyEvent ke){
        msg += ke.getKeyChar();
        showStatus(ke.getKeyChar()+" pressed");
        repaint();
    }
    @Override
    public void paint(Graphics g){
        g.drawString(msg,X,Y);
    }
}
