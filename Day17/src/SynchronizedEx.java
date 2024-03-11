
class SharedData {
	private int count = 0;
	synchronized public void visit() {//sync 추가하면 순서대로 잘 나옴
		int n = count; //접근번호 올리고 있음
		Thread.yield(); //고의로 충돌 관찰하기 위해
		n++;
		count = n;
		System.out.println(Thread.currentThread().getName()+" "+count);
	}
}
class UserThread extends Thread {
	private SharedData data;
	public UserThread(String name, SharedData data) {
		super(name);
		this.data = data;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			data.visit();
		}
	}
}

public class SynchronizedEx {
	public static void main(String[] args) {
		SharedData data = new SharedData();
		
		Thread th1 = new UserThread("Thread A", data);
		Thread th2 = new UserThread("Thread B", data);
		
		th1.start();
		th2.start();

	}

}
