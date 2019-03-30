package MyMath;

public class MathTest {
	public static void main(String[] args) {
			System.out.println("Math Test");
			
			Calculator cal = new Calculator();
			
			int x = 100;
			int y = 200;
			
			cal.Add(x, y);
			cal.Multiply(x, y);
			
		}
}