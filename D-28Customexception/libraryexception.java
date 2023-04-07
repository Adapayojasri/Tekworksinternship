//. Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library. The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook.
import java.util.*;
class InvalidBookException extends Exception
  {
    public InvalidBookException(String message)
    {
       super(message);
    }
} 
   class Books
        {
          String title;
          String author;
          String isbn;
           String publisher;
          Scanner s=new Scanner(System.in);
    void gettitle() 
          {
            System.out.println("enter book title");
            try
              {
              title=s.nextLine();
              }
            catch(InvalidBookException i)
              {
              throw new InvalidBookException("Enter the details in string");
                gettitle();
              }
          }
    void getauthor()
          {
            System.out.println("enter the author name:");
            try
              {
               author=s.nextLine(); 
              }
            catch(InvalidBookException i)
              {
              throw new InvalidBookException("Enter the details in string");
                getauthor();  
              }
          }
      void setauthor()
          {
            System.out.println("enter the author name:");
            try
              {
               author=s.nextLine(); 
              }
            catch(InvalidBookException i)
              {
              throw new InvalidBookException("Enter the details in string");
            setauthor();
          }
          }
} 
class Author extends Books
{
String name;
String email;
String listofBook[]={"s","y"};
void details()
{
System.out.println("author name is"+name);
System.out.println("author eamil is"+email);
System.out.println("Books written by this autor is");
for(int i=0;i<listofBook.length;i++)
System.out.println(listofBook[i]);
}
  void getname()
  {
   Scanner s=new Scanner(System.in);
System.out.println("enter author name"); 
    try
      {
        name=s.nextLine();
      }
    catch(InvalidBookException i)
      {
        throw new InvalidBookException("Enter the details in string");
                getname();
      }
  }
  void getemail()
  {
    System.out.println("enter author email ");
    try
      {
        email=s.nextLine();
      }
    catch(InvalidBookException i)
      {
        throw new InvalidBookException("Enter the details in string");
                getemail();
      }
  }
}
class libraryexception
{
public static void main(String args[])
{
  System.out.println("enter number of books");
  Scanner a=new Scanner(System.in);
   int numberofbookswritten=a.nextInt();
  Author a[]=new Author[numberofbookswritten];
  for(int j=0;j<numberofbookswritten;j++)
    {
  a[j]=new Author();
a[j].details();
a[j].gettitle();
a[j].getauthor();
a[j].setauthor();
a[j].getname();
a[j].getemail();
     }
}
}