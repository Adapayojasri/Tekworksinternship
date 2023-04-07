import java.util.*;
class selectionsort
  {
   
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int size=s.nextInt();
      System.out.println("Enter the array elements");
      int array[]=new int[size];
      for(int i=0;i<=size-1;i++)
        {
          array[i]=s.nextInt();
        }
      for (int i = 0 ;i< size-1; i++){
        int min = i;

         for (int j = i+1; j<size; j++){
            if (array[j] < array[min]){
            min= j;
            }
         }
         int temp = array[min];
         array[i] = array[i];
         array[min] = temp;
      }

      for (int i = 0 ;i< size; i++){
         System.out.print(" "+array[i]);
      }
    }}