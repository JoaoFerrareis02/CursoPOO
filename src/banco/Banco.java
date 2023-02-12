package banco;

public class Banco {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Maria", new Data(12, 11, 2009), 'F', "123.456.789-00");
		Pessoa p2 = new Pessoa("Joao", new Data(29, 07, 2002), 'M', "123.456.780-00");

		Conta c1 = new Conta("1234-5", p1);
		Conta c2 = new Conta("2345-6", p2);

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

		System.out.println("A idade do titular da conta " + c1.numero + " é de " + c1.titular.idade(new Data(12, 2, 2022)));
		System.out.println("A idade do titular da conta " + c2.numero + " é de " + c2.titular.idade(new Data(12, 2, 2022)));
		
	}

}
