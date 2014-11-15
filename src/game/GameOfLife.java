package game;

import java.util.List;

public class GameOfLife {
	private int size ;
	private List<Position> positions;
	
	public GameOfLife(List<Position> positions, int size){
		this.size = size;
		this.positions= positions;
	}
	
	public int[][] Smear(){
		int [] [] board = new int[size][size];
		for (Position position : positions)
			board[position.getX()][position.getY()] = 1;
		
		return board;
	}

	public int[][] getNeighbourhood(Position posA) {
		// TODO Auto-generated method stub
		return null;
	}
}
