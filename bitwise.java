import java.util.*;
class bitwise
{
   public static void main(String [] args)
   {
      String ch;
	  int num1,num2,result;
	  Scanner sc=new Scanner(System.in);
      System.out.println("enter the choice");
	  ch=sc.next();
	  System.out.println("enter binary number 1");
	  num1=sc.nextInt();
	  System.out.println("enter binary number 2");
	  num2=sc.nextInt();
	  switch(ch)
	  {
	    case "&":
		result=num1&num2;
		System.out.println("THE AND OF NUM1 AND NUM2 ="+result);
		break;
		
		case "|":
		result=num1|num2;
		System.out.println("THE OR OF NUM1 AND NUM2 ="+result);
		break;
		
		case "<<":
		result=num1<<1;
		System.out.println("THE left shift OF NUM1 AND NUM2 ="+result);
		break;
		
		case ">>":
		result=num1>>1;
		System.out.println("THE right shift OF NUM1="+result);
		break;
		
		case "~":
		result=~num1;
		System.out.println("THE NOT EQUAL TO OF NUM1 ="+result);
		break;
	
		case "^":
		result=num1^num2;
		System.out.println("THE EX-OR OF NUM1 AND NUM2 ="+result);
		break;
		
		default:
		System.out.println("INVALID CHOICE");
		break;
	  }
   }
}