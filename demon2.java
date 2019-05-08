class ThreadA implements Runnable
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
class ThreadB implements Runnable
{
  public void run()
  {
    for(int i=0;i<=5;i++)
	{
	  System.out.println("we are in thread two"+2*i);
	  
	}
	System.out.println("exiting from thread B");
  }
}
/*
class ThreadC implements Runnable
{
  public void run()
  {
    for(int i=0;i<=5;i++)
	{
	  System.out.println("we are in thread one"+(2*i-1));
	  
	}
	System.out.println("exiting from thread C");
  }
}*/
public class demon2
{
  public static void main(String [] args)
  {
    ThreadA a=new ThreadA();
	Thread t1=new Thread(a);
	
	ThreadB b=new ThreadB();
	Thread t2=new Thread(b);
	
	
	//Thread t3=new Thread(new ThreadC());
	t1.start();
	t2.start();
	//t3.start();
  }
}