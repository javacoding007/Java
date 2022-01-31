import java.util.Scanner;
public class UppercaseASCII
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a >= 'A' && a <= 'Z')
	    {
	        System.out.println("Yes");
	        
	    }
	    else
	    {
	        System.out.println("No");
	    }
	}
}
