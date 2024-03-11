class TimerRunnable implements Runnable {
	int second = 0;
	public void run() {
		while(true) {
			System.out.println(second);
			second++;
			try {
				Thread.sleep(1000); // 스레드의 메서드 사용하는 거니까
			} catch(InterruptedException e) {
				//syso("Interrupted") return; 없이 -> 종료가 아닌 간섭
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
