/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyProject;
import java.util.Scanner;
public class Library {
    public static void main(String args[]) {
    	
    	@SuppressWarnings("resource")
		Scanner sc= new Scanner (System.in);
    	
    	System.out.println("Enter the first number");
    	int a= sc.nextInt();
    	System.out.println("Enter the second number");
    	int b= sc.nextInt();
    	System.out.println("addition is: "+ (a+b));
    	
    }
}
