class Thread1 extends Thread
{
  public void run()
  {
			try
			{
			System.out.println("first thread start running");
				sleep(5000);
				System.out.println("first thread finishes running");
			}catch(Exception e){} 
	}
}
class Thread2 extends Thread
{
  public void run()
  {
			try
			{
			System.out.println("second thread start running");
			System.out.println("second thread suspended");
				suspend();
				System.out.println("second thread finishes running");
			}catch(Exception e){} 
	}
}
class demon5
{
public static void main(String [] args)	
{
Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
t1.start();
t2.start();
t2.resume();
t2.sleep(1000);

	
}
}
