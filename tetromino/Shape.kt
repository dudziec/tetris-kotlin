package tetris.tetromino

import java.awt.Color

enum class Shape(color: Color, coordinates : List<Pair<Int, Int>>){
	Square(Color.RED, listOf(Pair(0,0), Pair(1,0), Pair(0, 1), Pair(1, 1))),
	RightLShape(Color.BLUE, listOf(Pair(0,0), Pair(1,0), Pair(0, 1), Pair(0, 2))),
	ZShape(Color.ORANGE, listOf(Pair(0,1), Pair(1,1), Pair(1, 0), Pair(2, 0))),
	SShape(Color.CYAN, listOf(Pair(0, 0), Pair(1,0), Pair(1, 1), Pair(2, 1))),
	LineShape(Color.GREEN, listOf(Pair(0,0), Pair(0,1), Pair(0, 2), Pair(0, 3))),
	LeftLShape(Color.ORANGE, listOf(Pair(0,0), Pair(1,0), Pair(1, 1), Pair(1, 2)));
	
	
	val color = color
	val coordinates = coordinates
	
}