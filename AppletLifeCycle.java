import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class AppletLifeCycle extends Applet
{
StringBuffer strbuffer;
  public void init()
  {
    strbuffer=new StringBuffer();
	addItem("initializing the apple");
  }
  public void start()
  {
   addItem("starting the applet");
  }
  public void stop()
  {
   addItem("stoping the applet");
  }
  public void destroy()
  {
    addItem("unloading the applet");
  }
  public void addItem(String word)
  {
    System.out.println(word);
	strbuffer.append(word);
	repaint();
  } 
  public void paint(Graphics g)
  {
    g.drawRect(0,0,getWidth()-1,getHeight()-1);
	g.drawString(strbuffer.toString(),10,20);
  }
}

