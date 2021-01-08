package seagate;

public class ThreadProcessor extends Thread {

	Warehouse warehouse = new Warehouse(30000);
	
	public void run () {
		
		System.out.printf("Start work of gate: %s \n",Thread.currentThread().getId() );
		
		try {
			while(!(GateManager.shipsList.isEmpty())){
				
		
			Ship ship =GateManager.shipsList.poll();
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
