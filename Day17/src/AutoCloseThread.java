
class AutoClosingThread extends Thread implements Runnable {
	int second = 0;
	public void run() {
			try {
				sleep(10000);
				System.out.println("종료합니다");
			} catch(InterruptedException e) {
				return;

		}
	}
}

public class AutoCloseThread {
	public static void main(String[] args) {
		AutoClosingThread th = new AutoClosingThread();
		th.start();

	}

}
