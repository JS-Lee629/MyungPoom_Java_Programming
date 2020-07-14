public class Phone {

	public String name;
	public String tel;
	
	public Phone(String name, String tel) { 
		this.name = name; 
		this.tel = tel;
	}
	
	public void show() {
		System.out.println(name + "의 번호는 " + tel + " 입니다.");
	}
	
}
