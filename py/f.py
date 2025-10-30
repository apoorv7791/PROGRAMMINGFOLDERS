with open("myfile.txt", "w") as f:
    f.write("Hello World\n")
    f.write("Python is used for Automation tools\n")

with open("myfile.txt", "r") as f:
    print(f.read())

with open("myfile.txt", "a") as f:
    f.write("Python is also used for web development\n")

with open("myfile.txt", "r+") as f:
    print(f.read())