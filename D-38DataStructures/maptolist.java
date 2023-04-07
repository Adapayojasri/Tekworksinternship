import java.util.*;
 class maptolist
  {
    public static void main(String args[])
    {
      Map m=new HashMap();
      m.put(1,"abc");
      m.put(2,"def");
      m.put(3,"ghi");
      m.put(4,"jkl");
      System.out.println(m);
      List<Integer> l= new ArrayList(m.keySet());
        List<String> l1= new ArrayList(m.values());
      for(int i:l)
        {
          System.out.println(i);
        }
      for(String s:l1)
        {
          System.out.println(s);
        }

    }
  }