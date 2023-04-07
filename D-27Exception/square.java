import java.util.*;
class square
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      try
        {
          System.out.println(Math.sqrt(x));
        }
      catch(Exception q)
        {
          System.out.println(q);
        }
      }
    }
