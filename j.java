import java.util.HashSet;

public class j {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.remove(5);
        System.out.println(h);

        for (int i : h) { // for each loop for iterating over the hashset
            System.out.println(i);
        }

        if (h.contains(1)) {
            System.out.println("1 is present");
        }
    }
}

// Output:
// {1, 2, 3, 4, 5}

// we are using a hashset to store the unique elements in the array and printing
// it

// how to remove an element

// h.remove(1);
// how can thi work with strings

// h.add("a");
// h.add("b");
// h.add("c");
// h.add("d");
// h.add("e");
// h.add("f");
// h.add("g");
// h.add("h");
// h.add("i");
// h.add("j");
// h.add("k");
// h.add("l");
// h.add("m");
// h.add("n");
// h.add("o");
// h.add("p");
// h.add("q");
// h.add("r");
// h.add("s");
// h.add("t");
// h.add("u");
// h.add("v");
// h.add("w");
// h.add("x");
// h.add("y");
// h.add("z");