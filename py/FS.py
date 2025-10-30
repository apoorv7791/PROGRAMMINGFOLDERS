# Create a simple program that stores names and phone number in a dictionary

phone_book = {}
n = int(input("Enter the number of contacts: "))
for i in range(n):
    name = input("Enter the name:")
    phone = input("Enter the phone number:")
    phone_book[name] = phone
print(phone_book)
name = input("Enter the name to search:")
if name in phone_book:
    print("Phone number of", name, "is", phone_book[name])
else:
    print("Name not found")
