import java.util.Scanner;
public class TSAOfCylinder
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int r = sc.nextInt();
	    int h = sc.nextInt();
	    float pi = 3.142f;
	    float ar = 2 * pi* r*(r + h);
	    System.out.println(ar);
	}
}
