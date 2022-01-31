import java.util.Scanner;
public class NumberASCIIValueOrNot
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a >= '0' && a <= '9')
	    {
	        System.out.println("Yes");
	        
	    }
	    else
	    {
	        System.out.println("No");
	    }
	}
}
