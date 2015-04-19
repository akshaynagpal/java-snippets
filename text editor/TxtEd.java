import java.awt.* ;
import java.awt.event.* ;
import java.applet.* ;
/*
<applet code="TxtEd" width=500 height=500></applet>
*/

class MenuFrame extends Frame{
	CheckboxMenuItem debug,test;
	String msg="";

  public MenuFrame(String title){
	super(title);
	MenuBar mbar= new MenuBar();
	setMenuBar(mbar);
	Menu file=new Menu("File");
	MenuItem item1,item2,item3,item4,item5;

	file.add(item1=new MenuItem("New.."));
	file.add(item2=new MenuItem("Open.."));
	file.add(item3=new MenuItem("Save.."));
	file.add(item4=new MenuItem("Save As.."));
	file.add(item5=new MenuItem("EXIT"));
	mbar.add(file);

	Menu edit=new Menu("Edit");
	MenuItem item6,item7,item8,item9;

	edit.add(item6=new MenuItem("Cut.."));
	edit.add(item7=new MenuItem("Copy.."));
    edit.add(item8=new MenuItem("Paste.."));   
    edit.add(item9=new MenuItem("Select All.."));
    mbar.add(edit); 

    Menu task= new Menu("Task");

    task.add(debug=new CheckboxMenuItem("Debug.."));
    task.add(test=new CheckboxMenuItem("Test.."));
    mbar.add(task);

    MyMenuHandler handler = new MyMenuHandler(this);

    item1.addActionListener(handler);
    item2.addActionListener(handler);
    item3.addActionListener(handler);
    item4.addActionListener(handler);
    item5.addActionListener(handler);
    item6.addActionListener(handler);
    item7.addActionListener(handler);
    item8.addActionListener(handler);
    item9.addActionListener(handler);
    debug.addItemListener(handler);
    test.addItemListener(handler);

    MyWindowAdapter adapter=new MyWindowAdapter(this);
    addWindowListener(adapter);
}

  public void paint(Graphics g){
	           g.drawString(msg,10,200);
	
	           if(debug.getState())
		          g.drawString("Debug is on.",10,220);
	           else
		          g.drawString("Debug is off.",10,220);
    
             if(test.getState())
    	           g.drawString("Test is on.",10,240);
             else
    	           g.drawString("Test is off.",10,240);
            }

   
}

class MyWindowAdapter extends WindowAdapter{
	MenuFrame menuFrame;
	public MyWindowAdapter(MenuFrame menuFrame){
		this.menuFrame=menuFrame;
	}
   public void WindowClosing(WindowEvent we){
   	menuFrame.setVisible(false);
   }
}

class MyMenuHandler extends TxtEd implements ActionListener, ItemListener {
	MenuFrame menuFrame;
	public MyMenuHandler(MenuFrame menuFrame)
    {
        this.menuFrame=menuFrame;
	}

            public void actionPerformed(ActionEvent ae)
            {
                String msg="You selected ";
                String arg=ae.getActionCommand();
                    switch(arg)
                    {
         	                  case "New.." : msg+="New.";
         					                  break;
         	                  case "Open..": msg+="Open.";
         					                  break;
         	                  case "Save..": msg+="Save.";
         					                  break;
         	                  case "Save As..": msg+="Save As.";
         					                   break;
         	                  case "EXIT":   stop();
         					                  break;
         	                  case "Cut..": msg+="Cut.";
         					                  break;
         	                  case "Copy..": msg+="Copy.";
         					                  break;
                              case "Paste..": msg+="Paste.";
                                              break;
                              case "Select All..": msg+="Select All.";
                                              break;
                              case "Debug..": msg+="Debug."; 
                                                break;
                              case "Test.." : msg+="Test.";
                                                break;
                    }
              menuFrame.msg= msg;
              menuFrame.repaint();

            }
    public void itemStateChanged(ItemEvent ie){
        menuFrame.repaint();
    }

}

  public class TxtEd extends Applet {

    Frame f;
    public void init(){
        f=new MenuFrame("Menu Demo.");
        int width= Integer.parseInt(getParameter("width"));
        int height=Integer.parseInt(getParameter("height"));
        setSize(new Dimension(width,height));
       f.setSize(width,height);
       f.setVisible(true);
    }

    public void start(){
        f.setVisible(true);
    }
   
    public void stop(){
        f.setVisible(false);
    }

}