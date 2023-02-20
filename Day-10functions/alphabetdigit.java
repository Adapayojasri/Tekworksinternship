import java.util.*;
class alphabetdigit
  {
    public static void alpha(char ch)
    {
       if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println(ch+"is an alphabet");
      else if(ch>0&&ch<9)
        System.out.println(ch+"is a digit");
       else
        System.out.println(ch+"is a special character");       
      }
      public static void main(String args[])
        {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        alphabetdigit y=new alphabetdigit();
        y.alpha(ch);
        }
      }