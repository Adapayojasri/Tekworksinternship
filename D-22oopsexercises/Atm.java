
import java.util.*;
class Account
  {
    int accountnumber;
    int balance;
    String name;
    void getDetails()
    {
      Scanner y=new Scanner(System.in);
  System.out.println("enter accountnumber is:");
      accountnumber =y.nextInt();
  System.out.println("enter accountnumber is:"+accountnumber);
System.out.println("enter account balance:");
      balance =y.nextInt();
System.out.println("enter account balance:"+balance);
  System.out.println("enter accountholdername:");
      name=y.next();
       System.out.println("enter accountholdername:"+name);
} 
    
    void checkbalance()
    {
    
  System.out.println("check the balance");
      System.out.println(balance);
    }
    void deposit()
    {
      int deposit;
      Scanner s=new Scanner(System.in);
  System.out.println("enter the amount to be deposit");
  deposit=s.nextInt();
      
      System.out.println("your total amount is"+(deposit+balance));
    }
    void withdraw()
    {
      int withdraw;
      Scanner s=new Scanner(System.in);
  System.out.println("enter the amount to be withdraw");
  withdraw=s.nextInt();
      System.out.println(withdraw);
      System.out.println("your total amount is"+(withdraw+balance));
    }

  }
class Atm
  {
    public static void main(String args[])
  {
  Account  b=new Account();
  b.getDetails();
  b.deposit();
  b.withdraw();
  
  
}
}