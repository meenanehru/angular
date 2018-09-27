import java.io.*;
import java.util.*;
class e12
{
	public static void main(String args[])
	{
		int  n,n1,j=0,a;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the N value :");
		n=ob.nextInt(); 
		n1=n;
		System.out.println("n1 ="+n1);
		
        while(n>0)
        {
           
          	a = n%10;
            j = (j*10)+a;
            n = n/10;
        }
		System.out.println("j="+j);
		if(n1==j)
		{	
            System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
    }
	
}	
