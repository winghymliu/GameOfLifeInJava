package tests;

import static org.junit.Assert.assertTrue;
import game.GameOfLife;
import game.Position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GameOfLifeTests {
	int size = 10;

	@Test
	public void TickReturnsEmptyBoardWithNoPositionss() {
		List<Position> positions = new ArrayList<Position>();
		GameOfLife game = new GameOfLife(positions, size);
		
		int[][] board = game.smear();
		
		for(int x =0; x < size; x++){
			for(int y = 0 ; y < size; y++){
				assertTrue( board[x][y] == 0);
			}
		}
		
	}
	
	@Test
	public void TickReturnsBoardWithOneLifeWithOnePosition(){
		Position posA = new Position(2,2);
		List<Position> positions = Arrays.asList(posA);
		
		GameOfLife game = new GameOfLife(positions, size);
		
		int[][] board = game.smear();
		
		for(int x =0; x < size; x++){
			for(int y = 0 ; y < size; y++){
				if(posA.getX() == x && posA.getY() == y){
					assertTrue( board[x][y] == 1);
				} else 
					assertTrue( board[x][y] == 0);
			}
		}
	}
	
	@Test
	public void findNeigboursOfPosition()
	{
		Position posA = new Position(4, 4);
		List<Position> positions = Arrays.asList(posA);
		GameOfLife game = new GameOfLife(positions, size);
		
		int[] [] board = game.smear();
		int[] [] neighbourhood = game.getNeighbourhood(posA);
		
		for (int i = posA.getX() -1; i <= posA.getX()+1; i ++){
			for (int j = posA.getY()-1; j <= posA.getY()+1; j++){
				assertTrue(neighbourhood[i][j] == board[i][j] );
			}
				
		}
	}
}
