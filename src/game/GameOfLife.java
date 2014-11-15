package game;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {
	private int size ;
	private List<Position> positions;
	private int [] [] board; 
	
	public GameOfLife(List<Position> positions, int size){
		this.size = size;
		this.positions= positions;
	}
	
	public void tick() {
		int[][] newBoard = new int[size][size];
		for(int x =0; x < board.length; x++){
			for(int y = 0; y < board.length; y++ ){
				int alive = getRight(x+1,y);
			}
		} 
	}
	
	public int[][] smear(){
		board = new int[size][size];
		for (Position position : positions)
			board[position.getX()][position.getY()] = 1;
		
		return board;
	}

	public int[][] getNeighbourhood(Position posA) {
		// TODO Auto-generated method stub
		int curX = posA.getX();
		int curY = posA.getY();
		
		
		return null;
	}
	
	private int getTopLeft(int curX, int curY){
		int x;
		if(curX == 0){
			x = board.length-1;
		} else {
			x = curX -1;
		}
		int y;
		if(curY == 0){
			y = board.length-1;
		} else {
			y = curY - 1;
		}
		
		return board[x][y];
	}
	
	private int getTop(int curX, int curY){
		int x= curX;
		
		int y;
		if(curY == 0){
			y = board.length-1;
		} else {
			y = curY - 1;
		}
		
		return board[x][y];
	}
	
	private int getTopRight(int curX, int curY){
		int x;
		if(curX == board.length -1){
			x = 0;
		} else {
			x = curX + 1;
		}
		int y;
		if(curY == board.length-1){
			y = 0;
		} else {
			y = curY + 1;
		}
		
		return board[x][y];
	}
	
	private int getLeft(int curX, int curY){
		int x;
		if(curX == 0){
			x = board.length-1;
		} else {
			x = curX - 1;
		}
		int y = curY;
		
		
		return board[x][y];
	}
	
	private int getRight(int curX, int curY){
		int y;
		if(curY == board.length-1){
			y = 0;
		} else {
			y = curY + 1;
		}
		int x = curX;
		
		return board[x][y];
	}
	
	private int getBottomLeft(int curX, int curY){
		int x;
		if(curX == 0){
			x = board.length-1;
		} else {
			x = curX - 1;
		}
		int y;
		if(curY == board.length-1){
			y = 0;
		} else {
			y = curY + 1;
		}
		
		return board[x][y];
	}
	
	private int getBottomRight(int curX, int curY){
		int x = curX;
		int y;
		if(curY == board.length-1){
			y = 0;
		} else {
			y = curY + 1;
		}
		
		return board[x][y];
	}
}
