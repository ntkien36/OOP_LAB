package Lab01;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Lab01ex6_4 {
	    public static boolean checkLeapYear(int year){
	        boolean leap;
	        if (year % 4 == 0){
	            if (year % 100 == 0){
	                if (year % 400 == 0){
	                    leap = true;
	                }
	                else{
	                    leap = false;
	                }
	            }
	            else{
	                leap = true;
	            }
	        }
	        else{
	            leap = false;
	        }
	        return leap;
	    }


	    public static void main(String[] args){
	        boolean leap;
	        
	        String[] days_31 = new String[]{"January", "Jan", "Jan.", "1",
	                                        "March", "Mar", "Mar.", "3",
	                                        "May", "5",
	                                        "July", "Jul", "7",
	                                        "August", "Aug", "Aug.", "8",
	                                        "October", "Oct", "Oct.", "10",
	                                        "December", "Dec.", "Dec", "12"};

	        String[] days_30 = new String[]{"April", "Apr", "Apr.", "4",
	                                        "June", "Jun", "6",
	                                        "September", "Sept.", "Sep",
	                                        "November", "Nov.", "Nov", "11"};

	        String[] days_29 = new String[]{"February", "Feb.", "Feb", "2"};

	        List<String> list31 = Arrays.asList(days_31);
	        List<String> list30 = Arrays.asList(days_30);
	        List<String> list29 = Arrays.asList(days_29);
	        
	        String month;
	        int year;
	        Scanner keyboard;

	        do {
	            keyboard = new Scanner(System.in);
	            System.out.println("Enter month: ");
	            month = keyboard.nextLine();
	            System.out.println("Enter year: ");
	            year = keyboard.nextInt();
	            
	        } while(year < 0 || (!(list29.contains(month)) && !(list30.contains(month)) && !(list31.contains(month))));

	        leap = checkLeapYear(year);

	        if (list31.contains(month)){
	            System.out.println("Number of days in month: 31");
	        } 
	        else if (list30.contains(month)){
	            System.out.println("Number of days in month: 30");
	        }
	        else if(list29.contains(month)){
	            if (leap){
	                System.out.println("Number of days in month: 29");
	            }
	            else{
	                System.out.println("Number of days in month: 28");
	            }
	        }
	        keyboard.close();
	    }
}

