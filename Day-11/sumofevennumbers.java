import java.util.*;
class sumofevennumbers
  {
    public static void main(String args[])
    {
      int i,sum=0,num=10;
      for(i = 2; i <= num; i+=2) 
        sum = sum + i;  
      System.out.println("Sum of First 10 even Numbers is = " + sum);  
    }
  }