import java.io.*;
class demon9
{
  public static void main(String args [])
  {
	  double amount=0.0;
	  double rate=0.0;
	  int years=0;
	  try{
    DataInputStream in =new DataInputStream(System.in);
	String tempString;
	System.out.println("enter the principal amount");
	System.out.flush();
	tempString=in.readLine();
	System.out.println("enter the rate");
	System.out.flush();
	tempString=in.readLine();
	rate=Float.valueOf(tempString);
	System.out.println("enter the number of years");
	System.out.flush();
	tempString=in.readLine();
	years=Integer.parseInt(tempString);
  }
  catch(Exception e)
  {
	  System.out.println("the exception caught="+e.getMessage());
  }
  double interest=amount*rate*years;
  System.out.println("the interest is"+interest);
}
}