import java.util.Scanner;
public class IfExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		int year = sc.nextInt();
		String pass = "";

		//�ܼ� if��   8����
		if(year <= 3 && score >= 60)
			pass = "�հ�";
		if(year <= 3 && score < 60)
			pass = "���հ�";
		if(year == 4 && score >= 70)
			pass = "�հ�";
		if(year == 4 && score < 70)
			pass = "���հ�";
		System.out.println(pass);
		
		String pass2 = "";
		//��ø if�� �г� -> ���� 2����
		if(year == 4) {
			if(score >= 70)
				pass2 = "�հ�";
			else
				pass2 = "���հ�";
		}
		else {//4�г��� �ƴ� ���
			if(score >= 60)
				pass2 = "�հ�";
			else
				pass2 = "���հ�";
		}
		System.out.println(pass2);
		
		String pass3 = "";
		// ��ø if�� - ���� > �г� �ּ�1����
		if(score >= 70)
			pass3 = "�հ�";
		else if(score >= 60) {
			if(year == 4)
				pass3 = "���հ�";
			else //year !=4
				pass3 = "�հ�";
		}
		else // score <60
			pass3 = "���հ�";
		System.out.println(pass3);
		
	}

}
