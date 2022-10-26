package Lab01;
import java.text.DecimalFormat;
import java.util.Scanner;
public class week1b62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int choice;
		System.out.printf("1. The first-degree equation (linear equation) with one variable \n");
		System.out.printf("2. The first-degree equations (linear equation) with two variable \n");
		System.out.printf("3. The second-degree equation with one variable \n");
		System.out.printf("Choice: ");
		choice = in.nextInt();
		
		if (choice == 1) {
			double aNumber, bNumber;
	        double nghiem;
	        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
	        System.out.println("Enter a: ");
	        aNumber = in.nextDouble();
	        System.out.println("Enter b: ");
	        bNumber = in.nextDouble();
	        System.out.println("The equation is�: " + aNumber + "x + " + bNumber + " = 0.");
	        if (aNumber == 0) {
	            if (bNumber == 0) {
	                System.out.println("Infinite!");
	            } else {
	                System.out.println("No answer");
	            }
	        } else {
	            nghiem = (double) -bNumber / aNumber;   
	            System.out.println("Your answer is: x = " + decimalFormat.format(nghiem) + ".");
	        }
	        System.out.println("-----------------------------");
		}
		else if(choice == 2) {
			System.out.println("Solving\n  a11x1+a12x2 = b1\n& a21x1+a22x2 = b2 \nEnter a11");
			double a11 = in.nextDouble();
			System.out.println("Solving\n  a11x1+a12x2 = b1\n& a21x1+a22x2 = b2 \nEnter a12");
			double a12 = in.nextDouble();
			System.out.println("Solving\n  a11x1+a12x2 = b1\n& a21x1+a22x2 = b2 \nEnter b1");
			double b1 = in.nextDouble();
			
			System.out.println("Solving\n  a11x1+a12x2 = b1\n& a21x1+a22x2 = b2 \nEnter a21");
			double a21 = in.nextDouble();
			System.out.println("Solving\n  a11x1+a12x2 = b1\n& a21x1+a22x2 = b2 \nEnter a22");
			double a22 = in.nextDouble();
			System.out.println("Solving\n  a11x1+a12x2 = b1\n& a21x1+a22x2 = b2 \nEnter b2");
			double b2 = in.nextDouble();
			
			
			if(a11 ==0 && a12 ==0 && b1==0 && a21 ==0 && a22== 0 && b2 == 0 ) {
				System.out.println("Infinite!");
			}
			else if(a11 == 0 && a12== 0 && b1!=0 || a21 == 0 && a22== 0 && b2!=0 ) {
				System.out.println("No awnser");
			}
			else {
				double ans1 = (b1*a21 - b2*a11)/(a12*a21 -a22*a11);
				double ans2 = (b1*a22 - b2*a11)/(-a12*a21 +a22*a11);
				System.out.println("X1 is: "+ ans1 +" and X2 is: "+ans2);			
				}
		}
		else if (choice == 3) {
			Scanner input = new Scanner(System.in);  
			System.out.print("Enter the value of a: ");  
			double a = input.nextDouble();  
			System.out.print("Enter the value of b: ");  
			double b = input.nextDouble();  
			System.out.print("Enter the value of c: ");  
			double c = input.nextDouble();  
			double d= b * b - 4.0 * a * c;  
			if (d> 0.0)   
			{  
			double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
			double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
			System.out.println("The roots are " + r1 + " and " + r2);  
			}   
			else if (d == 0.0)   
			{  
			double r1 = -b / (2.0 * a);  
			System.out.println("The root is " + r1);  
			}   
			else   
			{  
			System.out.println("Roots are not real.");  
			}
		}
		else {
			System.out.println("You cancel it");	
		}
	}

}
