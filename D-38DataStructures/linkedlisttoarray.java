import java.util.*;
class linkedlisttoarray
  {
    public static void main(String args[])
  {
    LinkedList l=new LinkedList();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add("abc");
    l.add("def");
    Iterator i=l.iterator();
      while(i.hasNext())
        {
      System.out.println(i.next());
        }
      ArrayList<Integer> l1=new ArrayList<>(l);
       Iterator i1=l.iterator();
       while(i1.hasNext())
        {
      System.out.println(i1.next());
        }
     
    }
  }