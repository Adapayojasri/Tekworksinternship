import java.util.*;
class hashsetexample
  {
    public static void main(String args[])
    {
      TreeSet h=new TreeSet();
      h.add(45);
      h.add(455);
      h.add(1);
      h.add(5);
      Iterator i=h.iterator();
      while(i.hasNext())
        {
      System.out.println(i.next());
        }

    }
  }