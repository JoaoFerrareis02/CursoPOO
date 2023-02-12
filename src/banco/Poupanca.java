package banco;

public class Poupanca extends Conta {

	public Poupanca(String numero, Pessoa titular, Data criacao, Gerente ger) {
		super(numero, titular, criacao, ger);
	}

	double disponivel() {
		return saldo;
	}

	void extrato() {
		System.out.println("***EXTRATO DA POUPANCA***");
		System.out.println("Conta: " + numero);
		System.out.println("Titular: " + titular.cpf);
		System.out.println("Saldo disponivel para saque: " + disponivel());
	}

	boolean sacar(double valor) {
		if (valor <= disponivel()) {
			saldo -= valor;
			System.out.println("Saque na poupanca " + numero + " realizado com sucesso. Novo saldo: " + saldo);
			return true;
		} else {
			System.out.println(
					"ERRO: Saque na conta " + numero + " nao foi realizado. Valor disponivel: " + disponivel());
			return false;
		}
	}

	void rendimentos(double juro) {
		if (0 < disponivel()) {
			saldo += (saldo * juro) / 100;
		}
	}

}
