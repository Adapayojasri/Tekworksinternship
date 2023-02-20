import java.util.*;
class leapyearornot
  {
    public static void number(int n1)
    {
    if(n1%100==0 && n1%400==0)
        System.out.println("n1 is a leapyear");
        else  if(n1%4==0 && n1%100!=0)
           System.out.println("n1 is a not leapyear");
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      leapyearornot y=new leapyearornot();
      y.number(n1); 
    }
  }