import java.util.Scanner;
public class LargestNumberAmong4Integers
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();
	    if(a > b && a > c && a > d)
	    {
	        System.out.println(a + " greater than " + b + " and " + c + " and " + d);
	    }
	    else if(b > a && b > c && b > d)
	    {
	        System.out.println(b + " greater than " + a + " and " + c + " and " +  d);
	    }
	    else if(c > a && c > b && c > d)
	    {
	        System.out.println(b + " greater than " + a + " and " + c + " and " +  d);
	    }
	    else
	    {
	        System.out.println(d + " greater than " + a + " and " + b + " and " +  c);
	    }
	}    
}
