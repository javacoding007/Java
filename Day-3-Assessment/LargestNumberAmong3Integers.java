import java.util.Scanner;
public class LargestNumberAmong3Integers
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    if(a > b && a > c)
	    {
	        System.out.println(a + " greater than both " + b + " and " + c);
	    }
	    else if(b > a && b > c)
	    {
	        System.out.println(b + " greater than both " + a + " and " + c);
	    }
	    else
	    {
	        System.out.println(c + " greater than both " + a + " and " + b);
	    }
	}    
}
