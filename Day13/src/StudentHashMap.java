import java.util.*;

class Student {
	private int num; 
	private double grade;
	private String phone;
	
	double getGrade() {return this.grade;}
	void setGrade(double grade) {this.grade = grade;}
	
	public Student(int num, String phone) {
		this.num = num;
		this.phone = phone;
	}
	
}


public class StudentHashMap {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		HashMap<String, Student> hm = new HashMap<String, Student>();
		
		hm.put("ȫ�浿", new Student(20240001, "010-1234-1234"));
		hm.put("ȫ���", new Student(20240002, "010-1234-1235"));
		hm.put("ȫ���", new Student(20240003, "010-1234-1236"));
		
		while(true) {
			System.out.println("�л��� �̸��� �Է��ϼ��� >>> ");
			String input = sc.nextLine();
			if(input.equals("����"))
				break;
			if(hm.get(input) == null) System.out.println("���� �л��Դϴ�.");
			
			else if(hm.get(input).getGrade() == 0) {
				System.out.println("������ �Է��ϼ��� >>> ");	
				double g = sc.nextDouble();
				sc.nextLine();
				hm.get(input).setGrade(g);
			}
			else System.out.println(input + "�л��� ������ "+ hm.get(input).getGrade());
		}
		
		
		

		
	}

}
