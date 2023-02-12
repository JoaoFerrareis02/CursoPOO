package banco;

public class Conta {

	String numero;
	Pessoa titular;
	double saldo;
	double limite;

	double disponivel() {
		return saldo + limite;
	}

	void extrato() {
		System.out.println("***EXTRATO DA CONTA***");
		System.out.println("Conta: " + numero);
		System.out.println("Titular: " + titular.cpf);
		System.out.println("Saldo disponivel para saque: " + disponivel());
	}

	void depositar(double valor) {
		saldo += valor;
	}

	boolean sacar(double valor) {
		if (valor <= disponivel()) {
			saldo -= valor;
			System.out.println("Saque na conta " + numero + " realizado com sucesso. Novo saldo: " + saldo);
			return true;
		} else {
			System.out.println("ERRO: Saque na conta " + numero + " nao foi realizado. Valor disponivel: " + disponivel());
			return false;
		}
	}

	boolean transferir(double valor, Conta destino) {
		if (sacar(valor)) {
			destino.depositar(valor);
			System.out.println("Transferencia de " + valor + " da conta " + numero + " para a conta " + destino.numero + " foi realizado com sucesso.");
			return true;
		} else {
			System.out.println("ERRO: Nao foi possivel transferir " + valor + " da conta " + numero + " para a conta " + destino.numero + ". Valor disponivel: " + disponivel());
			return false;
		}
	}

	void chequeEspecial(double juros) {
		if (saldo < 0) {
			saldo += (saldo * juros) / 100;
		}
	}

}
