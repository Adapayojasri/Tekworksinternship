import java.util.*;
class leapyearchecker
  {
    public static void main(String args[])
    {
      int year;
      Scanner s=new Scanner(System.in);
      System.out.println("enter a year");
      year=s.nextInt();
      if(year<=0000)
      {
        System .out.println("enter a valid year");
      }
     else {
      System.out.println("enter a year");   
}
      year =s.nextInt();
      if ((year % 4 == 0) && (year % 100!= 0)||(year%400 == 0) &&(year%100==0))
        {
        System.out.println("this is a leap year");
      }
      else {
        System.out.println("this is not an leap year");   
}    
    }
  }