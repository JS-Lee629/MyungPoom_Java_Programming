public class Day {

	public String work;
	public void set(String work) { this.work = work;}
	public String get() { return work; }
	public void show() {
		if (work == null) System.out.println("없습니다.");
		else System.out.println(this.work + "입니다.");
	}
	
}
