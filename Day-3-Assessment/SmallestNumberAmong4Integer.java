import java.util.Scanner;
public class SmallestNumberAmong4Integer
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();
	    if(a < b && a < c && a < d)
	    {
	        System.out.println(a + " lesser than " + b + " and " + c + " and " + d);
	    }
	    else if(b < a && b < c && b < d)
	    {
	        System.out.println(b + " lesser than " + a + " and " + c + " and " +  d);
	    }
	    else if(c < a && c < b && c < d)
	    {
	        System.out.println(b + " lesser than " + a + " and " + c + " and " +  d);
	    }
	    else
	    {
	        System.out.println(d + " lesser than " + a + " and " + b + " and " +  c);
	    }
	}    
}
