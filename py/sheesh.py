# count how many words appear in a sentence

# input a sentence 
# make an empty dictionary to keep track of the words 
# split the sentence into words 
# iterate over the words 
# if the word is already in the dictionary, increment the count 
# else, add the word to the dictionary with a count of 1 
# print the dictionary 

# Code 
sentence = input("Enter a sentence:")

words_count = {}
words = sentence.split()
for word in words:
    if word in words_count:
        words_count[word] += 1
    else:
        words_count[word] = 1
print(f"The words count is {words_count}")