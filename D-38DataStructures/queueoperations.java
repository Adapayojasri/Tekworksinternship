import java.util.*;
public class queueoperations 
{
    public static void main(String[] args) 
  {
        Queue<String> queue = new LinkedList<>();
        queue.add("abc");
        queue.add("def");
        queue.add("ghi");
        queue.add("jkl");
        System.out.println(queue);
        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removal: " + queue);
        String frontElement = queue.peek();
        System.out.println("Element at front of Queue: " + frontElement);
        queue.add("Eve");
        System.out.println("Queue after add new element:"+queue);
  }
}