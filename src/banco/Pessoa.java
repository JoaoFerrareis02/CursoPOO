package banco;

public class Pessoa {

	String nome;
	Data dtNasc;
	char sexo;
	String cpf;

	public Pessoa(String nome, Data dtNasc, char sexo, String cpf) {
		this.nome = nome;
		this.dtNasc = dtNasc;
		this.sexo = sexo;
		this.cpf = cpf;
	}
	
	int idade(Data hoje) {
		int idade = hoje.ano - dtNasc.ano;
		if((dtNasc.mes < hoje.mes)||(dtNasc.mes == hoje.mes && dtNasc.dia < hoje.dia)) {
			idade --;
		}
		return idade;
	}

}
