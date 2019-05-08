class Account
{
  public int balance;
  public int accntno;
  void display()
  {
   System.out.println("account_no\t"+accntno+"\tbalance="+balance);
  }
  synchronized void deposit(int amount)
  {
     balance=balance+amount;
	 System.out.println("amount deposited"+amount);
	 display();
  }
  synchronized void withdraw(int amount)
  {
    balance=balance-amount;
	System.out.println("amount withdrawn"+amount);
	display();
  }
}
class Deposit implements Runnable
{
  int amount;
Account accountx;
 Deposit(Account x,int amount)
 {
    accountx=x;
	this.amount=amount;
	new Thread(this).start();
 } 
 public void run()
 {
   accountx.deposit(amount);	 
 }
}
class Withdraw implements Runnable
{
  int amount;
Account accountx;
 Withdraw(Account x,int amount)
 {
    accountx=x;
	this.amount=amount;
	new Thread(this).start();
 } 
 public void run()
 {
   accountx.withdraw(amount);	 
 }
}
class demon8 
{
public static void main(String [] args)
{
	Account abc=new Account();
	abc.balance=1000;
	abc.accntno=111;
	Deposit d1=new Deposit(abc,600);
	Withdraw d2=new Withdraw(abc,500);
}	
}