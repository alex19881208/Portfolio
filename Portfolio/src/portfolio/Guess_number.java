package portfolio;

import java.util.Random;
import java.util.Scanner;

public class Guess_number {
	//猜數字遊戲
	public static void main(String[] args) {
		Random random = new Random();
		int luckyNumber = random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("請輸入一個數字進行猜數字遊戲:");
			int quessData = scanner.nextInt();
			if (quessData < luckyNumber) {
				System.out.println("您輸入的數字為: " + quessData +" 很可惜，猜太小了~");
			} else if (quessData > luckyNumber){
				System.out.println("您輸入的數字為: " + quessData +" 很可惜，猜太大了~");
			}else {
				System.out.println("您猜中了!答案是: " + luckyNumber);
				break;
			}
		}

	}

}
