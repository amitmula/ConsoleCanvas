package amitmula.code.canvas;

import java.util.List;

public class CanvasAppTest {

}

class Point {
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

interface Shape {
	public void render();
	public List<Shape> getContainedShapes();
	public boolean contains(Point p);
}

class Line implements Shape {

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Shape> getContainedShapes() {
		return null;
	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

class Rectangle implements Shape {

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Shape> getContainedShapes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

class DrawingCanvas implements Shape {
	private int [][] bitmap;

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Shape> getContainedShapes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

}
