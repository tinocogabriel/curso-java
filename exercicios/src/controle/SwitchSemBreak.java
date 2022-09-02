package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "preta";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("sei o Bassai-dai...");
		case "marrom":
			System.out.println("sei o Tekki Shodan...");
		case "roxa":
			System.out.println("sei o Heian Godan...");
		case "verde":
			System.out.println("sei o Heian Godan...");
		case "laranja":
			System.out.println("sei o Heian Godan...");
		case "vermelha":
			System.out.println("sei o Heian Godan...");
		case "amarela":
			System.out.println("sei o Heian Godan...");
			break;	
		default:
			System.out.println("sei o Heian Godan...");
		}
	}
}
