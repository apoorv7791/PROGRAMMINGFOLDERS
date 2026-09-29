import java.util.*;
class operate{
	void main(){
	     int num1, num2;
	     int result = 0;
	     var sc = new Scanner(System.in);
	     System.out.println("Enter first element: ");
	     num1 = sc.nextInt();
	     System.out.println("Enter second element: ");
 	     num2 = sc.nextInt();
	     System.out.println("Enter the operation that you want: (+,-,*,/,%)");
             char operation = sc.next().charAt(0);
	     
		switch (operation){
			case '+' -> result = num1 + num2;
			case '-' -> result = num1 - num2;
			case '*' -> result = num1 * num2;
			case '/' -> result = num1 / num2;
			case '%' -> result = num1 % num2;
			default -> {
				System.out.println("Invalid Operation: ");	
			}
		}
		System.out.println("Hooray Result aagaya: " + result);
	}
}
