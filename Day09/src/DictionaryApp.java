import java.util.Scanner;

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	
	abstract String getValue(String key);
	// key를 매개변수로 넣었을 때 keyArray에서 
	// key 인덱스번호를 찾아서 그 번호에 해당하는 valueArray 값을 반환
	abstract void put(String key, String value);
	// key를 keyArray 뒤에 추가
	// value를 valueArray 뒤에 추가
	abstract void delete(String key);
	// key를 매개변수로 넣었을 때 keyArray에서 
	// key 인덱스번호를 찾아서 그 번호에 해당하는 valueArray 값을 삭제
	abstract int length();
	// keyArray의 길이를 반환
	
}

class Dictionary extends PairMap {
	private int size; // 몇 개가 들어갈 수 있냐
	private int count; // 몇 개 들어있냐
	public Dictionary(int size) {
		this.size = size; // 어레이 크기가 size
		keyArray = new String[size];
		valueArray = new String[size];
	}
	void put(String key, String value) {
		//keyArray 맨 뒤에 key 추가
		//valueArray 맨 뒤에 value 추가
		keyArray[count] = key; //0번에 사과 애플 들어가고...
		valueArray[count] = value;
		count++; // 카운트는 1
	}
	String getValue(String key) {
		for(int i=0; i<keyArray.length; i++) {
			if(keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null; // 조건 해당 없을 때에도 리턴해야 함
	}
	void delete(String key) {
		int index = -1;
		for(int i=0; i<keyArray.length; i++) {
			if(keyArray[i].equals(key)) {
				index = i;
				break;
			}
		}
		for(int i=index ; i<count; i++) {
			keyArray[i] = keyArray[i+1];
			valueArray[i] = valueArray[i+1];
		}
		keyArray[count-1] = "";
		valueArray[count-1] = "";
		count--;
	}
	int length( ) { 
		return count;
	}
}

// apple, banana, orange
// 사과, 바나나, 오렌지


public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dict = new Dictionary(10);
		dict.put("apple", "사과");
		dict.put("banana", "바나나");
		dict.put("orange", "오렌지");
		System.out.println("apple은 " + dict.getValue("apple"));
		// 다시 영상 복습
	}

	
}
