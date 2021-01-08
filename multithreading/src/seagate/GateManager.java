package seagate;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GateManager {
	
	
	static Queue <Ship> shipsList;  
	
	
	
	public Queue<Ship> getShipsList(LinkedList<Ship> shipsList){
		
		return GateManager.shipsList = shipsList;
		
	}
	
	
	
	public int downloadShip (Ship ship) {
		
		new Warehouse();
		int overallCapacity = Warehouse.getOverallCapacity() + ship.getCapacity();
		return overallCapacity; 
	}
	
	
	public synchronized static void main (String[]args) {
		
		shipsList = new LinkedList<>();
		
		shipsList.offer(new Ship("A",500,State.LOADED));
		shipsList.offer(new Ship("B",1000,State.FREE));
		shipsList.offer(new Ship("C",750,State.LOADED));
		
		shipsList.offer(new Ship("D",500,State.LOADED));
		
		shipsList.offer(new Ship("E",500,State.LOADED));
		shipsList.offer(new Ship("F",1000,State.FREE));
		shipsList.offer(new Ship("J",750,State.LOADED));
		
		shipsList.offer(new Ship("I",1000,State.FREE));
		shipsList.offer(new Ship("F",750,State.LOADED));
		
		shipsList.offer(new Ship("K",500,State.LOADED));
		shipsList.offer(new Ship("L",1000,State.FREE));
		shipsList.offer(new Ship("M",750,State.LOADED));
		
		
		
		
		ExecutorService executors = Executors.newFixedThreadPool(3);
		
		Thread thr1 = new ThreadProcessor();
		Thread thr2 = new ThreadProcessor();
		Thread thr3 = new ThreadProcessor();
		executors.submit(thr1);
		executors.submit(thr2);
		executors.submit(thr3);
		
		try {
		thr1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		try {
			thr2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			thr3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		executors.shutdown();
		
	}

}

