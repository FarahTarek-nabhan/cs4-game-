package game.engine;

public final class Constants {
	
	//Board constants:
	final int BOARD_SIZE = 100;
	final int BOARD_ROWS = 10;
	final int BOARD_COLS = 10;
	final int WINNING_POSITION = 99;
	final int STARTING_POSITION = 0;
	
	//Special cells positions constants:
	final int[] MONSTER_CELL_INDICES = {2, 18, 34, 54, 82, 88};
	final int[] CONVEYOR_CELL_INDICES = {6, 22, 44, 52, 66};
	final int[] SOCK_CELL_INDICES = {32, 42, 74, 84, 98};
	final int[] CARD_CELL_INDICES = {4, 12, 28, 36, 48, 56, 60, 76, 86, 90};
	
	//Energy constants:
	final int WINNING_ENERGY = 1000;
	final int MIN_ENERGY = 0;
	
	// Monster constants:
	final int MULTITASKER_BONUS = 200;
	final int SCHEMER_STEAL = 10;
	
	//Cell constants:
	final int SLIP_PENALTY = 100;
	
	//Power constants:
	final int POWERUP_COST = 500;
	
	

}
