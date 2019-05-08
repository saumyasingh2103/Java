import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.TextField.*;
public class Ap_calc extends Applet implements ActionListener
{
  TextField one,two,res;
  Button add,sub,mul,div;
  public void init()
  {
    Label l1=new Label("first number:",Label.RIGHT);
	Label l2=new Label("second number:",Label.RIGHT);
	Label l3=new Label("first number:",Label.RIGHT);
	one=new TextField();
	two=new TextField();
	res=new TextField();
	
	add=new Button("add");
	sub=new Button("subtract");
	mul=new Button("multiply");
	div=new Button("divide");
	
	add(l1);
	add(one);
	add(l2);
	add(two);
	add(l3);
	add(res);
	
	add(add);
	add(sub);
	add(mul);
	add(div);
	
	one.addActionListener(this);
	two.addActionListener(this);
	res.addActionListener(this);
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
	String str=ae.getActionCommand();
    float b1,b2,b3=0;
    String msg;
    b1=Float.parseFloat(one.getText());
    b2=Float.parseFloat(two.getText());

  if(str.equals("add"))
    b3=b1+b2;
  if(str.equals("subtract"))
    b3=b1-b2;
if(str.equals("multiply"))
    b3=b1*b2;
if(str.equals("divide"))
    b3=b1/b2;
msg=String.valueOf(b3);
res.setText(msg);
repaint();
  }
  public void paint(Graphics g)
  {}
}

/*<applet code="Ap_calc.class" width=200 height=200 >
</applet>
*/