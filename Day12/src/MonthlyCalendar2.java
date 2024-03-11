

import java.util.Calendar;
import java.util.Scanner;
public class MonthlyCalendar2 {

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
		
		
		for(int i = dayCount ; i<=maxDay; i++) {
			if((i-dayCount) % 7 == 6)
				System.out.println(i);
			else
				System.out.print(i+"\t");
		}
		
	}

}
