import java.util.Scanner;
class divisible
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      if(n1%5==0 && n1%11==0)
      {
        System.out.println("n1 is divisible by 5 and 11");
      }
          else {
        System.out.println("n1 is not divisible by 5 and 11 ");
          }
          }
    }