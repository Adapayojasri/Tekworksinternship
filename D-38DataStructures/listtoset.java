import java.util.*;
class listtoset
  {
    public static void main(String args[])
    {
    LinkedList l=new LinkedList();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add("abc");
    l.add("def");
    System.out.println("Linked list is:"+l);
    Set s=new HashSet(l);
    System.out.println("converted list to set  is:" +s);
    }
  }