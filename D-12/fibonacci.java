import java.util.Scanner;
public class fibonacci 
{
    public static void main(String[] args) 
  {
        int n, firstTerm = 0, secondTerm = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        n = scanner.nextInt();
        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int sum = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = sum;
        }
    }
}
