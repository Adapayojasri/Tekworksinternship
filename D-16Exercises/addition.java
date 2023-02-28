import java.util.*;
class addition
  {  
    public static void main(String args[])
    {
      System.out.println("Add the 2 numbers a+b is");
      int a=10;
      int b=20;
     int y=sum(a,b);
      System.out.println(y);
      multlipication(a,b);
      division();
      int i=subtraction();
    }
   static int sum(int a,int b)
     {
       return(a+b);
     }
     static int subtraction(){
       System.out.println("Subract the two numbers");
       int s=10,s1=90;
       return s-s1;
     }
     static void multlipication(int a,int b){
       System.out.println("Multiply the two numbers");
    System.out.println(a*b);
     }
     static void division()
    {
       System.out.println("divide the two numbers");
       int a=10;
       int b=20;
       int y=a/b;
       System.out.println(y);
     }
  }