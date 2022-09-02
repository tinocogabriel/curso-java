package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro civic = new Civic();
		Ferrari ferrari = new Ferrari(300);
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.frear();
		
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		
		System.out.println("Civic => "+civic.toString());
		System.out.println("Ferrari => "+ferrari.toString());
		
	}
}
