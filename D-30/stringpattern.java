//.Create a class called StringCheck having methods add() & Check()  to give data and verify each word ending with “ing”. Generate a custom exception if the string not ending with “ing”. Test this application for any 4 different text inputs. Use an array of objects for the test cases.
import java.util.*;
class StringCheckException extends Exception
  {
    StringCheckException(String message)
    {
      super(message);
    }
  }
class stringpattern
  {
    String str;
    void add()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the string");
      try
        {
         str=s.next();
          if(str.charAt(0)=='0'|| str.charAt(0)=='1'||str.charAt(0)=='2'||str.charAt(0)=='3'||str.charAt(0)=='4'|| str.charAt(0)=='5'||str.charAt(0)=='6'||
        str.charAt(0)=='7'||str.charAt(0)=='8'|| str.charAt(0)=='9')
          {
             throw new StringCheckException("enter only string as a input");
           } 
        else
          {
        System.out.println("your input is string");
           }
      }
      catch(StringCheckException i)
        {
          System.out.println(i);
        }
      }
    void check()
    {
      String arr[]=str.split("");
      for(int i=0;i<arr.length;i++)
        {
          String str=arr[i];
          try
            {
             if(str.charAt(0)==str.charAt(str.length()-1))
                {
                  System.out.println("Starting and ending letter is same");
                }
              else
             {
                throw new StringCheckException("Starting and ending letter not same");
              }
            }
          catch(StringCheckException q)
            {
              System.out.println(q);
            }
        }
    }
  }
class main
  {
    public static void main(String args[])
    {
      System.out.println("enter number of words");
      Scanner s=new Scanner(System.in);
      int numberofwords=s.nextInt();
      stringpattern b[]=new stringpattern[numberofwords];
      for(int i=0;i<numberofwords;i++)
        {
          b[i]=new stringpattern();
        b[i].read();
        b[i].check();
           }
    }
  }
    