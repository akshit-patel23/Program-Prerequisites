import java.util.*;

class average{
public static void main(String args[]){
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter three numbers: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	double average = (a+b+c)/3;
	System.out.println("Average is calculated to "+average);
}
}