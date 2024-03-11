import java.util.Scanner;

class Queue {
	int size = 0;
	int elements[];
	int front = 0;
	int rear = 0;
	
	Queue() {
		elements = new int[8];
	}
	void enqueue(int v) {
		if(rear == 8) return;
		elements[rear] = v;
		rear++;
		size++;
	}
	int dequeue() {
		if(front == rear) return 0;
		int value = elements[front];
		elements[front] = 0;
		front++;
		size--;
		return value;
	}
	boolean empty() {
//		if(size == 0) return true;
//		else return false;
		return (size == 0);
	}
	int getSize() {
		return size;
	}
	
}

public class QueueApp {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //몇 번 수행할거냐
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt(); //enqueue
            if (n == -1) {
                if (!queue.empty()) queue.dequeue(); //dequeue
            } else {
                queue.enqueue(n);
            }
        }
        while (!queue.empty())
            System.out.println(queue.dequeue());
    }
}