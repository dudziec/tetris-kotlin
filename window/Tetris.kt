package tetris.window

import javax.swing.JFrame

class Tetris : JFrame {
	
	constructor() : super() {
		var board : Board = Board()
		add(board)
		setSize(Board.width * Field.sizeInPixels, Board.height * Field.sizeInPixels)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		setVisible(true)
		show()
	}

}