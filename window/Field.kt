package tetris.window

import java.awt.Color
import java.awt.Graphics
import tetris.tetromino.Shape

class Field(x : Int, y : Int) {
	
	val x = x
	val y = y
	var color : Color? = null
	var occupied = false
	
	companion object {
		const val sizeInPixels : Int = 20
	}
	
	fun paint(g: Graphics?)
	{
		g?.setColor(color)
		g?.fillRect(x * Field.sizeInPixels, y* Field.sizeInPixels, Field.sizeInPixels, Field.sizeInPixels)
		g?.setColor(color?.darker())
		g?.drawRect(x* Field.sizeInPixels, y* Field.sizeInPixels, Field.sizeInPixels, Field.sizeInPixels)
	}
	
}