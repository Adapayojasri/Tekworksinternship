import java.util.*;
class example
  {
   static  int var1=10;
    int var2=20;
    static void inc()
    {
      var1=var1+1;
      System.out.println(var1);
    }
    void dec()
    {
      var2=var2-2;
      System.out.println(var2);
     }
  }
      class mainclass
  {
    public static void main(String args[])
    {
      example e=new example();
      e.inc();
      e.dec();
      System.out.println(e.var1+" "+e.var2);
    }
  }
    
  