import java.util.*;
class strongnumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isStrong(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static boolean isStrong(int num) {
        int originalNum = num;
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            int factorial = 1;
            
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            
            sum += factorial;
            num /= 10;
        }
        
        return sum == originalNum;
    }
}
