import java.util.*;

class Record {
    String name; // name
    String codeanme; // id
    int age; // age

    public Record() {
        this.name = "";
        this.codeanme = "";
        this.age = 0;
    }

    public Record(String name, String codeanme, int age) {
        this.name = name;
        this.codeanme = codeanme;
        this.age = age;
    }

    void Track() {
        var sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter codename");
        codeanme = sc.nextLine();
        System.out.println("Enter age");
        age = sc.nextInt();
        sc.close();
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Codename: " + codeanme);
        System.out.println("Age: " + age);
    }

    void close() {
        System.out.println("Record closed");
    }

    void main() {
        var r1 = new Record();
        r1.Track();
        r1.show();
        r1.close();
    }
}