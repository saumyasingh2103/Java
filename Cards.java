import java.awt.*;
public class Cards extends java.applet.Applet
{
  CardLayout layout;
  public void init()
  {
    layout=new CardLayout();
	setLayout(layout);
	add("1",new Button("card 1"));
	add("2",new Button("card 2"));
	add("3",new Button("card 3"));
	add("4",new Button("card 4"));
	add("5",new Button("card 5"));
  }
  public boolean keyDown(Event e,int key)
  {
    layout.previous(this);
	return true;
  }
}
/*<applet code="Cards.class" height=300 width=300 >
</applet>*/