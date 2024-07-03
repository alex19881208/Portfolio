package portfolio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bmi {
	
	private static final DecimalFormat DF = new DecimalFormat("0.00");

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入你的體重(公斤): ");
		double weight = scanner.nextDouble();
		
		System.out.print("請輸入你的身高(公分): ");
		double height = scanner.nextDouble() / 100;
		
		double bmi = Double.parseDouble(DF.format(weight / (height * height )));
		
		System.out.println("你的BMI數值為:" + bmi);
		
		if(bmi < 18.5) {
			System.out.println("過輕");
		}else if(bmi < 24) {
			System.out.println("正常");
		}else if(bmi < 38) {
			System.out.println("微胖");
		}else {
			System.out.println("過胖");
		}
		
	}

}
