import java.util.Scanner;

public class NewTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean condition = false;
		int a = 0;
		while (!condition) {
			try {
				System.out.print("Nhap vao so: ");
				a = sc.nextInt();
				condition = true;
			} catch (Exception e) {
				System.out.println("Nhap vao khong hop le");
				sc.nextLine();
			}
		}
		System.out.println("a = " + a);
	}
}