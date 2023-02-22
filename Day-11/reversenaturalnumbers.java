import java.util.*;
class reversenaturalnumbers
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Starting Number : ");
		int n1 =s.nextInt();
		System.out.print("Enter The Ending Number : ");
		int n2 =s.nextInt(); 
		while(n1>=n2)
		{
			System.out.println(n1);
			n1--;
		}
	}
}
