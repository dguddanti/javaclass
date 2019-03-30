package MyMath;

public class Calculator {

	private ArithmaticCalc arith;
	
	private Geometric geo;
	
	
	public Calculator() {
		arith = new ArithmaticCalc();
		geo = new Geometric();
	}
	
	
	public int Add(int x, int y) {
		return arith.Addition(x, y);
	}
	
	
	public int Multiply(int x, int y) {
		return geo.Multiply(x, y);
	}	
}
