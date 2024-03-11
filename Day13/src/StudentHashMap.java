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
		
		hm.put("홍길동", new Student(20240001, "010-1234-1234"));
		hm.put("홍길순", new Student(20240002, "010-1234-1235"));
		hm.put("홍길박", new Student(20240003, "010-1234-1236"));
		
		while(true) {
			System.out.println("학생의 이름을 입력하세요 >>> ");
			String input = sc.nextLine();
			if(input.equals("종료"))
				break;
			if(hm.get(input) == null) System.out.println("없는 학생입니다.");
			
			else if(hm.get(input).getGrade() == 0) {
				System.out.println("학점을 입력하세요 >>> ");	
				double g = sc.nextDouble();
				sc.nextLine();
				hm.get(input).setGrade(g);
			}
			else System.out.println(input + "학생의 학점은 "+ hm.get(input).getGrade());
		}
		
		
		

		
	}

}
