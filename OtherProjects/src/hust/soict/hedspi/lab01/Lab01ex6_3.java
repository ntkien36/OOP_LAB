package hust.soict.hedspi.lab01;
import java.util.Scanner;
public class Lab01ex6_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the height: n = ");
		int n = scan.nextInt();
		
		int q = 0;
		while (n>0) {
		for (int i = 1; i<n; i++) {
            System.out.print(" ");
		}
		
        for (int k = 0; k <= q; k ++) {
            System.out.print("*");
        }
        n -- ;
        q += 2 ;
        System.out.println();
		}
	}
}