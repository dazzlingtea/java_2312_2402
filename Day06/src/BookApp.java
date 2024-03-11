import java.util.Scanner;
class Book {
	String title, author;
	public Book() {
		this("�������");
	}
	public Book(String title) { //String �ϳ�¥�� 2�� ���� �� ����
		this(title, "���ڹ̻�");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String getInfo() {
		return this.title + "(" + this.author + ")";
	}
	
}
public class BookApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt(); //�� �迭�� ũ�Ⱑ ������
		sc.nextLine(); //�ֿܼ� ���� �Է� �� ���͸� �����϶��
		
		Book b[] = new Book[count];
		for(int i=0; i<count; i++) {
			System.out.print("���� >> ");
			String title = sc.nextLine();
			System.out.print("���� >> ");
			String author = sc.nextLine();
			
			if(title.length() == 0 && author.length() == 0) {
				b[i] = new Book(); //�迭 ��ҿ� ��ü ����
			} else if(author.length() == 0) {
				b[i] =new Book(title);
			} else {
				b[i] = new Book(title, author);
			}
		}
		for(Book c : b) {//���۷��� ���� �迭 b,�� ���� ������ ������ Book Ÿ�� 
			System.out.println(c.getInfo()); //c�� �ִ� �������� �����;�
			//c.title c.author�� ������
		}
	}

}
