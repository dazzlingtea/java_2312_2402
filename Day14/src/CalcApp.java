import java.util.*;

class Calc<T extends Number> {
	void add(T a, T b) {	}
	void sub(T a, T b) {	}
	void mul(T a, T b) {	}
	
}


public class CalcApp {

	public static void main(String[] args) {
		 Calc<Number> c1 = new Calc<Number>();
		 Calc<Integer> c2 = new Calc<Integer>();
		 Calc<Double> c3 = new Calc<Double>();

//		 Calc<Object> c4 = new Calc<>(); // extends 넘버 하면 에러
//		 Calc<String> c5 = new Calc<>();
		 
		 Object[] arr = new Integer[1];
//		 ArrayList<Object> list = new ArrayList<Integer>(); 컬렉션은 업캐스팅이 안 됨-> 제네릭 와일드카드 사용
		 
		 ArrayList<? extends Object> list = new ArrayList<String>();
		 ArrayList<? super String> list2 = new ArrayList<Object>();
		 
	}

}
