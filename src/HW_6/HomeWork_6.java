package HW_6;

/*
1. Imagine, you are writing the program for cinema. The method you should create takes two arguments.
The first is the age of the person; the second is an age limit of the film.
The method should print if this film allowed for the person or not

2. Implement the program that ask user to input three integers (use Scanner),
and print the maximum of three numbers. 19,10,1 ->19
 */

import java.util.Scanner;

public class HomeWork_6 {
	public static void main(String[] args) {
		task1();
		task2();
	}
	
	public static void task1() {
		int agePerson = getAge();
		int ageLimit = getLimit();
		String str;
		
		if (agePerson < ageLimit) {
			str = " is not ";
		} else {
			str = "is";
		}
		System.out.printf("This film %s allowed%n", str);
		System.out.print("-".repeat(100));
		System.out.println();
	}
	
	public static int getAge() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an age of the person:");
		return scanner.nextInt();
	}
	
	public static int getLimit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an age limit of the film:");
		return scanner.nextInt();
	}
	
	public static void task2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input three integers numbers:");
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();
		
		System.out.printf("The maximum of three numbers is %d", Math.max(first, Math.max(second, third)));
	}
}
