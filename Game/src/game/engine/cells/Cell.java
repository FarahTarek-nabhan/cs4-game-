package game.engine.cells;

// A class representing the cells on the game board that a monster can land on

import game.engine.monsters.Monster;

public class Cell {
	
	private String name;
	private  Monster monster;
	
	
	public Monster getMonster() {
		return monster;
	}
	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	public String getName() {
		return name;
	}
	
	public Cell(String name)
	{
		this.setMonster(null);
	}

}
