package br.com.cod3r.cm;

public class Main {
	public static void main(String[] args) {
		System.out.println(Planet.MERCURY.equals(Planet.MERCURY));
		System.out.println(Planet.MERCURY == Planet.MERCURY);
		System.out.println(Planet.MERCURY == Planet.VENUS);
		var p = 2 >> 1;
		System.out.println(p);
		String hello = "      Hello World    ";
		System.out.println(hello.trim());
	}
}
