import java.util.Scanner;
public class DollarToINR
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int r = sc.nextInt();
	    float d = 75.05f * r; // dollar to inr changes daily
	    System.out.println(d);
	}
}
