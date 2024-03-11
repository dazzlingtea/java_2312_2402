import java.util.*;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(5);
		
		v.add(3);
		v.add(4);
		v.add(5);
//		v.add("hello"); 에러 남
		v.add(2, 8);
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2)); //여기에 8
		System.out.println(v.get(3));//capacity 상관없이 해당 인덱스에 값이 없어서 어레이아웃오브바인 익셉션
		
		v.add(6);
		v.add(7);
		System.out.println(v.get(4)); 
		System.out.println(v.get(5)); 
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		v.clear();
		System.out.println("clear");
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		for(int i=1; i<=10; i++) v.add(i);
		System.out.println(v.contains(10));
		System.out.println(v.contains(11));
		
		System.out.println(v.isEmpty()); //비었으면 true
		v.clear();
		System.out.println("clear 후 "+v.isEmpty()); //비었으면 true
		
		for(int i=1; i<=10; i++) v.add(i);
		v.remove(3);
		
		for(int i=0; i<9; i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		
		v.remove(Integer.valueOf(5));
		for(int i=0; i<8; i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		System.out.println(v.remove(Integer.valueOf(5)));; //아무 일 없음 remove return 타입은 불린이어서
		
		Object[] iArray = v.toArray();
		for(Object i: iArray) {
			Integer value = (Integer)i;
			System.out.print(value + " ");
		}
		System.out.println();
		v.removeAllElements();
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		
		Vector<Integer> v1 = new Vector<Integer>(5);
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		System.out.println("테스트 " + v1.get(1));
		System.out.println("테스트 " + v1.get(Integer.valueOf(3)));
		
		for (int i = 1; i <= 10; i++) {
            v1.add(i);
        }

        System.out.println("Size of Vector: " + v1.size());
	}

}
