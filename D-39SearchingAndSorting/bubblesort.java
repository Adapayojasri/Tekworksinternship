import java.util.*;
class bubblesort
  {
    public static void bubblesort(int arr[],int n)
    {
      for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-1;j++)
            {
              if(arr[j]>arr[j+1])
              {
               int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
            }
        }
         for(int k=0;k<=n-1;k++)
           {
             System.out.println(arr[k]);
           }
    }
    
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n=s.nextInt();
      System.out.println("Enter the array elements");
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
        {
          arr[i]=s.nextInt();
        }
       bubblesort(arr,n);

    }
}
