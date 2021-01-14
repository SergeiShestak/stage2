package seagate;

public class Warehouse {
	
	private static int overallCapacity = 30000;
	
	
	public Warehouse() {
	
		return;
	}

	public static int getOverallCapacity() {
	
		return overallCapacity;
	}
	
	public synchronized int setOverallCapacity(Ship ship) {
		
	  return Warehouse.overallCapacity = (ship.getState().equals(State.LOADED))?overallCapacity + ship.getCapacity() : overallCapacity - ship.getCapacity();
		
	}
	
}
