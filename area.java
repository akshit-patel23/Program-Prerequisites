import java.util.*;
import java.lang.*;
class area {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius of circle");
		int radius=sc.nextInt();
		double area=Math.PI *(radius * radius);
		
		System.out.println("The area of circle is "+area);
		
	}
	
}