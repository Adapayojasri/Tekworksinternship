import java.util.*;
class removeduplicate
  {
    public static void removeduplicatecharacters(String str) 
    {
      int i,j,k;
      System.out.println("remove duplicate characters");
       for(i = 0; i < str.length(); i++)
            {
            for(j = i+1; j < str.length(); j++)
              {  
                if(string[i] == string[j]) 
                {
                  for( k=j;k<string.length-1;k++)
                                              
                      string[k]=string[k+1];
                  string[k]='\0';
                }  
                }
        }
    }
public static void main(String args[])
    {
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string");
      string=s.nextLine();
    removeduplicate y=new removeduplicate();
  y.removeuplicatecharacters(string);
      
    }
}