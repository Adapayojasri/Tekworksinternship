import java.util.*;
class  stringcomparison
  {
    public static void main(String[] args) {
         String string1=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string1");
      string1=s.nextLine();
      String string2=new String();
      Scanner y=new Scanner(System.in);
      System.out.println("give the data to the string2");
      string2=s.nextLine();
     System.out.println(string1.compareTo(string2));
    }
  }