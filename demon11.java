import java.io.*;
class demon11
{
  public static void main(String [] args)
  {
    byte cities[]={'d','e','l','i'};
	try{
    FileOutputStream fout=new FileOutputStream("C:/saumya/my_fun");
	fout.write(cities);
	System.out.println("the writing is over");
	fout.close();
  }catch(Exception e)
  {
	  System.out.println(e);
	  System.exit(-1);
  }
  }
}