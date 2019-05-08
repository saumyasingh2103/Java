import java.io.*;
class demon18
{
  public static void main(String [] args)
  {
	  try
	  {
    FileInputStream f1=new FileInputStream("c:/saumya/my_outfile");
	BufferedInputStream b1=new BufferedInputStream(f1);
	int i;
	while((i=b1.read())!=-1)
	{
		System.out.print((char)i);
	}
	b1.close();
	f1.close();
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
}
}