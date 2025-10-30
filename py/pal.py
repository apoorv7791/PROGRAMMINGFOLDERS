# checking if a number is palindrome or not by using two pointer approach
num = int(input("Enter a number: "))
n = len(str(num))
left = 0
right = n - 1
while left < right:
    if str(num)[left] != str(num)[right]:
        print("The number is not palindrome")
        break
    left += 1
    right -= 1
else:
    print("The number is palindrome")
    