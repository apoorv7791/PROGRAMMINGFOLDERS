import java.util.*;
class request{
   String name;
   String address;
   void get(){
	var scanner = new Scanner(System.in);
	System.out.println("Enter name: ");
	name = scanner.nextLine();
	System.out.println("Enter address:" );
	address = scanner.next();
   }
   void show(){
	System.out.println("Name is: " + name);
	System.out.println("Address is: " + address);
   }
   void main(){
	var req1 = new request();
	req1.get();
	req1.show();
   }
}

