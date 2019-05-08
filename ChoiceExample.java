import java.awt.*;
class ChoiceExample
{
  ChoiceExample()
  {
    Frame f=new Frame("this is frame");
	Choice l=new Choice();
	l.setBounds(100,100,75,75);
	l.add("item 1");
	l.add("item 2");
	l.add("item 3");
	f.add(l);
	f.setSize(600,600);
	f.setLayout(null);
	f.setVisible(true);
  }
  public static void main(String [] args)
  {
    new ChoiceExample();
  }
}