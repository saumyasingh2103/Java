class ThreadId extends Thread
{
  public void run()
  {
    try
	{
	  System.out.println("Thread"+Thread.currentThread().getId()+"is running");
	}
	catch(Exception e)
	{
	  System.out.println("exception is caught");
	}
  }
}
public class demon3
{
  public static void main(String [] args)
  {
    int n=8;
	for(int i=0;i<=8;i++)
	{
	  ThreadId object=new ThreadId();
	  object.start();
	}
  }
}