import java.util.*;
class exceptionmethod
  {
    void test() throws NullPointerException,ArithmeticException, IllegalArgumentException
    {
     Scanner p=new Scanner(System.in);
    System.out.println("enter any number");
    int f=p.nextInt();
    if(f<0)
      throw new ArithmeticException();
    else if(f==0)
      throw new IllegalArgumentException();
    else
      throw new NullPointerException();
    }
  }
 
  
class FinalExample {
  public static void main(String a[]) 
  {
FinalE f=new FinalE();
    f.test();
  }
}