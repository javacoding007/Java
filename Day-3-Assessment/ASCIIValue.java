import java.util.Scanner;
public class ASCIIValue
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    char a = s.charAt(0);
	    System.out.println((int)a);
	}
}
