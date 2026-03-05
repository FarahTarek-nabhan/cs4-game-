package game.engine.cards;
import game.engine.monsters.Monster;
public class StartOverCard extends Cards {
	public StartOverCard (String name, String description, int rarity, boolean lucky){
		super(name,description,rarity,lucky);
		 
		
public void reset(Monster monster) {
			monster.setPosition(0); // start over cards that resets position
			}
	

}
