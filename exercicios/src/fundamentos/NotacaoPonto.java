package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Bom dia X";

		s = s.replace("X", "Senhora");

		s = s.toUpperCase();

		s = s.concat("!!!!");

		System.out.println(s);

		System.out.println("Gabriel".toString());

		String x = "Gabriel".toUpperCase();

		System.out.println(x);

		String y = "Com dia X".replace("X", "Gabriel").toUpperCase();
		
		System.out.println(y);
	}
}
