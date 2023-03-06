import java.util.*;
class blastoperation
  {
    public static String replace(String str,int n)
    {
      String s1=" ";
      int c=1;
      for(int i=0;i<str.length()-1;i++)
       {
         if(str.charAt(i)==str.charAt(i+1))
           c++; 
         else
           c=1;
           if(c==n)
      str=replace(str.substring(0,i-n+2)+str.substring(i+2),n);
       }
      return str;
    }
    public static void main(String[] ar)
  {
    Scanner s=new Scanner(System.in);
    String str=new String(s.nextLine());
    int n=s.nextInt();
    String res=replace(str,n);
    System.out.println(res); 
    }
  
}