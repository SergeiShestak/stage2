package seagate;

public class Warehouse {
	
	private static int overallCapacity;
	
	public Warehouse(int overallCapacity) {
		
		Warehouse.overallCapacity = overallCapacity;
		
	}
	
	public Warehouse() {
	
		return;
	}

	public static int getOverallCapacity() {
	
		return overallCapacity;
	}
	
	public int setOverallCapacity(Ship ship) {
		
	  return Warehouse.overallCapacity = (ship.getState().equals(State.LOADED))?overallCapacity + ship.getCapacity() : overallCapacity - ship.getCapacity();
		
	}
	
	public int setOverallCapacity(int overallCapacity) {
		
		return Warehouse.overallCapacity = overallCapacity;
	}
}
