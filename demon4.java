class ClassA extends Thread
{
  public void run()
  {
	  System.out.println("starting thread A");
    for(int i=0;i<=5;i++)
	{
		if(i==1)
			yield();
	  System.out.println("From thread A"+i);
	}
	System.out.println("exiting from thread A");
  }
}
class ClassB extends Thread
{
  public void run()
  {
	  System.out.println("starting thread B");
    for(int j=0;j<=5;j++)
	{
		if(j==2)
			stop();
	  System.out.println("the value of j"+j);	  
	}
	System.out.println("exiting from thread B");
  }
}
class ClassC extends Thread
{
  public void run()
  {
    for(int k=0;k<=5;k++)
	{
		if(k==3)
		{
			try{
				sleep(5000);
			}catch(Exception e)
			{
			System.out.println("The exception is caught");
			}
		}  
	}
	System.out.println("exiting from thread C");
  }
}
class demon4
{
public static void main(String [] args)	
{
ClassA t1=new ClassA();
ClassB t2=new ClassB();
ClassC t3=new ClassC();
t1.start();
t2.start();
t3.start();
 	
}
}