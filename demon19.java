import java.io.*;
class demon19
{
  public static void main(String args[])throws IOException
  {
    FileInputStream f1=new FileInputStream("c:/saumya/my_outfile");
	FileInputStream f2=new FileInputStream("c:/saumya/my_outfun");
	SequenceInputStream s=new SequenceInputStream(f2,f1);
	int i;
	while((i=s.read())!=-1)
	{
	  System.out.print((char)i);
	}
	s.close();
	f1.close();
	f2.close();
  }
}