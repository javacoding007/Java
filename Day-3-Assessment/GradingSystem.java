import java.util.Scanner;
public class GradingSystem
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a > 100 || a < 0)
	    {
	        System.out.println("Invalid");
	    }
	    else if(a >= 90)
	    {
	        System.out.println("A+");
	    }
	    else if(a >= 80)
	    {
	        System.out.println("A");
	    }
	    else if(a >= 70)
	    {
	        System.out.println("B+");
	    }
	    else if(a >= 60)
	    {
	        System.out.println("B");
	    }
	    else if(a >= 50)
	    {
	        System.out.println("C+");
	    }
	    else if(a >= 40)
	    {
	        System.out.println("C");
	    }
	    else
	    {
	        System.out.println("Fail");
	    }
	}    
}
