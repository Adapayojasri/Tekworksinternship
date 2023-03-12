import java.util.*;
class methods
  {
    public static void main(String args[])
    {
      StringBuffer sb=new StringBuffer("welcome");
      sb.append("java");
      System.out.println(sb);
       sb.insert(1,"class");
      System.out.println(sb);
       sb.replace(1,3,"class");
      System.out.println(sb);
      sb.delete(1,3);
      System.out.println(sb);
      sb.reverse();
       System.out.println(sb);
    }
  }