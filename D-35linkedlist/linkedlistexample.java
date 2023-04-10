/*add element
insert element at first
insert element at last
get first element 
get last element 
remove first element 
remove last element*/
import java.util.*;
class linkedlistexample
{
  public static void main(String args[])
  {
    LinkedList l=new LinkedList();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add("abc");
    l.add("def");
    System.out.println(l);
    l.addFirst("a");
    l.addLast("z");
    System.out.println(l.getFirst());
   System.out.println(l.getLast());
    System.out.println(l);
    l.removeFirst();
        System.out.println(l);
    l.removeLast();
        System.out.println(l);
    LinkedList<Integer> l1=new LinkedList<Integer>();
    l1.add(43);
    l1.add(34);
    System.out.println(l1);
    LinkedList<Object> l2=new LinkedList<Object>();
    l2.add("ahh");
    l2.add("gjh");
    System.out.println(l2);
    Enumeration r=l2.elements();
    while(r.hasMoreElements())
    {
       System.out.println(r.nextElement());
      }
    Iterator s=l.iterator();
while(s.hasNext())
{
 
System.out.println(s.next());
}
 
ListIterator s1=l.listIterator();
while(s1.hasNext())
{
 
System.out.println(s1.next());
}
    
    
    


  }
}