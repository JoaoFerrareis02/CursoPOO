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

}
