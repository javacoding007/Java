import java.util.Scanner;
public class LowercaseASCII
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a >= 'a' && a <= 'z')
	    {
	        System.out.println("Yes");
	        
	    }
	    else
	    {
	        System.out.println("No");
	    }
	}
}
