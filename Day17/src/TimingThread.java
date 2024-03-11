//항상 별도의 클래스 해줘야 함

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
		TimerThread th = new TimerThread(); //객체만 생성한 거지 실행된거 아님
		th.start(); //스레드 실행 JVM이 스케줄링
		//th.start();  이미 하고 있어서 에러
		
		TimerThread th2 = new TimerThread(); 
		th2.start();  // 동시에 2개 실행 중인걸 알 수 있음
		
		//생성과 start 위치가 다르게 ?????
		
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
