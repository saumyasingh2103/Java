public class demon7 extends Thread
{
  public static int x=0;
  public void run()
  {
    for(int i=0;i<1000;i++)
	{
	  x=x+1;
	  x=x-1;
	}
  }
  public static void main(String [] args)
  {
    int x=0;
	for(int i=0;i<1000;i++)
	{
	  new demon7().start();
	  System.out.println(x);
	}
  }
}