import java.util.Scanner;

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	
	abstract String getValue(String key);
	// key�� �Ű������� �־��� �� keyArray���� 
	// key �ε�����ȣ�� ã�Ƽ� �� ��ȣ�� �ش��ϴ� valueArray ���� ��ȯ
	abstract void put(String key, String value);
	// key�� keyArray �ڿ� �߰�
	// value�� valueArray �ڿ� �߰�
	abstract void delete(String key);
	// key�� �Ű������� �־��� �� keyArray���� 
	// key �ε�����ȣ�� ã�Ƽ� �� ��ȣ�� �ش��ϴ� valueArray ���� ����
	abstract int length();
	// keyArray�� ���̸� ��ȯ
	
}

class Dictionary extends PairMap {
	private int size; // �� ���� �� �� �ֳ�
	private int count; // �� �� ����ֳ�
	public Dictionary(int size) {
		this.size = size; // ��� ũ�Ⱑ size
		keyArray = new String[size];
		valueArray = new String[size];
	}
	void put(String key, String value) {
		//keyArray �� �ڿ� key �߰�
		//valueArray �� �ڿ� value �߰�
		keyArray[count] = key; //0���� ��� ���� ����...
		valueArray[count] = value;
		count++; // ī��Ʈ�� 1
	}
	String getValue(String key) {
		for(int i=0; i<keyArray.length; i++) {
			if(keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null; // ���� �ش� ���� ������ �����ؾ� ��
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
// ���, �ٳ���, ������


public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dict = new Dictionary(10);
		dict.put("apple", "���");
		dict.put("banana", "�ٳ���");
		dict.put("orange", "������");
		System.out.println("apple�� " + dict.getValue("apple"));
		// �ٽ� ���� ����
	}

	
}
