import java.util.*;
class sumofprimenumbers {
    public static void main(String[] args) {
        int sumOfPrimes = 0;
        int sumOfEvens = 0;
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sumOfPrimes += i;
            }
            if (i % 2 == 0) {
                sumOfEvens += i;
            }
        }
        System.out.println("Sum of primes: " + sumOfPrimes);
        System.out.println("Sum of evens: " + sumOfEvens);
    }
}
