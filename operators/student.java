import java.util.Scanner;
class student
  {
   public static void main(String args[])
    {
      String studentid;String studentname;int marks1,marks2,marks3;double average;101
      Scanner d=new Scanner(System.in);
      studentid=d.next();
      studentname=d.next();
      marks1=d.nextInt();
      marks2=d.nextInt();
      marks3=d.nextInt();
      average=marks1+marks2+marks3/3;
      System.out.println("sid="+studentid);
      System.out.println("sname="+studentname);
      System.out.println("m1="+marks1);
      System.out.println("m2="+marks2 );
      System.out.println("m3="+marks3 );
      System.out.println("average"+average);
    }
  }
