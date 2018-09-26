import java.io.*;
import java.util.*;
class b72
{
     public static void main(String args[])
	 {
	       int len,i;
         String a;
		 char b[] = new char[100];
		 char c[] = new char[100];
		 Scanner ob = new Scanner(System.in);
		 System.out.println("Enter the String :");
		 a=ob.next();
	     len = a.length();
         for(i=0;i<len;i++)
		 {
              b[i]=a.charAt(i);
		      if((b[i]=='a') || (b[i]=='e') || (b[i]=='i') || (b[i]=='o') || (b[i]=='u'))
			  {
					 System.out.println("Yes");
					 System.exit(0);
			  }
			  else
		      {
				  if(i==(len-1))
				  {	  
			       System.out.println("No");
				  }
			  } 
	     }
		
    }
}
