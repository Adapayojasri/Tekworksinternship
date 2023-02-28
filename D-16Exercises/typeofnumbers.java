import java.util.Scanner;
class typeofnumbers 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        number(arr);
    }
    public static void number(int[] arr) {
        int negative = 0;
        int zero = 0;
        int even = 0;
        int odd = 0;
        int prime = 0;
        for (int i = 0; i < arr.length;i++)
          {
            if (arr[i] < 0) {
                negative++;
            }
            if (arr[i] == 0) {
                zero++;
            }
            if (arr[i] % 2 == 0) {
                even++;
            }
            if (arr[i] % 2 != 0) {
                odd++;
            }
            if (isprime(arr[i])) {
                prime++;
            }
        }
        System.out.println("Number of negative numbers: " + negative);
        System.out.println("Number of zeros: " + zero);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of prime numbers: " + prime);
    }
    
    public static boolean isprime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}