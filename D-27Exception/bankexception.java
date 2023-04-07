//Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds
import java.util.*;
class bankexception
  {
    int balance=10000;
    void deposit() throws ArithmeticException
   { 
      Scanner s=new Scanner(System.in);
      System.out.println("enter the amount to be deposited :");
      int depositamount=s.nextInt();
      System.out.println(depositamount);
         if(depositamount<100)
         {
           throw new ArithmeticException("enter valid amounnt");
         }
         else
         {
           System.out.println("Total amount is " + (depositamount+balance));
         }
    }
      void withdraw() 
      throws Exception
   {
          Scanner s=new Scanner(System.in);
         System.out.println("enter the amount to be withdraw");
          int withdrawamount=s.nextInt();
          if(withdrawamount<0 && withdrawamount>balance)
          {
            throw new Exception("Enter the valid amount to be withdraw");
          }
          else
          {
            System.out.println("Total amount is"+(balance-withdrawamount));
          }   
    }
    void balance()
      {
      System.out.println("Your current balance is ");
      } 
    }
 class bankexceptionexample
   {
  public static void main(String args[]) 
  {
bankexception ce=new bankexception();
    ce.deposit();
   ce.withdraw();
    ce.balance();
  }
}
