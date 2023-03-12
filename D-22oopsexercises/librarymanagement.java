import java.util.*;
class Books
{
String title;
String author;
String isbn;
String publisher;
void getDetails()
{
  System.out.println("Book title is"+title);
  System.out.println("Book authoris"+author);
  System.out.println("Book isbn is"+isbn);
  System.out.println("Book publisher is"+publisher);
} 
void setDetails()
{
  System.out.println("eneter deatils of a book");
  Scanner s=new Scanner(System.in);
  System.out.println("eneter book title");
  title=s.nextLine();
  System.out.println("eneter book author");
  author=s.nextLine();
  System.out.println("eneter book isbn");
  isbn=s.nextLine();
  System.out.println("eneter book publisher");
  publisher=s.nextLine();
}
 
}
 
class Author
{
String name;
String email;
String listofBook[]={"a","b"};
void getDetails()
{
System.out.println("author name is"+name);
System.out.println("author eamil is"+email);
System.out.println("Books written by this autor is");
for(int i=0;i<listofBook.length;i++)
System.out.println(listofBook[i]);
}
void setDetails()
{
System.out.println("eneter deatils of an author");
Scanner s=new Scanner(System.in);
System.out.println("eneter author name");
name=s.nextLine();
System.out.println("eneter author email ");
email=s.nextLine();
} 
}
class librarymanagement
{
public static void main(String a[])
{
Books b=new Books();
b.setDetails();
b.getDetails();
Author a1=new Author();
a1.setDetails();
a1.getDetails();
}
}