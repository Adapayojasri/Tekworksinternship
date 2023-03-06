import java.util.*;
class reverse
  {
    public static void main(String args[])
    {
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string");
      string=s.nextLine();
      String reverse="";
      for(int i=string.length()-1;i>=0;i--)
        reverse=reverse+string.charAt(i);
      System.out.println("Reverse of a string is "+reverse);
    }
  }