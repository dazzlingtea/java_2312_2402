class Phone {
	String company;
	int size;
	
	public Phone(int size) {
		this("�Ｚ", size); 
    }
	
	public Phone(String company, int size) {
		this.company = company;
		this.size = size; //size ��� ��Ʈ�� �ʵ� ����
    }
	
	public String getInfo() {
		return "������ = "+ this.company +" ũ�� = "+ this.size +"��ġ";
	}
	
}
public class PhoneApp {

	public static void main(String[] args) {
		Phone p[];//Phone�� �迭�� �����
		p = new Phone[10]; // �迭 ����   ->���� ��ü�� �����ؾ� ��
		
		for(int i=0; i<p.length; i++) {
			p[i] = new Phone(i+1); //Ŭ������ [] ���� (), i+1�� �⺻�����ڰ� �����ϱ�
		}//p[0] = Phone(1)->5�� �Ｚ,1 ->9�� this.company="�Ｚ"...
		//�Ʒ� a.getInfo�� �������� ������ = �Ｚ ũ�� = 1��ġ
		
		for(Phone a: p) { //a�� Phone
			
			System.out.println(a.getInfo());
		}
	}

}
