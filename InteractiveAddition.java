
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class InteractiveAddition extends Applet implements KeyListener {
    
    TextField text1, text2;
    
    @Override
    public void init(){
        addKeyListener(this);
        text1 = new TextField();
        text2 = new TextField();
        text1.setText("0");
        text2.setText("0");
        add(text1);
        add(text2);
        text2.addKeyListener(this);
    }
    
    @Override
    public void paint(Graphics g){
        int num1 = 0, num2 = 0;
        int sum;
        String s1, s2, s3;
        
        g.drawString("Input a number in each box",10,50);
        try{
                s1 = text1.getText();
                num1 = Integer.parseInt(s1);
                s2 = text2.getText();
                num2 = Integer.parseInt(s2);
                
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        
        sum = num1 + num2;
        String str = "The sum is "+ String.valueOf(sum);
        g.drawString(str,100,125);
    }
    
    @Override
    public void keyTyped(KeyEvent ke){
        
    }
    
    @Override
    public void keyPressed(KeyEvent ke){
        if(ke.getKeyCode()==KeyEvent.VK_ENTER)
            repaint();
    }
    @Override
    public void keyReleased(KeyEvent ke){
        showStatus("Key up");
    }
}
