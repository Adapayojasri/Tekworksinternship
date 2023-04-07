import java.util.*;
  class settolist
    {
      public static void main(String args[])
      {
      Set<Integer> ss=new HashSet<>();
      ss.add(34);
      ss.add(10);
     ss.add(20);
      ss.add(30);
      System.out.println("Set is:"+ ss);
      List<Integer> ll=new ArrayList<>(ss);
        System.out.println("converted  set to list is:"+ll);
        
        
      }
    }