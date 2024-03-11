//�׻� ������ Ŭ���� ����� ��

class TimerThread extends Thread {
	int second = 0;
	public void run() {
		while(true) {
			System.out.println(second);
			second++;
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class TimingThread {

	public static void main(String[] args) {
		TimerThread th = new TimerThread(); //��ü�� ������ ���� ����Ȱ� �ƴ�
		th.start(); //������ ���� JVM�� �����ٸ�
		//th.start();  �̹� �ϰ� �־ ����
		
		TimerThread th2 = new TimerThread(); 
		th2.start();  // ���ÿ� 2�� ���� ���ΰ� �� �� ����
		
		//������ start ��ġ�� �ٸ��� ?????
		
		//th.interrupt();
		System.out.println(th.getId());
		System.out.println(th2.getId());

		System.out.println(th.getName());
		System.out.println(th2.getName());
		
		System.out.println(th.getPriority());
		System.out.println(th2.getPriority());
		
		th2.setPriority(1);
		System.out.println(th.getState());
		System.out.println(th2.getState());
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		
	}

}
