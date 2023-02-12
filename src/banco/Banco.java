package banco;

public class Banco {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		p1.nome = "Maria";
		p1.idade = 18;
		p1.sexo = 'F';
		p1.cpf = "123.456.789-00";

		Pessoa p2 = new Pessoa();
		p2.nome = "Joao";
		p2.idade = 22;
		p2.sexo = 'M';
		p2.cpf = "123.456.780-00";

		Conta c1 = new Conta();
		c1.numero = "1234-5";
		c1.titular = p1;
		c1.saldo = 100.0;
		c1.limite = 200.0;

		Conta c2 = new Conta();
		c2.numero = "2345-6";
		c2.titular = p2;
		c2.saldo = 150.0;
		c2.limite = 200.0;

		c1.extrato();
		c2.extrato();

		c1.sacar(150);
		c1.transferir(100, c2);
		c1.sacar(100);
		c1.depositar(100);
		c1.transferir(200, c2);

		for (int i = 1; i <= 120; i++) {
			c1.chequeEspecial(0.5);
			if (i % 30 == 0) {
				System.out.println("Saldo apos " + i + " dia: " + c1.saldo);
			}
		}

	}

}
