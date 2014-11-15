import game.GameOfLife;
import game.Position;

import java.util.ArrayList;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Position> positions = new ArrayList<Position>();
			
			for(int p =0 ; p < 10; p++){
				Random r = new Random();
				int x = r.nextInt(9);
				int y = r.nextInt(9);
				Position pos = new Position(x,y);
				positions.add(pos);
			}
		
			GameOfLife gameOfLife = new GameOfLife(positions, 10);
			
			for(int i =0 ; i < 10; i++){
				System.out.println("Iteration Count " + i);
				int [][] board = gameOfLife.smear();
				
				for(int x =0; x < board.length; x++){
					for(int y = 0; y < board.length; y++ ){
						System.out.print(board[x][y]);
					}
					System.out.println("");
				}
				System.out.println("Iteration End " + i);
			}
			
	}

}
