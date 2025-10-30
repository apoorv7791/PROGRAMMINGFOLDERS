# What is an Anagram
# An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
# For example, the word "cinema" is an anagram of "iceman".

# Code
str1 = "cinema"
str2 = "iceman"
if sorted(str1) == sorted(str2):
    print("Anagram")
else:
    print("Not an Anagram")