package tetris.tetromino

import java.util.Random

class TetrominoFactory {
	
	companion object
	{
		val startingPosition = Pair(4, 4)
		
		fun getRandomTetromino() : Tetromino
		{
			var randomNumber : Int = (0..Shape.values().size).random()
			println(randomNumber)
			var tetromino = Tetromino(startingPosition, Shape.values().get(randomNumber))
			
			return tetromino
		}

		fun ClosedRange<Int>.random() = Random().nextInt(endInclusive - start) + start
	}
}