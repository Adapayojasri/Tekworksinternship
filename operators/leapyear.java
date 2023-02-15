import java.util.Scanner;
class leapyear
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      if(n1%100==0 && n1%400==0)
      {
        System.out.println("n1 is a leapyear");
      }
         else if(n1%4==0 && n1%100!=100)
           System.out.println("n1 is a not leapyear");
    }
      }
