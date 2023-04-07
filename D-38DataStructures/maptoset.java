import java.util.*;
class maptoset
  {
    public static void main(String[] args)
    {
       Map<Integer,String> m=new HashMap<>();
      m.put(1,"abc");
      m.put(2,"def");
      m.put(3,"ghi");
      m.put(4,"jkl");
      Set<Integer> s1= new HashSet<Integer>(m.keySet());
      Set<String> s2= new HashSet<String>(m.values());
      System.out.println(s1);
      System.out.println(s2);
    }
  }