package seagate;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class GateManager {
	
	
	private static BlockingQueue <Ship> shipsList;  
	
	private static Warehouse warehouse = new Warehouse();
	
	public static BlockingQueue<Ship> getShipsList(){
		
		return shipsList;
	}
	
	
	public static Warehouse getWarehouse() {
		return warehouse;
	}
	
	public synchronized static void main (String[]args) {
		
		shipsList = new LinkedBlockingQueue<>();
		
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
		e.printStackTrace();
		}
		try {
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			thr3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		executors.shutdown();
		
	}

}

