package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormata() {
		String formato = "\"%d/%d/%d\"";
		return String.format(formato, dia,mes,ano);
	}
	
}
