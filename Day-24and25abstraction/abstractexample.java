import java.util.*;
abstract class bank
  {
    abstract double intrestrate();
    abstract void annualprofit();
  }
  class sbi extends bank
    {
     double intrestrate()
      {
        return 7.69;
      }
    public  void annualprofit()
      {
        System.out.println("the annual profit is 30%");
      }
    }
   class icici extends bank
     {
        double intrestrate()
      {
        return 8.90;
      }
    public  void annualprofit()
      {
        System.out.println("the annual profit is 17%");
      }
     }
class abstractexample
  {
  public static void main(String args[])
    {
      // bank b=new bank();
     sbi SBI=new sbi();
      icici ICICI=new icici();
      System.out.println(SBI.intrestrate());
      SBI.annualprofit();
      System.out.println(ICICI.intrestrate());
      ICICI.annualprofit();
      
    }
  }