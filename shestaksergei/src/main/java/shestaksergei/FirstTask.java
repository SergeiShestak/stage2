package shestaksergei;

import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Пожалуйста введите целое число: ");
		int number = scanner.nextInt();
		if(number > 7 ) {
			System.out.println("Привет");
		

	}else {System.out.println("Не то, но все равно Привет");

}
		scanner.close();
	}
}
