import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so bat ki: ");
		sc.nextInt();
		MyDate md = new MyDate(10, 5, 2023);
		MyDate md1 = new MyDate(9, 5, 2023);
		MyDate md2 = new MyDate(10, 5, 2023);
		md.PrintDay();
		md.PrintMonth();
		md.PrintYear();
		md.PrintDate();
		System.out.println(md);
		if(md.equals(md2)) System.out.println("2 ngay trung nhau");
		else System.out.println("2 ngay khong trung nhau");
	}
}
