import java.util.*;
class classexample
  {
    int var1=10;//instance or non static variable
  static  int var2=30;//static variable
    void display()//non static method
    {
     /* static int var3=100;
      static cannot used in local*/
    int var3=100;//local variable
      System.out.println(var1+"  "+var2);
    }
 static void inc()
  {
 // var1=var1+1;
  var2=var2+1;
  }
  }
class mainclass
  {
    public static void main(String args[])
    {
      classexample e=new classexample();
      classexample ce=new classexample();
      //System.out.println(e.var1+" "+classexample.var2);
      e.inc();
      ce.inc();
      e.display();
      ce.display();
    }
  }