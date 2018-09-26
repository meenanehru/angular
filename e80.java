import java.io.*;
import java.util.*;
class e80
{
	public static void main(String args[])
	{
		int n,a;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the N value :");
		n=ob.nextInt();            //2146
		while(n>0)            //2146
		{            //2146
			a=n%10;//6
			n=n/10;
			if(a%2!=0)
			{
			    System.out.println(a);
			}
		}
	}
}
