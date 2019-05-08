class ThreadA extends Thread
{
  public void run()
  {
    for(int i=0;i<=5;i++)
	{
	  System.out.println("we are in thread one"+i);
	  
	}
	System.out.println("exiting from thread A");
  }
}
class ThreadB extends Thread
{
  public void run()
  {
    for(int j=0;j<=5;j++)
	{
	  System.out.println("we are in thread one"+j);
	  
	}
	System.out.println("exiting from thread B");
  }
}
class ThreadC extends Thread
{
  public void run()
  {
    for(int k=0;k<=5;k++)
	{
	  System.out.println("we are in thread one"+k);
	}
	System.out.println("exiting from thread C");
  }
}
class demon6
{
 public static void main(String [] args)
 {
   ThreadA t1=new ThreadA();
   ThreadB t2=new ThreadB();
   ThreadC t3=new ThreadC();
   t3.setPriority(Thread.MAX_PRIORITY);
   t2.setPriority(t2.getPriority()+1);
   t1.setPriority(Thread.MIN_PRIORITY);
   t3.start();
   t1.start();
   t2.start();
 }
}