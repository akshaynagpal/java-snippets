import java.awt.* ;
import java.awt.event.* ;
import java.applet.* ;
/*
<applet code="Frame1" width=300 height=50>
</applet>
*/


class SampleFrame extends Frame{
	SampleFrame(String title){
		super(title);
	MyWindowAdapter adapter = new MyWindowAdapter(this);
	addWindowListener(adapter);
    }
public void paint(Graphics g){
	g.drawString("This is a frame window",10,40);
  }
}


class MyWindowAdapter extends WindowAdapter{
	SampleFrame sampleFrame;
	public MyWindowAdapter(SampleFrame sampleFrame){
		this.sampleFrame=sampleFrame;
	}
	public void WindowClosing(WindowEvent we){
		sampleFrame.setVisible(false);
	}
}

public class Frame1 extends Applet{
	Frame f;
	public void init(){
		f=new SampleFrame("A frame window.");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
	public void paint(Graphics g){
		g.drawString("This is an applet window.",10,20);
	}
}