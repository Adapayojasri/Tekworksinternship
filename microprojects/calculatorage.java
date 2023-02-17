import java.util.*;
class calculatorage
  {
    public static void main(String args[])
    {
      int year1,year2,difference;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the date of the birth year");
       year1 =s.nextInt();
      System.out.println("enter current year");
       year2 =s.nextInt();
      difference=year2-year1;
      System.out.println("your current age is"+difference);
      if(difference<18)
      {
        System.out.println("You are not eligible to vote");
      }
        else 
      {
        System.out.println("You are eligible to vote");       
       }
      }     
    }
