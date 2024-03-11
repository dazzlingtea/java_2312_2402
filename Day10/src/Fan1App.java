import java.util.*;

class Fan1 {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	int speed = SLOW;
	boolean on = false;
	double radius = 5;
	String color = "blue";
	
	int getSpeed() { return this.speed; }
	boolean getOn() { return this.on; }
	double getRadius() { return this.radius; }
	String getColor() { return this.color; }
	
	void setSpeed(int speed) {this.speed = speed;}
	void setOn(boolean on) {this.on = on;}
	void setRadius(double radius) {this.radius = radius;}
	void setColor(String color) {this.color = color;}
	
	Fan1() {
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}
//Object 클래스 안 toString 메소드를 오버라이딩
	public String toString() {
		if(this.on) {//선풍기가 켜져있다면 선풍기의 속도, 색상, 반지름을 하나의 string으로 반환
			return String.format("speed %d\ncolor %s\nradius %.2f", 
								this.speed, this.color, this.radius);
		}
		else {//선풍기가 꺼져있다면, 선풍기의 색상, 반지름, “fan is off” 하나의 string으로 반환
			return String.format("color %s\nradius %.2f\nfan is off",
								this.color, this.radius);
		}
	}
}


public class Fan1App {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 설정 수 입력 받음

        Fan1 fan1 = new Fan1();
        for (int i = 0; i < n; i++) { //speed, radius, on 등 옵션을 설정 수 n만큼 입력 받음
            String op = sc.next(); //speed 입력 받
            String val = sc.next(); //FAST 입력 받
            if (op.compareTo("speed") == 0) { //여러 옵션 중 speed냐?
                if (val.compareTo("SLOW") == 0) fan1.setSpeed(Fan1.SLOW);
                else if (val.compareTo("FAST") == 0) fan1.setSpeed(Fan1.FAST);
                else fan1.setSpeed(Fan1.MEDIUM);
            } else if (op.compareTo("radius") == 0) { //여러 옵션 중 radius냐?
                fan1.setRadius(Double.parseDouble(val));
            } else if (op.compareTo("color") == 0) {
                fan1.setColor(val);
            } else if (op.compareTo("on") == 0) {
                if (val.compareTo("true") == 0) fan1.setOn(true);
                else fan1.setOn(false);
            }
        }
        System.out.println(fan1.toString());
    }
}