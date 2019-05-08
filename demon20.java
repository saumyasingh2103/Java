import java.io.*;
class demon20
{
  public static void main(String args[])throws IOException
  {
    FileInputStream f1=new FileInputStream("c:/saumya/my_outfile");
	FileInputStream f2=new FileInputStream("c:/saumya/my_outfun");
	SequenceInputStream s=new SequenceInputStream(f1,f2);
	BufferedInputStream b1=new BufferedInputStream(s);
	BufferedOutputStream b2=new BufferedOutputStream(System.out);
	int i;
	while((i=b1.read())!=-1)
	{
	  System.out.print((char)i);
	}
	b1.close();
	b2.close();
	s.close();
	f1.close();
	f2.close();
  }
}