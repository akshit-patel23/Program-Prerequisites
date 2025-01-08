import java.util.*;
class converter{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius");
		double c=sc.nextInt();
	    double f=(c* 9/5) + 32;
		System.out.println(c+" celsius is equal to "+f+"fahrenheit");
	}
}