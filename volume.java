import java.util.*;
import java.lang.*;

class volume{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of cylinder");
		int radius= sc.nextInt();
		System.out.println("Enter the height of cylinder");
		int height=sc.nextInt();
		double volume = Math.PI * ( (radius*radius)*height);
		System.out.println("The volume of cylinder is "+volume);
	}
}