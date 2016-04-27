package gitTest2;

public class Bla {
	private String a;
	private String b;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Bla [a=" + a + ", b=" + b + "]";
	}

	public Bla(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

}
