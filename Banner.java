
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Banner extends Applet implements Runnable {
    
    String msg = "A simple moving banner!";
    private boolean stopFlag;
    private Thread t;
    
    @Override
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
    }
    
    @Override
    public void start(){
        t = new Thread(this);
        stopFlag=false;
        t.start();
    }
    
    @Override
    public void paint(Graphics g){
        g.drawString(msg,50,30);
    }

    @Override
    public void run() {
        char ch;
        for( ; ; ){
            repaint();
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(Banner.class.getName()).log(Level.SEVERE, null, ex);
            }
            ch = msg.charAt(0);
            msg = msg.substring(1,msg.length());
            msg += ch;
            if(stopFlag)
                break;
        }
    }
    
    @Override
    public void stop(){
        stopFlag = true;
        t = null;
    }
}
