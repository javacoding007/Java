import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int f = sc.nextInt();
	    float c = (f - 32)*5.0f / 9.0f;
            System.out.println(c);
	}
}
