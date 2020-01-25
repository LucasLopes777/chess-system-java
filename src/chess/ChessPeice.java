package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPeice extends Piece {

	private Color color;

	public ChessPeice(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	
	
}
