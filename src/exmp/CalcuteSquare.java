package exmp;

import java.util.ArrayList;
import java.util.List;

public class CalcuteSquare {
	

	
	public static void main(String[] args) {
		int i=29;
		
		//The below code for Calculate Square for the number
		/*
		 * int square = calculateSquare(i); System.out.println(square);
		 */
		//The below code for Power of number 
		/*
		 * int power= 3; int powerOfNumber = calculatePowerOfNumber(i,power);
		 * System.out.println("powerOfNumber :"+i+" Power of "+power+" is :"
		 * +powerOfNumber);
		 */
		boolean b = isPrime(i);
		System.out.println(b);
		/*
		 * int i[] = {1};
		 * 
		 * List list = Arrays.asList(i); list.add("Red"); list.add("Green");
		 * list.add("Yellow"); list.add("Red");
		 * System.out.println(list.stream().collect(Collectors.groupingBy(Function.
		 * identity(), Collectors.counting())).toString()); //Predicate p1= (x-> x*2 >=
		 * 0) ; //list.stream().allMatch(p1);
		 * 
		 * 
		 */
		}

		/*
		 * public static int calculateSquare(int number) { number = number*number;
		 * return number; }
		 */

	public static double calculateSquare(double number) {
		number = Math.sqrt(number);
		number = number*number;
		return number;
	}
	
	public static int calculatePowerOfNumber(int number, int power) {
		int result=1;
		for(int i=0;i<power;i++) {
			result = result*number;
		}
		
		return result;
	}
	
	public static boolean isPrime(int number) {
		//List list = new ArrayList<>();
		
		if (number <= 1) {  
	           return false;  
	       }  

		for(int i=2; i< i/2; i++) {
			if(number%i ==0) {
			return false;
				//break;
			}
		}
		
		
		return true;
	}
}
