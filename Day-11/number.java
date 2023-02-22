import java.util.*;
class number
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the value of n");
      int n=s.nextInt();
      System.out.println("enter the value of m");
      int m=s.nextInt();
      System.out.println("enter the stop value");
      int stop=s.nextInt();
      while(n<m)
        {
          if(m%2==0 && m%3==0)
          {
            if(stop==m)
              break
              System.out.println(m);
            m--;
          }
        }
    }
  }