import java.util.Scanner;
class evenorodd
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      if(n1%2==0)
      {
        System.out.println("n1 is an even number");
      }
        else
      {
        System.out.println("n1 is an odd number");
      }
    }
  }