import java.util.*;
class repeting
  {
    public static void main(String args[])
    {
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string");
      string=s.nextLine();
      for(char i=stringtoCharArray())
        {
        if(string.indexOf(i)==string.lastIndexOf(i))
        {
          System.out.println("First non repeting character is "+i);
        }
        }
  }
  }