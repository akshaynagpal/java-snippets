import java.awt.* ;
import java.awt.event.* ;
import java.applet.* ;
/*
<applet code="Frame1" width=300 height=50>
</applet>
*/

public class AppWindow extends Frame{
String keymsg="Keymsg.";
String mousemsg="";
int mouseX=30,mouseY=30;

	public AppWindow(){
		addKeyListener(new MyKeyAdapter(this));
		addMouseListener(new MyMouseAdapter(this));
    	addWindowListener(new MyWindowAdapter());
	}
	public void paint(Graphics g){
    g.drawString(keymsg,10,40);
    g.drawString(mousemsg,mouseX,mouseY); 
   	}

 public static void main(String args[]){
 	AppWindow appwin=new AppWindow();
 	appwin.setSize(new Dimension(300,200));
 	appwin.setTitle("An AWT based application");
 	appwin.setVisible(true);
 }
}

class MyKeyAdapter extends KeyAdapter{
	
	AppWindow appWindow;

	public MyKeyAdapter(AppWindow appWindow){
		this.appWindow=appWindow;
	}
    public void keyTyped(KeyEvent ke){
    	appWindow.
    }

}