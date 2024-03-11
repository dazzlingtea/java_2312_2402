class Person2 {}
class Student2 extends Person2 {}
class Researcher2 extends Person2 {}
class Professor2 extends Researcher2 {}


public class InstanceofEx {
	static void print(Person2 p) {
		if(p instanceof Person2)
			System.out.print("Person ");
		if(p instanceof Student2)
			System.out.print("Student ");
		if(p instanceof Researcher2)
			System.out.print("Researcher ");
		if(p instanceof Professor2)
			System.out.print("Professor ");
	System.out.println();
	}
	
	
	public static void main(String[] args) {
		print(new Student2());
		print(new Researcher2());
		print(new Professor2());

	}

}
