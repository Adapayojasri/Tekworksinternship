 import java.util.*;
class menu
  {
    public static void insertatfirstindex(int arr[],int size)
    { 
      Scanner s=new Scanner(System.in);
     System.out.println("enter element to insert at the first index");
      int number=s.nextInt();
      arr[0]=number;
      System.out.println(arr);
      for(int i=0;i<size-1;i++)
        {
          System.out.println(arr[i]);
        }
    }
public static void insertatlastindex(int arr[],int size)
    { 
      Scanner s=new Scanner(System.in); 
       System.out.println("enter element to insert at the last index");
      int number=s.nextInt();
      arr[size-1]=number;
      System.out.println(arr);
      for(int i=0;i<size-1;i++);
      {
        System.out.println(arr[i]);
      }
    }
     public static void insertatspecifiedindex(int arr[],int size)
    {  
       Scanner s=new Scanner(System.in); 
 System.out.println("enter element to insert at the specified index");
      int indexnumber=s.nextInt();
      arr[indexnumber]=number;
      System.out.println(arr);
      for(int i=0;i<size-1;i++);
      {
        System.out.println(arr[i]);
      }
    }
     public static void removeatfirstindex(int arr[],int size)
    {   
      Scanner s=new Scanner(System.in);
      int number=s.nextInt();


       for(int i=0;i<size-1;i++);
      {
        System.out.println(arr[i]);
      }
    }
      public static void removeatspecifiedindex(int arr[],int size)
    {   
    }
    public static void  removeuserenteredelement(int arr[],int size)
    {
    }
      public static void main(String args[])
       {
    Scanner s=new Scanner(System.in);
       System.out.print("enter the size:");
    int arraysize=s.nextInt();
  int array[]=new int[size];
  System.out.println("Which of the operations do you want to perform");
  System.out.println("Insert an element in first index ");
  System.out.println("Insert an element in last index");
   System.out.println(" Insert an element in specified index");
  System.out.println(" Remove element from first index");
   System.out.println(" Remove element from specified index");
 System.out.println("Remove user enetered element");
   System.out.println("Display all in ASC/DESC order");
  int options=s.nextInt();
  switch(option)
    {
      case 1:insertatfirstindex(arr,size);
        break;
      case 2:insertatlastindex( arr, size);
        break;
      case 3:insertatspecifiedindex( arr,size);
        break;
      case 4:removeatfirstindex(arr,size);
        break;
      case 5:removeatspecifiedindex(arr,size);
        break;
      case 6:removeuserenterelement(arr, size);
        break;   
    }
       }
  }