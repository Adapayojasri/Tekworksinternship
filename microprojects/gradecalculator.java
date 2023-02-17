import java.util.*;
class gradecalculator
  {
    public static void main(String args[])
    {
      int i;
      float sum,percentage;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number of subjects");
      int S=s.nextInt();
      System.out.println("enter the marks in subject s1");
      int s1=s.nextInt();
      System.out.println("enter the marks in subject s2");
      int s2=s.nextInt();
      System.out.println("enter the marks in subject s3");
    int s3=s.nextInt();
      System.out.println("enter the marks in subject s4");
      int s4=s.nextInt();
      System.out.println("enter the marks in subject s5");
      int s5=s.nextInt();
      sum=s1+s2+s3+s4+s5;
      System.out.println(sum);
      percentage=sum/3;
      System.out.println(percentage);
      if(percentage>=90)
       System.out.println(" your grade is A");
      else if(percentage>=80)
       System.out.println("your grade is B");
      else if(percentage>=70)
      System.out.println("your grade is C");
      else if(percentage>=60)
      System.out.println("your grade is D");
      else if(percentage>=50)
      System.out.println("your grade is E");
      else if(percentage<40)
      System.out.println("your grade is F");
    }
  }