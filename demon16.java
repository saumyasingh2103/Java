import java.io.*;
class demon16
{
  public static void main(String [] args)
  {
    FileInputStream f1=null;
	FileOutputStream f2=null;
	byte byteread;
	try
	{
		f1=new FileInputStream("C:/saumya/my_fun");
		f2=new FileOutputStream("C:/saumya/my_outfun");
		byteread=(byte)f1.read();
		while(byteread!=-1)
		{
			f2.write(byteread);
			byteread=(byte)f1.read();
		}
	}
	catch(Exception e)
	{System.out.println(e);}
  }
}