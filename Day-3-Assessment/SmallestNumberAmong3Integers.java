import java.util.Scanner;
public class SmallestNumberAmong3Integers
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    if(a < b && a < c)
	    {
	        System.out.println(a + " lesser than both " + b + " and " + c);
	    }
	    else if(b < a && b < c)
	    {
	        System.out.println(b + " lesser than both " + a + " and " + c);
	    }
	    else
	    {
	        System.out.println(c + " lesser than both " + a + " and " + b);
	    }
	}    
}
