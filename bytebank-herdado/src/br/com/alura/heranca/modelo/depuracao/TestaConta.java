package br.com.alura.heranca.modelo.depuracao;


public class TestaConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SaldoInsuficienteException {
		Conta contaComum = new Conta(123, 111, 100.0);
		ContaCorrente cc = new ContaCorrente(124, 222, 200.0);
		ContaPoupanca cp = new ContaPoupanca(125, 333, 300.0);

		Cliente clientePF = new Cliente("Carlos Menezes", "123456789", "Programado");
		Cliente cPJ = new Cliente("Carlos Menezes", "123456789", "Programado");
		Cliente cPJ2 = new Cliente("Carlos Menezes", "123456789", "Programado");

		// System.out.println("Resultado Conta Comum: " + clientePF.getNome() + " " +
		// clientePF.getCpf() + " " + clientePF.getProfissao() + " " +
		// contaComum.getAgencia() + " " + contaComum.getNumero() + " " +
		// contaComum.getSaldo());
		System.out.println("Resultado Conta Corrente: " + cPJ.getNome() + " " + cPJ.getCpf() + " " + cPJ.getProfissao()
				+ " " + cc.getAgencia() + " " + cc.getNumero() + " " + cc.getSaldo());
		System.out.println("Resultado Conta Poupança: " + cPJ2.getNome() + " " + cPJ2.getCpf() + " "
				+ cPJ2.getProfissao() + " " + cp.getAgencia() + " " + cp.getNumero() + " " + cp.getSaldo());

		// Transferencia contaComum

		// cc.deposita(50);
		// System.out.println("Transferencia: " + cc.getSaldo());
		cp.saca(50);
		System.out.println("Saldo cp: " + cp.getSaldo());

		cc.transfere(50.0, cp);
		System.out.println("Saldo Tranferencia cc: " + cc.getSaldo());
		System.out.println("Saldo cp: " + cp.getSaldo());
	}

}
