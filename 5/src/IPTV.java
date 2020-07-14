public class IPTV extends ColorTV{
	
	String IPaddress;
	public IPTV(String IPaddress, int size, int color) {
		super(size, color);
		this.IPaddress = IPaddress;
	}
	protected String getIPaddress() { return IPaddress; }
	void printProperty() {
		System.out.print("나의 IPTV는 " + getIPaddress() + " 주소의 " 
						+ getSize() + "인치 " + getColor() + "컬러");
	}
	public static void main (String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
