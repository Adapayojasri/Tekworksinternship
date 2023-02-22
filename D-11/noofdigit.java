import java.util.*;
 class noofdigit {
  public static void main(String[] args) {
    int count = 0, num = 12345;
    while (num != 0) {
      num=num/10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}