import java.util.*;
class primenumbers1-100 {
    public static void main(String[] args) 
    {
        int num = 2; // start checking from 2
        System.out.println("Prime numbers between 1 and 100:");
        while (num <= 100) {
            boolean isPrime = true;
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
            num++;
        }
