import java.util.*;
class arraytolinkedlist
  {
    public static void main(String args[])
  {
   ArrayList<Character> arr=new ArrayList<>();
         arr.add('a');
        arr.add('b');
      arr.add('c');
      arr.add('d');     
  LinkedList<Character> linkList = new LinkedList<>();
		for (char arr1 : arr) 
    {
			linkList.add(arr1);
		}
      System.out.println(linkList);
    }
  }
  }