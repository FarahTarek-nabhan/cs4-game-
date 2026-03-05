package game.engine.cards;
import game.engine.interfaces.CanisterModifier;
import game.engine.monsters.Monster;
public class EnergyStealCard extends Cards implements CanisterModifier {
	
	private int energy;
	public EnergyStealCard(String name, String description, int rarity,int energy){
		super(name,description,rarity,true);
		this.energy=energy;

}
	@Override
	public void ModifymonsterE(Monster monster){	
		int newTotal = monster.getEnergy() + this.energy; // monster energy + card energy 
		monster.setEnergy(newTotal);//  handing this total to the monster and inside this method it makes sure to never be negative and never be more than the max in constants
	 // also to use this setEnergy from monster package we imported it }
	public int getEnergy(){
		return energy;
	}
}
