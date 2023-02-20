import java.util.*;
class checkingthenumber
{
  public static void number(int n)
  {
  if(n<0)
    System.out.println(n+"is a negative number");
  else if(n>0)
    System.out.println(n+"is a positive number ");
  else if(n==0)
    System.out.println(n+"is a zero");
  }
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    checkingthenumber y=new checkingthenumber();
      y.number(n);
  }
}