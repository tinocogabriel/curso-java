package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();

		usuarios.put(1, "Roberto");
		//Nesse cenário o valor Roberto será substituido por Ricardo, pois
		//nesse caso estamos sobreescrevendo o código 1. 
		usuarios.put(1, "Ricardo");
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Rebeca");
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Jorge"));
		
		System.out.println(usuarios.get(4));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey() + " ----- " + registro.getValue() );
		}
	}
}
