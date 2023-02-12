package banco;

public class Conta {

	String numero;
	Pessoa titular;
	Data criacao;
	double saldo;
	Gerente ger;

	public Conta(String numero, Pessoa titular, Data criacao, Gerente ger) {
		this.numero = numero;
		this.titular = titular;
		this.criacao = criacao;
		saldo = 0;
		this.ger = ger;
	}

	void depositar(double valor) {
		saldo += valor;
	}

}
