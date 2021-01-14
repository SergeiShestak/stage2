package seagate;

public class ThreadProcessor extends Thread {

	Warehouse warehouse = GateManager.getWarehouse();
	
	public void run () {
		
		System.out.printf("Start work of gate: %s \n",Thread.currentThread().getId() );
		
		try {
			while(!(GateManager.getShipsList().isEmpty())){
				
		
			Ship ship =GateManager.getShipsList().poll();
			System.out.println("Taken ship is: " + ship +" on thread : "+ Thread.currentThread().getId());
			Thread.sleep(1000);
			warehouse.setOverallCapacity(ship);
			System.out.println("Quantity containers of warehouse is : " + Warehouse.getOverallCapacity());
		   
			
			}
			
		}catch(InterruptedException e){
			
			System.out.println("Thread has been interrupted");
			
		}
		
		System.out.printf("%s finished \n",Thread.currentThread().getId());
		
		
	}
	
}
