import java.util.*;
public class DateEx {

	public static void main(String[] args) {
		Date d= new Date(); // �Ű����� �� ���� ���� �ð�
		System.out.println(d);
		System.out.println(d.getTime());//1705058424242 epoch converter

		Date d2= new Date(0); // 
		System.out.println(d2); //�ѱ��� �׸���ġ+9�ð��̶� 9 ���
		
		if(d.after(d2)) //d�� d2����
			System.out.println("after");
		if(d.before(d2))
			System.out.println("before");
		
		d2.setTime(1705058444L); //setTime���� �ð� �ٲٱ�
		System.out.println(d2);
		
		//����� calendar ����
		System.out.println(d.getYear()); //1900�� ���� �� ��? 
		System.out.println(d.getMonth()); //0���� �� ��? 1��
		System.out.println(d.getDate()); 
	}

}
