package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPeice[][] getPieces() {
		ChessPeice[][] mat = new ChessPeice[board.getRow()][board.getColumns()];
		for (int i = 0; i < board.getRow(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPeice) board.piece(i, j);
			}
		}
		return mat;
	}
}
