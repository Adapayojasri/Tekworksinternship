import java.util.*;
class example1
  {
    public static void  display(String x,String y)
     {
       if(x&&y)
         {
            System.out.println(false);
         }
       else if(x||y )
         {
            System.out.println(true);
          }
       else if(!x)
       {
          System.out.println(false);
        }
      else if(!y)
      {
        System.out.println(true);
      }
     }
public static void main(String args[])
  {
    int x,y;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of x:");
    x=sc.next();
    System.out.println("The value of x is"+x);
    System.out.println("Enter the value of y:");
    y=sc.next();
    System.out.println("The value of y is"+y);
    display(x,y);
  }
}