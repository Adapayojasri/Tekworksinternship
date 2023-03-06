import java.util.*;
class MinimumMaximum
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter string");
      String string=s.nextLine();
      maxminlength(string);
    }
    public static void maxminlength(String string)
    {
     
      String array[]=string.split(" ");
       String maximumword=array[0];
      String minimumword=array[0];
      for(int i=0;i<array.length;i++)
        {
          if(minimumword.length()>array[i].length())
          {
            minimumword=array[i];
          }
          else
          {
            maximumword=array[i];
          }
        }
      System.out.println(minimumword);
      System.out.println(maximumword);
    }
  }
      