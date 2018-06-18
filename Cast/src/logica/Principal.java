package logica;

public class Principal {

	public static void main(String[] args) {
		float f = 0.0f;
		int i = (int) f;
		String s = String.valueOf(i);
		i = Integer.parseInt(s);
		f = (float) i;
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);

	}

}
