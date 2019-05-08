class ThreadA extends Thread
{
  public void run()
  {
    for(int i=0;i<=5;i++)
	{
	  System.out.println("we are in thread one"+-1*i);
	  
	}
	System.out.println("exiting from thread A");
  }
}
class ThreadB extends Thread
{
  public void run()
  {
    for(int i=0;i<=5;i++)
	{
	  System.out.println("we are in thread one"+2*i);
	  
	}
	System.out.println("exiting from thread B");
  }
}
class ThreadC extends Thread
{
  public void run()
  {
    for(int i=0;i<=5;i++)
	{
	  System.out.println("we are in thread one"+(2*i-1));
	  
	}
	System.out.println("exiting from thread C");
  }
}
public class demon
{
  public static void main(String [] args)
  {
    ThreadA a=new ThreadA();
	ThreadB b=new ThreadB();
	ThreadC c=new ThreadC();
	a.start();
	b.start();
	c.start();
  }
}