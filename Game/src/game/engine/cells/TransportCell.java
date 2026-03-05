package game.engine.cells;

//Represent cells that transport monsters.

public abstract class TransportCell extends Cell{
	
	//(positive for forward, negative for backward)
	private int effect=0;

	public int getEffect() {
		return effect;
	}

	public TransportCell(String name, int effect) {
		super(name);
		this.effect = effect;
	}
	
	
	
}
