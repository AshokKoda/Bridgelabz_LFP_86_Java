package dayfiveassignment;

import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		
//		//Using if else
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		int num = sc.nextInt();
//		
//		if(num % 2 == 0)
//			System.out.println(num + " is even");
//		else
//			System.out.println(num + " is odd");
		
		//using ternary operator
		//String evenOdd = (num % 2 == 0) ? "even" : "odd";
		//System.out.println(num + " is " + evenOdd);
		
		//Task
		for(int i = 2; i <= 10; i++) {
			if(i % 2 ==0)
			{
				System.out.println(i + " ");
			}
		}

	}

}
