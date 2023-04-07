
import java.util.*;
class WithDrawException extends Exception
  {
    WithDrawException(String message)
    {
      super(message);
    }
  }
class atmexception
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
      try
        {
          balance=s.nextInt();
        }
      catch(InputMismatchException i)
        {
        System.out.println("balance should be in integers");
        checkbalance();
         }
  }
    void deposit()
    {
     System.out.println("enter the deposit amount");
      try
        {
          deposit=s.nextInt();
        }
      catch(InInputMismatchException i)
        {
          System.out.println("deposit amount should be in integers");
          System.out.println("your total amount is"+(deposit+balance));
          deposit();
     }
    void readwithdraw()
    {
      System.out.println("enter amount to be withdraw");
      try
        {
          withdrawamount=s.nextInt();
        }
      catch(InputMismatchException i)
        {
        System.out.println("withdraw amount should be in integres");
       readwithdraw();
      }      
    }
    void withdraw()
    {
      if((withdrawamount>balance)||(withdrawamount<0))
        try
          {
        throw new WithDrawException("withdraw amount should be less than the balance");        
           }
    catch(WithDrawException e)
      {
  System.out.println(e);
      }
   else
     {
  balance=balance-withdrawamount;
      }
    }
   }
  class Atm
     {
   public static void main(String args[])
    {
      System.out.println("enter number of bank customers");
      Scanner s=new Scanner(System.in);
      int numberofcustomers=s.nextInt();
      bankexception b[]=new bankexception[numberofcustomers];
      for(int i=0;i<numberofcustomers;i++)
        {
          b[i]=new bankexception();
          b[i]=getDetails();
        b[i].checkbalance();
          b[i].deposit();    
         b[i]. readwithdraw();
          b[i].withdraw();
        }
    }
}