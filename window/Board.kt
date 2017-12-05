package tetris.window

import javax.swing.JPanel
import java.awt.Graphics
import tetris.tetromino.TetrominoFactory
import tetris.tetromino.Tetromino
import java.awt.event.ActionListener
import java.awt.event.ActionEvent

class Board : JPanel, ActionListener {



	var fields : MutableList<MutableList<Field>> = arrayListOf()
	
	constructor() : super() {
		setSize(Board.width * Field.sizeInPixels, Board.height * Field.sizeInPixels)
		setFields()
		var currentTetromino = TetrominoFactory.getRandomTetromino()
		occupyFields(currentTetromino)
		currentTetromino.draw()
		repaint()
	}
	
	companion object {
		const val width : Int = 20
		const val height : Int = 30
	}
	
	fun occupyFields(tetromino : Tetromino)
	{
		for(coordinate in tetromino.shape.coordinates)
		{
			var x : Int = coordinate.first
			var y : Int = coordinate.second
			println("x = $x y = $y")
			tetromino.occupiedFields.add(fields.get(y).get(x))
		}
		print(tetromino.occupiedFields.size)
	}
	
	fun setFields()
	{
		for(y in 0..height)
		{
			var temp : MutableList<Field> = arrayListOf()
			for(x in 0..width)
			{
				var field = Field(x, y)
				temp.add(field)
			}
			fields.add(temp)
		}
	}
	
	fun repaintFields(g : Graphics?)
	{
		for(x in fields)
		{
			for(field in x)
			{
				if(field.occupied)
				{
					field.paint(g)
				}
			}
		}
	}
	
	override fun paintComponent(g: Graphics?) {
		super.paintComponents(g)
		repaintFields(g)
	}
	
	override fun actionPerformed(e: ActionEvent?) {
		
	}
	
	
}