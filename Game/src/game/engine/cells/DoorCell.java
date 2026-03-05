package game.engine.cells;

//Represents doors where monsters collect or lose energy depending on role.

import game.engine.Role;

public class DoorCell extends Cell{
	
	private Role role;
	private int energy=0;
	private boolean activated=false;
	
	
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public Role getRole() {
		return role;
	}
	public int getEnergy() {
		return energy;
	}
	public DoorCell(String name, Role role, int energy, boolean activated) {
		super(name);
		this.role = role;
		this.energy = energy;
		this.activated = activated;
	}
	
	
	

}
