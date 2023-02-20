import java.util.*;
class marks
  {
    public static void number(int m1,int m2, int m3)
    {
      if(per>=90)
        System.out.println('A');
      else if(per>=80)
        System.out.println('B');
      else if(per>=70)
        System.out.println('C');
      else if(per>=60)
        System.out.println('D');
      else if(per>=50)
        System.out.println('E');
      else if(per<=50)
        System.out.println('F');
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      m1=s.nextInt();
      m2=s.nextInt();
      m3=s.nextInt();
      per=(m1+m2+m3)/3;
      marks y=new marks();
      y.number(m1,m2,m3);
    }
        
    }