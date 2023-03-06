import java.util.*;
class stringintointeger
  {
    public static void main(String args[])
    {
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string");
      string=s.nextLine();
      int number=Integer.parseInt(string);
      System.out.println(number);
    }
  }