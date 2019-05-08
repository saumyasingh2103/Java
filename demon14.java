import java.io.*;
class demon14
{
  public static void main(String [] args)
  {
	try{
    FileInputStream fin=new FileInputStream("C:/saumya/my_fun");
	int i;
	while((i=fin.read())!=-1)
	{
	System.out.print((char)i);
	//fin.close();
  }
  fin.close();
  }catch(Exception e)
  {
	  System.out.println(e);
	  System.exit(-1);
  }
  }
}