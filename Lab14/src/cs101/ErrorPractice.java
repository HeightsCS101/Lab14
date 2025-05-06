package cs101;

import java.io.IOException;
import java.util.Scanner;

public class ErrorPractice {

	// 3 points
	public static void a(int index) {

		int[] a = { 1, 2, 3, 4 };

		// TODO: put the following line of code inside of a try/catch block
		// the catch block should just print the exception

		int element = a[index];

	}

	// 3 points
	public static int b() {

		// TODO: put the following two lines of code inside of a try/catch block
		// We expect a number from our user.
		// the catch block should `return -1;`

		Scanner input = new Scanner(System.in); // Create a Scanner object
		return Integer.parseInt(input.nextLine());

	}

	// 3 points
	public static int c() {

		int c = 0;

		// TODO: add a finally block to this try/catch statement that adds 8 to c
		try {
			int n = Integer.MAX_VALUE + 1;
			c += n;

		} catch (Exception f) {
			c += -1;
		}

		return c;

	}

	// 3 points
	public static void check_input(double input) {

		// TODO: add an if statement here.
		// if input > 99.0, you should throw a `RuntimeException` error.
		// the message can be whatever you want

	}

	// 3 points
	public static void d() {

		Scanner input = new Scanner(System.in); // Create a Scanner object

		String n = input.nextLine();

		// TODO: if n is the empty String "", you should throw an `IOException` error
		// the message can be whatever you want

	}

	// 5 points
	public static void e() {

		// TODO: put the following line of code inside a try/catch block
		// the catch block should catch the ArithmeticException type ONLY!
		int x = divide(4, 0);

	}

	// helper method, do not edit
	public static int divide(int a, int b) throws ArithmeticException {
		// this will generate an ArithmeticException if b is zero
		return a / b;
	}

	// 5 points
	public static int f(int p) {
		// TODO: uncomment the following line and put it inside a try/catch block with
		// two
		// separate catch statements:
		// - one for `RuntimeException`s that returns -1
		// - one for `IOException`s that returns -2
		// - otherwise, return 0;

		// exception_helper(p);

		return 0;

	}

	// helper method, do not edit
	public static void exception_helper(int p) throws Exception {
		if (p < 10) {
			throw new RuntimeException("oh no!");
		} else {
			throw new IOException("oh NO!");
		}

	}

}
