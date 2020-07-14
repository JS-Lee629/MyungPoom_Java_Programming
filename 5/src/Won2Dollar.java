public class Won2Dollar extends Converter{
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		String conv_from = "¿ø";
		return conv_from;
	}
	protected String getDestString() {
		String conv_to = "´Þ·¯";
		return conv_to;
	}
	protected double ratio; 
	public Won2Dollar(double ratio) {
		super();
		this.ratio = ratio;
	}
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}
