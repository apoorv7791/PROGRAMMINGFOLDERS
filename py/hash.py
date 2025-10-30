# write a program to check how many words appear in a file 

with open("myfile.txt", "r") as f:
    text = f.read()
    words = text.split()
    print(len(words))