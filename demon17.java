import java.io.*;
class demon17
{
  public static void main(String [] args)throws IOException
  {
    FileOutputStream f1=new FileOutputStream("c:/saumya/my_outfile");
	BufferedOutputStream b1=new BufferedOutputStream(f1);
	String s1="i am saumya";
	byte byteread []=s1.getBytes();
	b1.write(byteread);
	b1.flush();
	b1.close();
	f1.close();
	System.out.println("success");
  }
}