// We'll learn about hashmaps 
// A Hashmaps is a data structure that enables fast and efficient look up by splitting the data in key-value pairs.
// the dataset is looked at constant O(1) time

// Given a string str count how man characters that are appearing at least twice 
import java.util.*;
class freq {
    void main(){
	var str = "Apoorv Singh";
	var count = 0;
	var map = new HashMap<Character, Integer>();
	for(char ch : str.toCharArray()){
		map.put(ch, map.getOrDefault(ch, 0) + 1);
	}
	System.out.println("Character that was appearing twice: "); 
	for(var entry : map.entrySet()){
	    if (entry.getValue() >= 2)  System.out.println(entry.getKey() + " -> " + entry.getValue());
		count += 1; 
	}
	System.out.println("Characters Appearing twice: " + count);
    }
}
