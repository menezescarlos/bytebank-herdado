package br.com.alura.heranca.modelo.depuracao;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
	}
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
	    double valorASacar = valor + 0.2;
	    super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.1;
	}
}
