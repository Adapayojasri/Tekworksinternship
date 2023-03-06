import java.util.*;
class lexicographical
  {
    public static void main(String[] args) {
         String string1=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string1");
      string1=s.nextLine();
      String string2=new String();
      Scanner y=new Scanner(System.in);
      System.out.println("give the data to the string2");
      string2=y.nextLine();
        int result = string1.compareTo(string2);
         if (result < 0) {
            System.out.println("String 1 is lexicographically less than String 2");
        } else if (result > 0) {
            System.out.println("String 1 is lexicographically greater than String 2");
        } else {
            System.out.println("String 1 is lexicographically equal to String 2");
        }
    }
}