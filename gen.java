class gen {
    public static <T> void printElements(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        printElements(new Integer[] { 1, 2, 3, 4, 5 });
        printElements(new String[] { "Hello", "World" });
        printElements(new Double[] { 1.2, 3.4, 5.6 });
    }
}
// uses of generics?
// Ans:- generics are used to create reusable code.