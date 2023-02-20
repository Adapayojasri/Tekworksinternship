import java.util.*;
class alphabetornot
  {
    public static void alpha(char n1)
    {
      if((n1=='a'&&n1=='z') &&(n1=='A'&&n1=='Z'))
      {
        System.out.println(n1+"is an alphabet");
      }
      else 
        System.out.println(n1+"is not an alphabet");
    }
    public static void main(String args[])
    {
      Scanner s =new Scanner(System.in);
      char n1=s.next().charAt(0);
      alphabetornot y=new alphabetornot();
      y.alpha(n1);
    }
  }