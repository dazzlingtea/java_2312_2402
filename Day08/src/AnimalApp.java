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
		this.address = "����";
		
	}
}

public class AnimalApp {

	public static void main(String[] args) {
		Animal a;
		Human h = new Human("ȫ�浿");
		a = h; //��ĳ����
		
		System.out.println(a.name);
		System.out.println(h.name);
		//System.out.println(a.address);
		System.out.println(h.address);
		
		System.out.println("==========");
		Animal a2 = new Human("ȫ�浿"); //��ĳ����
		Human h2;
		//Human h2 = new Human("����")
		//h2.address = "����" ---> ��ĳ�� �߸� �� h2�� ���°Ŷ� null, �ٽ� �� ����**** 
		
		h2 = (Human)a2; //�ٿ�ĳ����
		System.out.println(a2.name);
		System.out.println(h2.name);
		//System.out.println(a2.address);
		System.out.println(h2.address);
	
		
		
	}

}
