import java.util.Scanner;
class alphabet
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      char n1=s.next().charAt(0);
      if(n1>'A' && n1<'Z' )
      {
        System.out.println("n1 is an alphabet");
      }
      else if(n1>'a'&& n1<'z')
      {
        System.out.println("in is an alphabet");
      }
        else
        System.out.println("n1 is not an alphabet");
     
    }
      }
      