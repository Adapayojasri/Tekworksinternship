import java.util.Scanner;
class secondmaximumandminimum
  {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
          {
            arr[i] = s.nextInt();
        }
        int max1 = arr[0], max2 = arr[0], min1 = arr[0], min2 = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } 
            else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }

            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i];
            }
        }
        System.out.println("Second minimum number: " + min2);
        System.out.println("Second maximum number: " + max2);
    }
}