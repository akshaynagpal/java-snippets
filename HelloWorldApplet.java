

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;

public class HelloWorldApplet extends Applet {
   
    private TextField text1;
    private TextField text2;
    private TextField text3;
    private int p,r,t;
    private int interest;
    private Image image;
    
    @Override
    public void init(){
        setBackground(Color.blue);
       text1 = new TextField();
       text2 = new TextField();
       text3 = new TextField();
       text1.setText("0");
       text2.setText("0");
       text3.setText("0");
       image = getImage(getDocumentBase(),"p5.jpg");
       add(text1);
       add(text2);
       add(text3);
     
    }
    
    @Override
    public void paint(Graphics g){
       g.drawString("Enter P,R,t", 25, 25);
       g.drawLine(15,10,100,10);
       p=Integer.parseInt(text1.getText());
       r=Integer.parseInt(text2.getText());
       t=Integer.parseInt(text3.getText());
       interest = (p*r*t)/100;
       String str = "Interest is " + String.valueOf(interest);
       g.drawString(str, 25, 100);
       g.drawImage(image,200,200,this);
        showStatus("Status here");
    }
    
    @Override
    public boolean action(Event ev,Object obj){
        repaint();
        return true;
    }
}