import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args)
  {
   Scanner s = new Scanner(System.in);
   System.out.print("Enter a number: ");
    int number = s.nextInt();
     int sum = 0;
   for (int i = 0; i < number.length(); i++) {
  if (i == 0 || i == 3 || i == 6 || i == 9) 
     sum += Character.getNumericValue(number.charAt(i));
            }
        }
        System.out.println("Sum of digits at positions 0, 3, 6, and 9: " + sum);
    }
}