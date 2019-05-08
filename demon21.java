import java.io.*;
class demon21
{
  public static void main(String [] args)
  {
  try
  {
    RandomAccessFile file=new RandomAccessFile("c:/saumya/my_outfile","rw");
	file.writeChar('X');
	file.writeInt(8);
	file.writeDouble(3.298);
	file.seek(0);
	System.out.println(file.readChar());
	System.out.println(file.readInt());
	System.out.println(file.readDouble());
	
	file.seek(2);
	System.out.println(file.readInt());
	
	file.seek(file.length());
	file.writeBoolean(false);
	file.seek(4);
	System.out.println(file.readBoolean());
	file.close();
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
 }
}