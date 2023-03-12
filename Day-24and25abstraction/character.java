// Display first character the given string
import java.util.*;
class character
  {
    public static void main(String args[])
    {
      String str=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the string:");
      str=s.nextLine();
      System.out.println("Your string is " + str);
      String[] y=str.split(" ");
      for(int i=0;i<str.length();i++)
        {
          char c=y[i].charAt(0);
          System.out.println(c);
        }      
    }
  }