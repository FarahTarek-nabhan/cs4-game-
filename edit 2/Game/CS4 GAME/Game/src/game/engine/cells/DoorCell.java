package game.engine.cells;

//Represents doors where monsters collect or lose energy depending on role.

import game.engine.Role;

public class DoorCell extends Cell implements CanisterModifier{
	
	private Role role;
	private int energy=0;
	private boolean activated=false;
	
	public DoorCell(String name, Role role, int energy, boolean activated) {
		super(name);
		this.role = role;
		this.energy = energy;
		this.activated = activated;
	}
	
	public void ModifymonsterE(Monster monster){
		if(!isActiviated()){
		if(Monster.getRole()==this.getRole()){
			activated=true;
		}
		if(Monster.getRole()!=this.getRole()){
	              if(isShielded==true){
	            	  activated=false;
	              }
	              else{
	            	  activated=true;
	              }
		}
	}
	}
	
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
	 
	
	
	

}
