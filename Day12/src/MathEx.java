import java.util.*;
public class MathEx {

	public static void main(String[] args) {
		System.out.println(Math.abs(-10.1));
		
		System.out.println(Math.sin(Math.PI / 2)); //90����?
		System.out.println(Math.cos(Math.PI / 4)); //45����?
		System.out.println(Math.tan(Math.PI / 4)); //45����?
		System.out.println(Math.tan(Math.PI / 2)); //90����? ���� ���Ѵ��ε� ���� �ٻ�ġ�� ū �� ����
		
		System.out.println(Math.exp(1));
		
		System.out.println(Math.floor(1.5));
		System.out.println(Math.ceil(1.5));
		System.out.println(Math.round(1.5)); //long ����
		
		 System.out.println(Math.sqrt(4));
		 System.out.println(Math.sqrt(2));
		 System.out.println(Math.cbrt(8));
		 
		 System.out.println(Math.max(100, 99));
		 System.out.println(Math.min(100, 99));
		 
		 System.out.println(Math.random());
		 System.out.println(Math.random());
		 System.out.println(Math.random());
		 System.out.println(Math.random());
		 System.out.println(Math.random());
		 System.out.println(Math.random());
		 System.out.println(Math.random());
		 
		 for(int i=0; i<6; i++) {
			 System.out.println((int)(Math.random()*45));
		 }
		 //���� Ŭ���� --> ���� ��ü ����
		 Random r = new Random();
		 System.out.println(r.nextInt()); //int�� ���� �� ���� ����
		 System.out.println(r.nextDouble());
		 System.out.println(r.nextInt(100)); //0~100
		 System.out.println(r.nextInt(100)+1); //1�̻�~101�̸�
	}

}
