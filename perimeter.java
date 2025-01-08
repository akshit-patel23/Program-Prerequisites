import java.util.*;

class perimeter{
 public static void main(String args[]){
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the length of ractangle");
 int l= sc.nextInt();
 System.out.println("Enter the breadth of rectangle");
 int b= sc.nextInt();
 
 int perimeter= 2* (l+b);
 
 System.out.println("Perimeter of the rectangle is "+perimeter);
 
 }
}