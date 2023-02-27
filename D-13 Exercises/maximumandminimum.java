import java.util.*;
class maximumandminimum
  {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter Size of Array: ");
        int n = s.nextInt();
        int i;
        int arr[] = new int[n];
        for (i = 0; i < n; i++) { 
            System.out.print(" Enter: ");
            arr[i] = s.nextInt();
        }

        int maxelement = arr[0], minelement = arr[0];
        for (i = 0; i < n; i++) {
            if (arr[i] > maxelement)
            {
                maxelement = arr[i];
            }

            if (arr[i] < minelement)
            { 
                minelement = arr[i];
            }
        }
        System.out.println("Maximum Number: " + maxelement);
        System.out.println("Minimum Number: " + minelement);
    }
}