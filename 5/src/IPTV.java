public class IPTV extends ColorTV{
	
	String IPaddress;
	public IPTV(String IPaddress, int size, int color) {
		super(size, color);
		this.IPaddress = IPaddress;
	}
	protected String getIPaddress() { return IPaddress; }
	void printProperty() {
		System.out.print("���� IPTV�� " + getIPaddress() + " �ּ��� " 
						+ getSize() + "��ġ " + getColor() + "�÷�");
	}
	public static void main (String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
