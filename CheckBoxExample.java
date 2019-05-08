import java.awt.*;
public class CheckBoxExample extends Component
{
  CheckBoxExample()
  {
    Frame f=new Frame("CheckBoxExample1");
	Checkbox ch=new Checkbox("c++");
	ch.setBounds(100,100,50,50);
	Checkbox ch1=new Checkbox("java",true);
	ch1.setBounds(100,150,50,50);
	f.add(ch);
	f.add(ch1);
	f.setSize(600,600);
	f.setLayout(null);
	f.setVisible(true);
  }
  public static void main(String [] args)
  {
	 new CheckBoxExample();
  }
}