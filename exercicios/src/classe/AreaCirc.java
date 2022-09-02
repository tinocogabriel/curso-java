package classe;

public class AreaCirc {
	
	double raio;
	static final double pi = Math.PI;
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return Math.pow(raio, 2) *pi;
	}

}
