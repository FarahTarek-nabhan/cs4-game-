package game.engine.card;

public class ConfusionCard extends Cards {
	private int duration;
public ConfusionCard(String name, String description, int rarity, int duration){
	super(name,description,rarity,false);
	this.duration=duration;
}
public int getDuration(){
	return duration;
}
//there will be a method that does the logic here
}
