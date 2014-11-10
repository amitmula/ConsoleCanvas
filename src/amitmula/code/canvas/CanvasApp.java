package amitmula.code.canvas;

import java.util.Scanner;

class Canvas {
	char[][] canvasArray;
	int w, h;
	public Canvas(int w, int h) {
		h+=2;
		this.w = w;
		this.h = h;
		canvasArray = new char[h][w];
		for(int i=0;i<this.h;i++) {			
			for(int j=0;j<this.w;j++) {				
				if(i==0 || i==this.h-1){
					canvasArray[i][j] = '-';
				}else{
					if(j==0 || j==this.w-1) {
						canvasArray[i][j] = '|';
					}
				}
			}
		}
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
				line(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]));
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
	
	private static void line(int x1, int y1, int x2, int y2) {		
		if(x2>=canvas.getW() || y2 >= canvas.getH()) {
			
		}
		for(int i=x1; i<x2; i++) {
			for(int j=y1; j<=y2; j++) {
				canvas.getCanvasArray()[j][i] = 'X';
			}
		}
		render(canvas);
		//System.out.print("X");
	   /* for (int i = 1 ; i < w-1 ; ++i)
	    	System.out.print(mids);
	    System.out.print(ends);*/
	} 
}
