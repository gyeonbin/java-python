package p1_circle;

public class Point {
	private int xPos, yPos;
	public Point() {}
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPointInfo() {
		System.out.println("["+xPos+","+yPos+"]");
	}
}
