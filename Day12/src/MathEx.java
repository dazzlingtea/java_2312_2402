import java.util.*;
public class MathEx {

	public static void main(String[] args) {
		System.out.println(Math.abs(-10.1));
		
		System.out.println(Math.sin(Math.PI / 2)); //90도는?
		System.out.println(Math.cos(Math.PI / 4)); //45도는?
		System.out.println(Math.tan(Math.PI / 4)); //45도는?
		System.out.println(Math.tan(Math.PI / 2)); //90도는? 원래 무한대인데 파이 근사치라서 큰 수 나옴
		
		System.out.println(Math.exp(1));
		
		System.out.println(Math.floor(1.5));
		System.out.println(Math.ceil(1.5));
		System.out.println(Math.round(1.5)); //long 리턴
		
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
		 //랜덤 클래스 --> 랜덤 객체 생성
		 Random r = new Random();
		 System.out.println(r.nextInt()); //int의 범위 중 랜덤 정수
		 System.out.println(r.nextDouble());
		 System.out.println(r.nextInt(100)); //0~100
		 System.out.println(r.nextInt(100)+1); //1이상~101미만
	}

}
