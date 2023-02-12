package banco;

public class Data {

	int dia;
	int mes;
	int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	void imprimir() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}

	boolean maior(Data d2) {
		if ((ano > d2.ano) || ((ano == d2.ano) && (mes > d2.mes)) || ((ano == d2.ano) && (mes == d2.mes) && (dia > d2.dia))) {
			return true;
		} else {
			return false;
		}
	}

}
