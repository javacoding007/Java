import java.util.Scanner;
public class PrimeNumberOrNot{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i, count = 0;
	    for(i = 1; i <= n; i++){
	        if(n % i == 0){
	            count++;
	        }
	    }
	    if(count == 2){
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}
}
