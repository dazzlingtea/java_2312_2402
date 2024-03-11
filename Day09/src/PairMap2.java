abstract class PairMap22 {
	protected String keyArray[];
	protected String valueArray[];
	
	abstract String getValue(String key);
	// key를 매개변수로 넣었을 때 keyArray에서
	// key의 인덱스 번호를 찾아서 그 인덱스 번호에 해당하는
	// valueArray의 값을 반환
	
	abstract void put(String key, String value);
	// key를 keyArray 뒤에 추가
	// value를 valueArray 뒤에 추가
	
	abstract void delete(String key);
	// key를 매개변수로 넣었을 때 keyArray에서
	// key의 인덱스 번호를 찾아서 그 인덱스 번호에 해당하는
	// keyArray와 valueArray를 삭제
	
	abstract int length();
	// keyArray의 길이를 반환
}

// apple, banana, orange
// 사과, 바나나, 오렌지

class Dictionary2 extends PairMap22 {
	private int size;
	private int count;
	
	public Dictionary2(int size) {
		this.size = size;
		keyArray = new String[size];
		valueArray = new String[size];
	}
	String getValue(String key) {
		for(int i=0; i<keyArray.length; i++) {
			if(keyArray[i].equals(key))
				return valueArray[i];
		} return null;
	}
	void put(String key, String value) {
		keyArray[count] = key;
		valueArray[count] = value;
		count++;
	}
	void delete(String key) {
		int index = -1;
		for(int i=0; i<keyArray.length; i++) {
			if(keyArray[i].equals(key)) {
				index = i;
				break;
			}
		}
		for(int i=index; i<count; i++) {
			keyArray[i] = keyArray[i+1];
			valueArray[i] = valueArray[i+1];
		}
		keyArray[count-1] = "";
		valueArray[count-1] = "";
		count--;
	}
	int length() {
		return count;
	}
}


public class PairMap2 {
	public static void main(String[] args) {
		Dictionary2 dict = new Dictionary2(10);
		dict.put("apple", "사과");
		dict.put("banana", "바나나");
		dict.put("orange", "오렌지");
		System.out.println("apple은 " + dict.getValue("apple"));
		System.out.println("길이는 " + dict.length());
		dict.delete("banana");
		System.out.println("길이는 " + dict.length());
	}

}
