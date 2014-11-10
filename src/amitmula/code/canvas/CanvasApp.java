package amitmula.code.canvas;

import java.util.Scanner;

class Canvas {
	char[][] canvasArray;
	int w, h;
	public Canvas(int w, int h) {
		h+=2;
		w+=2;
		this.w = w;
		this.h = h;
		canvasArray = new char[h][w];		
		line(0, 0, this.w-1, 0, '-');
		line(0, this.h-1, this.w-1, this.h-1, '-');
		line(0, 1, 0, this.h-2, '|');
		line(this.w-1, 1, this.w-1, this.h-2, '|');		
	}
	
	public void line(int x1, int y1, int x2, int y2, char mchar) {		
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++) {
				canvasArray[i][j] = mchar;
			}
		}
  	} 
	
	public void rectangle(int x1, int y1, int x2, int y2, char mchar) {
		line(x1,y1, x2, y1, mchar);
		line(x1,y1, x1, y2, mchar);
		line(x2,y1, x2, y2, mchar);
		line(x1,y2, x2, y2, mchar);
	}
	
	public char[][] getCanvasArray() {
		return canvasArray;
	}
	public void setCanvasArray(char[][] canvasArray) {
		this.canvasArray = canvasArray;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
}

public class CanvasApp {	
	static Canvas canvas;
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		String command = new String();
		while(!command.equals("Q")) {
			System.out.print("enter command:");
			command = scan.nextLine();
			draw(command);
		}
		System.out.println("Program Exited!");
		scan.close();
	}
	
	private static void draw(String command) {
		char ch = command.charAt(0);
		String[] cmd;
		switch(ch) {
			case 'C' :
				cmd = command.split(" ");
				canvas = new Canvas(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]));
				render(canvas);			
			break;
			case 'L' :
				cmd = command.split(" ");
				if(canvas == null){
					System.err.println("Draw a canvas first");
					return;
				}
				canvas.line(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X');
				render(canvas);
			break;
			case 'R' :
				cmd = command.split(" ");
				if(canvas == null){
					System.err.println("Draw a canvas first");
					return;
				}
				canvas.rectangle(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X');
				render(canvas);
			break;
		}		
	}
	
	private static void render(Canvas canvas) {		
		for(int i=0;i<canvas.getH();i++) {
			for(int j=0;j<canvas.getW();j++) {				 
				System.out.print(canvas.getCanvasArray()[i][j]);
			}
			System.out.println();
		}
	}
	
	
}
