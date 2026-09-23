import java.util.*;
class oriented{
   String name;
   int age;
   oriented(){
   }
   void Get(){
	var sc = new Scanner(System.in);
	System.out.println("Enter name: ");
	name = sc.nextLine();
	System.out.println("Enter age: ");
	age = sc.nextInt();
   }
   void Show(){	
	System.out.println("Name is: " + name);
	System.out.println("Age is: " + age);
   }
   void main(){
	var ob = new oriented();
	ob.Get();
	ob.Show();
   }
}
