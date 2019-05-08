import java.io.*;
class demon15
{
  public static void main(String [] args)
  {
    try
	{
	  File infile=new File("C:/saumya/my_fun");
	  File outfile=new File("C:/saumya/my_outfun");
	  FileReader f1=new FileReader(infile);
	  FileWriter f2=new FileWriter(outfile);
	  char ch;
	  while((f1.read())!=-1)
	  {
	    f2.write(ch);
	  }
	}
	catch(Exception e)
	{
	  System.out.println(e);
	  System.exit(-1);
	}
	finally
	{
		try{
	  infile.close();
	 outfile.close();
	}
	catch(Exception e)
	{

	}
	}
  }
}
