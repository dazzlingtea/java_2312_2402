class AutoRunnable implements Runnable {
	public void run() {
		try {
			Thread.sleep(10000);
			System.out.println("�����մϴ�");
		} catch(InterruptedException e) {
			return;
		}
	}
}

public class AutoCloseRunnable {

	public static void main(String[] args) {
		Thread th = new Thread(new AutoRunnable());
		th.start();

	}

}
