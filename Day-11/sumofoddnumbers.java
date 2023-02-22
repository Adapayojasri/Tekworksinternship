import java.util.*;
class sumofoddnumbers
  {
    public static void main(String args[])
    {
      int i,sum=0,num=20;
      for(i = 1; i <= num; i+=1) 
        sum = sum + i;  
      System.out.println("Sum of First 10 odd Numbers is = " + sum);  
    }
  }