import java.util.*;
class linearsearch
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n=s.nextInt();
      System.out.println("Enter the element to search");
      int element=s.nextInt();
      System.out.println("Enter the array elements");
      int arr[]=new int[n];
      for(int i=0;i<n-1;i++)
        {
          arr[i]=s.nextInt();
        }
      int k=0;
      for(int i=0;i<=arr.length-1;i++)
        {
          if(arr[i]==element)
          {
            System.out.println(element+"is found at: "+arr[i]);
            k=k+1;
            break;
          }
        }
      if(k==0)
      {
        System.out.println("element is not occured:");
      }
    }
  }