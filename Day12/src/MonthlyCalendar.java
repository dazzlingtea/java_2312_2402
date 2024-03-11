import java.util.*;
public class MonthlyCalendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		
		System.out.println(year+"�� "+month+"�� �޷�");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		int startDay = c.get(Calendar.DAY_OF_WEEK);
		String firstWeek = "";
		
		for(int i=1; i<startDay; i++) {
			firstWeek += "\t";
		}
		
		int dayCount = 1;
		for(int i=startDay ; i<=7; i++) {
			firstWeek += dayCount + "\t";
			dayCount++;
		}
		System.out.println(firstWeek);
		
		System.out.println(c.getActualMaximum(Calendar.DATE));
		int maxDay = c.getActualMaximum(Calendar.DATE);
		
		// �� ���� ���
		
		while(true) {
			String curWeek = "";
			for(int i=0; i<7; i++) {
				curWeek += dayCount + "\t";
				if(dayCount == maxDay) break;
				dayCount++; 
			}
			System.out.println(curWeek);
			if(dayCount == maxDay) break;
		}
		
		// ���ں��� ������ �Ǵ��ؼ� ���
		dayCount = 7;
		for(int i = dayCount ; i<= maxDay ; i++) {
			if(i % 7 == 0) {
				System.out.println();}
			System.out.print(i+"\t");
		}
		
	}

}
