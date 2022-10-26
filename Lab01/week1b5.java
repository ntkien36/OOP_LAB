package Lab01;
import java.util.Scanner;
public class week1b5 {

		 public static void main(String[] args)
		    {
		        Scanner in = new Scanner(System.in);
		        System.out.print("Input 1st integer: ");
		        int firstInt = in.nextInt();
		        System.out.print("Input 2nd integer: ");
		        int secondInt = in.nextInt();

		        System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
		        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
		        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
		        System.out.printf("quotient of 2 double numbers(firstInt/secondInt): %.2f%n", ( (double) firstInt / secondInt ));
		        System.out.printf("quotient of 2 double numbers(secondInt/firstInt): %.2f%n", ( (double) secondInt / firstInt  ));}


}
