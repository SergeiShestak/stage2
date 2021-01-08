
package seagate;

public class Ship {
	
	private String name;
	private int capacity;
	State state;
	
	
	public Ship(String name,int capacity,State state) {
		
		this.name = name;
		this.capacity = capacity;
		this.state = state;
		
	}
	
	public Ship() {
	}

	public void upload() {
		
		for(int i=capacity;i>0;i--) {
			
		}
	}
	
	public State getState() {
		
		return this.state;
	}

	public int getCapacity() {
		
		return this.capacity;
	}
	
	public int setCapacity(int capacity) {
		
		return this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		
		 return "Ship: \"" + name +"\"" + " capacity: " + capacity + " state: " + state + "\n";
	}


}
