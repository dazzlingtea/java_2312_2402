
class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return this.weight;
	}
}

class Student extends Person {
	public void set() {
		name = "ȫ�浿";
		height = 175;
		age = 30;
		//weight = 80; getter setter�� �־�� �����̺��� �ٷ� �� ����
		setWeight(80);
	}
}


public class StrudentApp {
	public static void main(String[] args) {
		Student s =  new Student();

	}

}
