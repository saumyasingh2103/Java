class Test
{
  public static void main(String [] args)
  {
    if(args.length>0)
	{
		System.out.println("command line argument");
	}
	for(String val:args)
	{
      System.out.println(val);
    }
  }
}