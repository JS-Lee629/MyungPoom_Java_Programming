public class km2mile extends Converter{
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		String conv_from = "km";
		return conv_from;
	}
	protected String getDestString() {
		String conv_to = "mile";
		return conv_to;
	}
	protected double ratio; 
	public km2mile(double ratio) {
		super();
		this.ratio = ratio;
	}
	public static void main(String[] args) {
		km2mile tomile = new km2mile(1.6);
		tomile.run();
	}
}
