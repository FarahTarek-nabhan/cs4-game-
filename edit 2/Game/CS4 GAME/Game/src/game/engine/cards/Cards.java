package game.engine.cards;

public abstract  class Cards {
	  private String name; //The card’s name.
	 private String description;// The card’s description.
	 private int rarity; //The card’s rarity level. Specifies the number of cards in the card pile
	 private boolean lucky;// Whether this is a lucky card or not according to the player.
	
	 
	public Cards(String name, String description , int rarity, boolean lucky){
		this.setName(name);
		this.setDescription(description);
		this.setRarity(rarity);
		this.setLucky(lucky);
	}


	public boolean isLucky() {
		return lucky;
	}


	public int getRarity() {
		return rarity;
	}


	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}
	


	 
	

}
