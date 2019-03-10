package games;

public class vbvraag {
	public static void main(String[] args) {
		int d = 6;
		int p = 3;
		int b = 9;

		b = d-- / d++ * p / --d * b;
		System.out.println(d-- * ++d);

		b = b / b * d++ - --b / p;
		System.out.println(d = b * p);

	}
}
