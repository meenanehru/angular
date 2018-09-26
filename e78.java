import java.io.*;
import java.util.*;
class e78
{
	public static void main(String args[])
	{
		int n;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the N value :");
		n=ob.nextInt();
		if((n%13)==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
