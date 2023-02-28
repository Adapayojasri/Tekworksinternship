import java.util.*;
class nonrepeat
  {
    public static void  elements(int arr[],int s)
    {
      for(int i=0;i<=s-1;i++)
        {
          int x=arr[i];
          int c=0;
          for(int j=0;j<=s-1;j++)
            {
              if(arr[j]==x)
              {
                c++;
                arr[j]=-1;
              }
            }
          if(x!=-1){
            if(c==1){
        System.out.println(x+":"+c);
            } 
            }
          }
    }
