import java.util.*;
import java.lang.*;

class power{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Base number :");
		int base= sc.nextInt();
		
		System.out.println("Enter the exponent :");
		int ex=sc.nextInt();
		
		System.out.println("power calculates to "+(int)Math.pow(base,ex));
	}
}