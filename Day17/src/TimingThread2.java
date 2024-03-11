class TimerRunnable implements Runnable {
	int second = 0;
	public void run() {
		while(true) {
			System.out.println(second);
			second++;
			try {
				Thread.sleep(1000); // �������� �޼��� ����ϴ� �Ŵϱ�
			} catch(InterruptedException e) {
				//syso("Interrupted") return; ���� -> ���ᰡ �ƴ� ����
				return;
			}
		}
	}
}

public class TimingThread2 {

	public static void main(String[] args) {
		Thread th = new Thread(new TimerRunnable());
		th.start();

	}

}
