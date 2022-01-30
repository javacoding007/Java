import java.util.Scanner;
public class AreaOfCircle
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int r = sc.nextInt();
	    float pi = 3.142f;
	    float ar = pi * r * r;
	    System.out.println(ar);
	}
}
