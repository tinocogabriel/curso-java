package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		//Implicita
		double a = 1;
		System.out.println(a);
		
		//Explicita com uso de Cast
		float b = (float) 1.0;
		System.out.println(b);
		
		int c = 4;
		//Explicita com uso de Cast
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999;
		//Explicita com uso de Cast
		int f = (int) e; 
		System.out.println(f);
	}
}
