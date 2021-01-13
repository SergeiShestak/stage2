package shestaksergei;

import java.util.Random;

public class Thirdtask {

	public static void main(String[] args) {
		
		int [] arrayOfNumber = new int [20];
		Random random = new Random();
		System.out.print("Исходный массив: ");
		for(int i=0;i < arrayOfNumber.length;i++) {
			
			arrayOfNumber[i] = random.nextInt(10);
			
			System.out.print( arrayOfNumber[i] + ",");
		}
		
		
		System.out.printf("\n Массив чисел кратных 3: ");
		for(int result:arrayOfNumber) {
			
			 if(result!=0&&result%3== 0)
				 
			 System.out.print( result + ",");
		}

	}

}
