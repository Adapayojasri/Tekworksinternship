import java.util.*;
class swapwithout
  {
    public static void alpha(int x,int y)
    {
      System.out.println("Before swapping");
      System.out.println("The value of x is");
      System.out.println("The value of y is"); 
       x = x + y;   
       y = x - y;   
       x = x - y;   
      System.out.println("After swapping");
      System.out.println("The value of"+x);
      System.out.println("The value of"+y);
    }
     public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
        int y=s.nextInt();
      swapwithout o=new swapwithout();
      o.alpha(x,y);
    }
  }