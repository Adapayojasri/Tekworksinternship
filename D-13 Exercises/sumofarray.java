import java.util.*;
class sumofarray
{
  Scanner s=new Scanner(System.in);
  System.out.println("enter the size of the array");
int size=s.nextInt();
String myarray=new String[size];
System.out.println("enter elements of the array");
for(int i=0;i<size;i++)
  {
    myarray[i]=s.next();
  }
    static int sum()
    {
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "
                           + sum());
    }
}