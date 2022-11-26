package hust.soict.hedspi.lab01;
import java.util.Scanner;
import java.util.Arrays;
public class Lab01ex6_5 {
	   	public static void printArray(int A[]){
	        int sum = 0;
	        for(int i=0; i < A.length ; i++){
	            sum = sum + A[i];
	        }
	        double average = sum / A.length;
	        Arrays.sort(A);
	        System.out.println("Array after sorted: ");
	        System.out.println(Arrays.toString(A));
	        System.out.println("Sum value of the array elements : " + sum); 
	        System.out.println("Average value of the array elements : " + average); 
	    }

	    public static void main(String[] args){
	        System.out.println("Option1: Array constant");
	        System.out.println("Option2: Array from keyboard");
	        System.out.println("Choose option: ");
	        Scanner menu = new Scanner(System.in);
	        String menu_ans = menu.nextLine();
	        

	        if (menu_ans.trim().equals("1")){
	            int A[] = new int[]{10, 40, -5, 25, -36, 70, -50};
	            printArray(A);
	        }
	        else if (menu_ans.trim().equals("2")){
	            Scanner scan = new Scanner(System.in);
	            System.out.println("Enter number of elements you want to input: ");
	            int n = scan.nextInt();
	            
	            int[] array = new int[n];
	            System.out.println("Enter the elements of the array: ");
	            for (int i = 0; i < n; i++){
	                array[i] = scan.nextInt();
	            }
	            scan.close();
	            printArray(array);

	        menu.close();
	       }
	   }
}

