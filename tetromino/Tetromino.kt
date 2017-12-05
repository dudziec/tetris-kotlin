package tetris.tetromino

import tetris.window.Field

class Tetromino(position : Pair<Int, Int>, shape : Shape) {
	
	val shape : Shape = shape
	var position : Pair<Int, Int> = position
	var occupiedFields : MutableList<Field> = arrayListOf()
	
	fun draw()
	{
		for(field in occupiedFields)
		{
			field.color = shape.color
			field.occupied = true
		}
	}
}