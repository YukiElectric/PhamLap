import java.util.Objects;

public class MyDate {
	private int Day;
	private int Month;
	private int Year;

	public MyDate(int d, int m, int y) {
		this.Day = d;
		this.Month = m;
		this.Year = y;
	}

	public void PrintDay() {
		System.out.println("This day is: " + this.Day);
	}

	public void PrintMonth() {
		System.out.println("This month is: " + this.Month);
	}

	public void PrintYear() {
		System.out.println("This year is: " + this.Year);
	}

	public void PrintDate() {
		System.out.print("This date is: ");
		System.out.print(this.Day);
		System.out.print("-" + this.Month);
		System.out.print("-" + this.Year + "\n");
	}

	@Override
	public String toString() {
		return this.Day + "/" + this.Month + "/" + this.Year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Day, Month, Year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return this.Day == other.Day && this.Month == other.Month && this.Year == other.Year;
	}
	
}
