package p2;
import java.util.*;
public class employee
{
  public void employee1()
  {
	int id;
	String name;
	Scanner sc=new Scanner(System.in);
    System.out.println("HELLO");
	System.out.println("enter the employee id and name who is issuing the book");
    id=sc.nextInt();
	name=sc.next();
	if(id==12 || id==13|| id==420)
	{
     System.out.println("Hi "+name+" Yes!please issue the book to student/faculty");		
	}
	else
	{
	System.out.println("Hi "+name+" Not allowed to issue book to student/faculty!!!!");	
    
	}
  }
}