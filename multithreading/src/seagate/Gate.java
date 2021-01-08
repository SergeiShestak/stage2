package seagate;

import java.util.Queue;

public class Gate {
	
	private State state;
	private Queue<Ship>	shipsList;
	
	public Gate(int Id,State state) {
		this.state = state;
	}
	
	
	public State getState() {
		
		return this.state;
	}
	
	public void takeShip() {
		
		for(Ship ship:shipsList) {
			if(ship !=null) {
			
			}
		}
	}
	

}
