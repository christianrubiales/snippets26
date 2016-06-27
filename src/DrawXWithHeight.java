
public class DrawXWithHeight {

	static void drawXWithHeight(int height) {
		if (height > 0) {
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < height; j++) {
					if (j == i || j == height - i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		for (int i = -1; i < 10; i++) {
			drawXWithHeight(i);
			System.out.println();
		}
	}
}
