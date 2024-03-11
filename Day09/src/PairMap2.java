abstract class PairMap22 {
	protected String keyArray[];
	protected String valueArray[];
	
	abstract String getValue(String key);
	// key�� �Ű������� �־��� �� keyArray����
	// key�� �ε��� ��ȣ�� ã�Ƽ� �� �ε��� ��ȣ�� �ش��ϴ�
	// valueArray�� ���� ��ȯ
	
	abstract void put(String key, String value);
	// key�� keyArray �ڿ� �߰�
	// value�� valueArray �ڿ� �߰�
	
	abstract void delete(String key);
	// key�� �Ű������� �־��� �� keyArray����
	// key�� �ε��� ��ȣ�� ã�Ƽ� �� �ε��� ��ȣ�� �ش��ϴ�
	// keyArray�� valueArray�� ����
	
	abstract int length();
	// keyArray�� ���̸� ��ȯ
}

// apple, banana, orange
// ���, �ٳ���, ������

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
		dict.put("apple", "���");
		dict.put("banana", "�ٳ���");
		dict.put("orange", "������");
		System.out.println("apple�� " + dict.getValue("apple"));
		System.out.println("���̴� " + dict.length());
		dict.delete("banana");
		System.out.println("���̴� " + dict.length());
	}

}
