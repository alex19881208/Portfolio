package portfolio;

public class ForForDemo {
	//印出菱形
	public static void main(String[] args) {
		int a = 5;
		for(int i = 0 ; i < a ; i++) {
			for(int j = 4 ; j > i ; j--) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i * 2 + 1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int b = 4;
		for(int i = 0 ; i < b ; i++) {
			for(int j = 0 ; j < i + 1 ; j++) {
				System.out.print(" ");
			}
			for(int k = 7 ; k >= i * 2 + 1 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
