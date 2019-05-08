import java.io.*;
class ClassTest
{
  public static void main(String [] args)throws IOException
  {
	 
	  int i;
  File h;
    if(args.length>0)
	{
	  for(i=0;i<args.length;i++)
	  {
	    h=new File(args[i]);
		getpaths(h);
		getinfo(h);
	  }
	}
	else
	System.out.println("-----------");
}
	 

public static void getpaths(File f)throws IOException
{
  System.out.println("name"+f.getName());
  System.out.println("path"+f.getPath());
  System.out.println("parent"+f.getParent());
}
public static void getinfo(File f)throws IOException
{
  if(f.exists())
  {
   System.out.println("FILE EXISTS");
   System.out.println(f.canRead() ? "and is readable":"");
   System.out.println(f.canWrite() ? "and is writable":"");
    System.out.println("file was last modified"+f.lastModified());
	 System.out.println("length of file="+f.length());
  }
  else
  System.err.println("file does not exists");
}
}