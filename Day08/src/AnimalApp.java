class Animal {
	String name;
	int age;
	
	public Animal(String name) {
		this.name = name;
	}
	
}

class Human extends Animal {
	String address;
	public Human(String name) {
		super(name);
		this.address = "서울";
		
	}
}

public class AnimalApp {

	public static void main(String[] args) {
		Animal a;
		Human h = new Human("홍길동");
		a = h; //업캐스팅
		
		System.out.println(a.name);
		System.out.println(h.name);
		//System.out.println(a.address);
		System.out.println(h.address);
		
		System.out.println("==========");
		Animal a2 = new Human("홍길동"); //업캐스팅
		Human h2;
		//Human h2 = new Human("서울")
		//h2.address = "서울" ---> 업캐로 잘린 뒤 h2로 들어가는거라 null, 다시 줌 보기**** 
		
		h2 = (Human)a2; //다운캐스팅
		System.out.println(a2.name);
		System.out.println(h2.name);
		//System.out.println(a2.address);
		System.out.println(h2.address);
	
		
		
	}

}
