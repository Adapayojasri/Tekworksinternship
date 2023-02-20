import java.util.*;
class upperorlower
  {
    public static void alpha(char ch)
    {
      if(ch=='a'&& ch=='z')
      {
        System.out.println(ch+"is an lowercase letter");
      }
      else if(ch=='A'&&ch=='Z')
      {
        System.out.println(ch+"is an uppercase letter");
      }
    }
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       char ch=s.next().charAt(0);
      upperorlower y=new upperorlower();
      y.alpha(ch);
    }
  }