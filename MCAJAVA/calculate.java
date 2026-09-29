// make a calculator by taking two numbers as input
// 3 6 = 9
// 3 6 = -3
// 3 6 = 18
// 3 6 = 0
// 3 6 = 2


import java.util.*;
class calculate{
     void main(){	
	var sc = new Scanner(System.in);
	int num1, num2;
	System.out.println("Enter first number: ");
	num1 = sc.nextInt();
	System.out.println("Enter second number: ");
	num2 = sc.nextInt();
	System.out.println("Enter operation (+,-,/,*,%): ");
	char operation = sc.next().charAt(0);
	int result = 0;
	switch (operation) {
		case '+' -> result = num1 + num2;
		case '-' -> result = num1 - num2;
		case '/' -> result = num1 / num2;
		case '*' -> result = num1 * num2;
		case '%' -> result = num1 % num2;
		default -> {
			System.out.println("Invalid Operation: ");
		}
	}
	System.out.println("Operation Complete: " + result);
     }
}
