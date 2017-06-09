import java.io.*;
import java.util.*;
class number
{
	public static void main(String args[])
	{
		int sum=0,n,r;
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}
}
