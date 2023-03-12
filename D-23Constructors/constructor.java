import java.util.*;
class constructor
  {
    int Num1;
    int Num2;
    constructor(String s)
    {
      System.out.println(s);
    }
    void getNum1()
    {
      System.out.println(Num1);
    }
    void getNum2()
    {
      System.out.println(Num2);
    }
    void setNum1()
    {
      Scanner s=new Scanner(System.in);
      Num1=s.nextInt();
      System.out.println(Num1);
    }
    void setNum2()
    {
      Scanner s=new Scanner(System.in);
      Num2=s.nextInt();
      System.out.println(Num2);
    }
  }
class constructors
  {
    public static void main(String args[])
    {
      constructor ce=new constructor("hello");
      ce.setNum1();
      ce.setNum2();
      ce.getNum1();
      ce.getNum2();
    }
  }