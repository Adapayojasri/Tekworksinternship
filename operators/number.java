import java.util.Scanner;
class number
  {
    public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    if(n1<0)
    {
      System.out.println("n1 is a negative number");
    }
      else if(n1>0)
      {
      System.out.println("n1 is a positive number");
      }
      else
    {
      System.out.println("n1 is a zero");
    }
    }
    }