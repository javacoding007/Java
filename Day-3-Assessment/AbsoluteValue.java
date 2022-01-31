import java.util.Scanner;
public class AbsoluteValue
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a <= 0)
	    {
	        System.out.println(-1 * a);
	    }
	    else
	    {
	        System.out.println(a);
	    }
	}    
}
