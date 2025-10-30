# Group Anagrams
# Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
# Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]

# Code
strs = ["eat", "tea", "tan", "ate", "nat", "bat", "tab"]
def groupAnagrams(strs):
    anagrams = {}
    for s in strs:
        sorted_s = ''.join(sorted(s))
        if sorted_s in anagrams:
            anagrams[sorted_s].append(s)
        else:
            anagrams[sorted_s] = [s]
    return list(anagrams.values())
print(groupAnagrams(strs))