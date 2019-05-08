import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class SampleFrame extends Frame
{
  SampleFrame(String title)
  {
    super(title);
	MyWindowAdapter adapter=new MyWindowAdapter(this);
	addWindowListener(adapter);
  }
  public void paint(Graphics g)
  {
	  g.drawString("this is in frame window",10,20);
  }
}
public class MyWindowAdapter extends WindowAdapter
{
	SampleFrame sampleFrame;
	public MyWindowAdapter(SampleFrame sampleFrame)
	{
	this.sampleFrame=sampleFrame;
}
public void windowClosing(WindowEvent we)
{
	we.setVisible(false);
}
}

public class AppletFrame extends Applet
{
	Frame f;
	public void init()
	{
		f=new SampleFrame("a frame window");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void start()
	{
		f.setVisible(true);
	}
	public  void stop()
	{
		f.setVisible(false);
	}
	public void paint(Graphics g)
	{
		g.drawString("this is applet window",10,20);
	}
}

/*
<html>
<body>
<applet code="AppletLifeCycle.class" width=200 height=300>
</applet>
</body>
</html>
*/