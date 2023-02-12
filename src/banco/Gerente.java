package banco;

public class Gerente extends Pessoa {

	String matricula;
	String senha;

	public Gerente(String nome, Data dtNasc, char sexo, String cpf, String matricula, String senha) {
		super(nome, dtNasc, sexo, cpf);
		this.matricula = matricula;
		this.senha = senha;
	}

	boolean validarAcesso(String s) {
		if (s == senha) {
			return true;
		} else {
			return false;
		}
	}

}
