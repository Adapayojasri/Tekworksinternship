import java.util.*;
class evenorodd
  {
    public static void number(int n1)
    {
      if(n1%2==0)
        System.out.println(n1+ "is an even number");
      else
        System.out.println(n1 +"is an odd number");
      }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      evenorodd y=new evenorodd();
      y.number(n1);
    }
  }