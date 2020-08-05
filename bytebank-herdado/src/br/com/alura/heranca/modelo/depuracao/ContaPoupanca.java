package br.com.alura.heranca.modelo.depuracao;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
	}

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		double valor2 = valor + 0.2;
		this.saldo -= valor2;
	}
}
