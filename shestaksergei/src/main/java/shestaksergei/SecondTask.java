package shestaksergei;

import java.util.Scanner;

public class SecondTask {
	
	public static void main(String[]args) {
		
		String defaultName = "Вячеслав";
		String name;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите Ваше имя");
		name = scanner.nextLine();
		if(name.equalsIgnoreCase(defaultName)){
			System.out.println("Привет, Вячеслав");
		}else {
			System.out.println("Нет такого имени");
		}
		scanner.close();
	}

}
