import java.io.*;
class demon10
{
  public static void main(String [] args)
  {
	  try
	  {
    FileOutputStream fout=new FileOutputStream("C:/saumya/my_fun.txt");
	fout.write(65);
	fout.close();
	System.out.println("writing is over");
  }catch(Exception e)
  {System.out.println(e);}
  }
}