import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the height of the pyramid : ");
		drawPyramid(scanner.nextInt());
		
	}
	
	public static void drawPyramid(int row) {
		
		for(int i=1; i<=row/2+1;i++) {
			for(int j=i; j<=row/2;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<row-(row-2*i);k++) {
				System.out.print("*");
			}
			for(int j=i; j<=row/2;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=row/2; i>=1;i--) {
			for(int j=i; j<=row/2;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<row-(row-2*i);k++) {
				System.out.print("*");
			}
			for(int j=i; j<=row/2;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
