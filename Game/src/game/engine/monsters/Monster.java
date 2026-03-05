package game.engine.monsters;
import game.engine.Role;

public abstract class Monster {
	
	private String name; //read
	private String description; //read
	private Role role; //enum representing role(scarer or laugher)
	private Role originalRole; //read, og role
	private int energy;
	private int position;
	private boolean frozen;
	private boolean shielded;
	private int confusionTurns;
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description; 
	}
	
	public Role getOriginalRole() {
		return originalRole; 
	}
	
	public Monster(String name, String description, Role originalRole, int energy) {
		this.name = name ;
		this.description = description ;
		this.originalRole = originalRole ;
		this.energy = energy ;
		role = originalRole ;
		position = 0 ;
		confusionTurns = 0 ;
		frozen = false ;
		shielded = false ;
	}
	
	public int compareTo(Monster o) {
		return Integer.compare(this.position, o.position) ;
	}
	
}
