public class N_Add extends Calc {
	double a;
	double b;
	
	void setValue(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	double calculate() {
		double c = a+b;
		return c;
	}
}
