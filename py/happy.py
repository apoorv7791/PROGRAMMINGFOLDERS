n1 = int(input("Enter first element: "))
n2 = int(input("Enter second element: "))

operation = input("Enter operation: ")

result = 0

match operation:
	case '+':
		 result = n1 + n2
	case '-': 
		result = n1 - n2
	case '*':
		 result = n1 * n2
	case '/':
		 result = n1 / n2
	case '%':
		 result = n1 % n2
	case _:
		print("Invalid Operation: ")
print("Operation Complete: ", result)

