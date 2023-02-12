package banco;

public class Banco {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Jefferson", new Data(20,8, 1991), 'M', "142.356.789-12", "jef@123", "HA123");
		
		Pessoa p1 = new Pessoa("Joao", new Data(12, 11, 2002), 'M', "123.456.789-00");
		
		ContaCorrente cr1 = new ContaCorrente("1234-5", p1, new Data(22, 5, 2020), g1);
		
		Poupanca pl1 = new Poupanca("Joao", p1, new Data(10, 5, 2022), g1);
		
		
		
		
	}

}
