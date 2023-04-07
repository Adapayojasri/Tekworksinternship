import java.util.*;
class exception
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int y=s.nextInt();
      try
        {
        System.out.println(x/y);
          //new arithematic exception will be created
      }
      catch(Exception q) //q is a reference of type exception class,it can be any variable
        {
          System.out.println(q);//it does not executed
        }
      System.out.println("program executed completely");
    }
  }