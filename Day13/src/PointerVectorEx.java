import java.util.*;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point("+this.x+", "+this.y+")";
	}
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		return this.x == p.x && this.y == p.y;
	}
}

public class PointerVectorEx {
	
	public static void printVector(Vector<Point> v) {
		// call by reference 
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		//v.remove(0);
	}

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		
		v.add(new Point(2, 3));
		v.add(new Point(5, 10));
		v.add(new Point(3, 7));
		
		v.add(2, new Point(-4, 1));
		
		printVector(v);
		System.out.println(v.size());
		
		
		Point p1 = v.remove(3);
		System.out.println(p1);
		
		System.out.println(v.remove(new Point(5, 10))); //주소가 다르다 equals
		
		for(int i=0; i<2 ; i++) {
			System.out.println(v.get(i));
		}
		System.out.println(v.contains(new Point(-4, 1))); //값이라 true
		System.out.println(v.contains(new Point(5, 1)));
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		Object pArray[] = v.toArray();
		for(Object p: pArray) {
			Point pvalue = (Point)p;
			System.out.println(pvalue);
		}
		
		v.clear();
		System.out.println("clear 후 "+v.size());
		System.out.println(v.capacity());
		
		
		
	}

}
