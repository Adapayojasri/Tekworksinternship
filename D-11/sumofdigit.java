import java.util.*;
class sumofdigit
  {
    public static void main(String args[])
    {
      int n,digit,sum=0;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number");
       int n=s.nextInt();
      while(n>0)
        {
          digit=n%10;
          sum=sum+digit;
          n=n/10;
          System.out.println("sum of digits"+sum);
        }
    }
  }