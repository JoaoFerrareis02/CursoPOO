package banco;

public class ContaCorrente extends Conta {

	double limite;

	public ContaCorrente(String numero, Pessoa titular, Data criacao, Gerente ger) {
		super(numero, titular, criacao, ger);
		limite = 200;
	}

	double disponivel() {
		return saldo + limite;
	}

	void extrato() {
		System.out.println("***EXTRATO DA CONTA CORRENTE***");
		System.out.println("Conta: " + numero);
		System.out.println("Titular: " + titular.cpf);
		System.out.println("Saldo disponivel para saque: " + disponivel());
	}

	boolean sacar(double valor) {
		if (valor <= disponivel()) {
			saldo -= valor;
			System.out.println("Saque na conta corrente " + numero + " realizado com sucesso. Novo saldo: " + saldo);
			return true;
		} else {
			System.out.println("ERRO: Saque na conta corrente " + numero + " nao foi realizado. Valor disponivel: " + disponivel());
			return false;
		}
	}

	void chequeEspecial(double juros) {
		if (saldo < 0) {
			saldo += (saldo * juros) / 100;
		}
	}

}
