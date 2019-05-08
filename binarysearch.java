import java.lang.*;
import java.util.*;
import java.io.*;

class binarysearch
{
  int i,item,num,low,mid,high;
   Scanner sc=new Scanner(System.in);
   int a[]=new int[100];
  void input()
  {  
     System.out.println("enter the max size of array");
	 num=sc.nextInt();
	 
		System.out.println("enter the array elements");
	  for(i=0;i<num;i++)
	  {
        a[i]=sc.nextInt();		  
	  }
	  
  }
  
  void search(int item)
  {
	  low=0;
	  high=num-1;
	  mid=(low+high)/2;
	  while(low<=high)
	  {
        if(a[mid]<item)
        low=mid+1;
        else if(a[mid]==item)
		{
        System.out.println("element found at index"+mid);
        break;
		}
		else
		high=mid-1;	
	  mid=(low+high)/2;
	  }
	  if(low>high)
		  System.out.println("not found");
  }
}

class test
{
	public static void main(String args[])
	{
		int item;
      binarysearch br=new binarysearch();
       br.input();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the element to be searched");
	  item=sc.nextInt();
        	
        br.search(item);
	}
}