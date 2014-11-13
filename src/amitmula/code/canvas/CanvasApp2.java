package amitmula.code.canvas;

class Coordinate {
	int x;
	int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

class Container{
	Container parent;
	Coordinate x1y1;
	Coordinate x2y2;
	
	
	public Container getParent() {
		return parent;
	}
	public void setParent(Container parent) {
		this.parent = parent;
	}
	public Coordinate getX1y1() {
		return x1y1;
	}
	public void setX1y1(Coordinate x1y1) {
		this.x1y1 = x1y1;
	}
	public Coordinate getX2y2() {
		return x2y2;
	}
	public void setX2y2(Coordinate x2y2) {
		this.x2y2 = x2y2;
	}
	
	
}

public class CanvasApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
