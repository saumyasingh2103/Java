import java.io.*;
class demon13
{
  public static void main(String [] args)
  {
	try{
    FileInputStream fin=new FileInputStream("C:/saumya/my_fun");
	int i=fin.read();
	System.out.println(i);
	fin.close();
  }catch(Exception e)
  {
	  System.out.println(e);
	  System.exit(-1);
  }
  }
}