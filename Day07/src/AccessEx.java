import test.AccessEx2;


class Sample {
	public int a; //������
	private int b; // ���� Ŭ����
	int c; //����Ʈ ���� ��Ű��
	//protected ���� ��Ű�� + �ٸ� ��Ű�� ���� ��ӹ��� Ŭ����
	protected int d;
}

class Sample2 extends AccessEx2 {
    void f() {
        a = 1;
        // b = 2;
        // c = 3;
        d = 4;
//protected ���� �� �ٸ� ��Ű������ ��ӹ��� ���� �θ� Ŭ������ ��� ������ �ٷ� ������ ��쿡�� �ش��մϴ�.
//�ڽ� Ŭ���� ������ �θ� Ŭ���� ��� ������ �ٷ� �����ϴ� ���� �ƴ϶� �θ� Ŭ������ ��ü�� �����Ͽ� ���� �ϴ� ��쿡�� 
//protected�� ���ǿ� �ش����� �ʾ� ������ ������ �߻��մϴ�.
    }
}


public class AccessEx {

	public static void main(String[] args) {
		Sample s = new Sample(); 
		s.a = 1;
		//s.b = 2; ����; ���� �̰� AccessEx Ŭ������ �־ ���� Ŭ������ �ƴ�
		s.c = 3;

		AccessEx2 t = new AccessEx2(); // �ٸ� ��Ű��
		t.a = 1;
		// t.b = 2; �ƿ� ��Ű���� �ٸ�
		// t.c = 3; �ٸ� ��Ű��
		// t.d = 4; �ٸ� ��Ű���ε� ����� �ƴ�
		
	}

}
