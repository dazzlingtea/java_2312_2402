import java.util.*;

class GenericMap<K, V> {
	Object[] kArr, vArr;
	int capacity, size;
	
	public GenericMap() {
		this(10);
	}
	public GenericMap(int capacity) {
		this.capacity = capacity;
		kArr = new Object[capacity];
		vArr = new Object[capacity];
	}
	public void add(K k, V v) {
		if(exist(k) != -1) {
			vArr[exist(k)] = v;
		}
		if(size == capacity) 
			return;
		kArr[size] = k;
		vArr[size] = v;
		size++;
	}
	
	public int exist(K k) {
		for(int i=0; i<size; i++) {
			if(k == kArr[i]) return i;
		}
		return -1;
	}
	public V delete(K k) {
		int e = exist(k);
		if(e == -1) return null;
		V result = (V)vArr[e];
		for(int i=e+1; i<size; i++) {
			kArr[i-1] = kArr[i];
			vArr[i-1] = vArr[i];
		}
		size--;
		kArr[size] = vArr[size] = null;
		return result;
	}
	public  V get(K k) {
		int e = exist(k);
		if(e == -1) 
			return null;
		return (V)vArr[e];
	}
	public int size() {
		return size;
	}
	public boolean empty() {
		return size == 0;
	}
	public Object[] keyArray() { // 배열 복사
		Object[] retArray = new Object[size];
		for(int i=0; i<size; i++) {
			retArray[i] = kArr[i];
		}
		return retArray;  
	}
	public Object[] valueArray() {
		Object[] retArray = new Object[size];
		for(int i=0; i<size; i++) {
			retArray[i] = vArr[i];
		}
		return retArray;  
	}

}


public class MyMap {
	static <K, V> GenericMap<K,V> sortByKey(GenericMap<K,V> gm) {
		Object[] keyArray = gm.keyArray();
		Arrays.sort(keyArray);
		
		GenericMap<K, V> ret =new GenericMap<K, V>();
		for(Object obj: keyArray) {
			ret.add((K)obj, gm.get((K)obj));
			System.out.println((K)obj+" ");
		}
		System.out.println();
		return null;
		
	}
	
	public static void main(String[] args) {
		GenericMap<String, Integer> gm = new GenericMap<String, Integer>();
		
		gm.add("python", 100);
		gm.add("java", 90);
		gm.add("english", 80);
		gm.add("chemistry", 95);

		System.out.println(gm.delete("cpp"));
		System.out.println(gm.delete("english"));
		
		System.out.println(gm.size);
		System.out.println(gm.get("python"));
		System.out.println(gm.get("data"));
		System.out.println(gm.empty());
		System.out.println(gm.exist("java"));
		System.out.println(gm.exist("ai"));
		
		Object[] keyArray = gm.keyArray();
		Object[] valueArray = gm.valueArray();
		for(Object k: keyArray) {
			System.out.print((String)k+" ");
		}
		System.out.println();
		for(Object v: valueArray) {
			System.out.print((String)v+" ");
		}
		System.out.println();
		
		GenericMap<String, Integer> gm2 = sortByKey(gm);
		Object[] keyArray2 = gm2.keyArray();
		Object[] valueArray2 = gm2.valueArray();
		for(Object k: keyArray2) {
			System.out.print(k+" ");
		}
		System.out.println();
		for(Object v: valueArray2) {
			System.out.print(v+" ");
		}
		System.out.println();
		
	}

}
