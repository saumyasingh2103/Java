import java.io.*;
class demon12
{
  public static void main(String [] args)
  {
    String s="hello nptel.hope you are enjoying java programming";
    byte b[]=s.getBytes();
	try{
    FileOutputStream fout=new FileOutputStream("C:/saumya/my_fun");
	fout.write(b);
	System.out.println("the writing is over");
	fout.close();
  }catch(Exception e)
  {
	  System.out.println(e);
	  System.exit(-1);
  }
  }
}