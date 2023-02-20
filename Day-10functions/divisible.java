import java.util.*;
class divisible
  {
    public static void number(int n1)
    {
      if(n1%5==0 && n1%11==0)
      System.out.println("n1 is divisible by 5 and 11");
      else 
        System.out.println("n1 is not divisible by 5 and 11 ");
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      divisible y=new divisible();
      y.number(n1);
        }
    }