public class TV {
	String company;
	int year;
	int inch;
	
	TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.print(company + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}

	public static void main(String[] args) {
	TV myTV = new TV("LG", 2017, 32);
	myTV.show();
	}
}