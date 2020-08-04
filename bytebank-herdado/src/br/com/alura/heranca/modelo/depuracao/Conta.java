package br.com.alura.heranca.modelo.depuracao;

import br.com.alura.heranca.modelo.Cliente;

public class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	protected Cliente titular;

	public Conta(int agencia, int numero, double saldo) {
		this.setAgencia(agencia);
		this.setNumero(numero);
		this.deposita(saldo);
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo <= valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }  this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		 this.saca(valor);
		 destino.deposita(valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

//	public boolean ehIgual(Conta outra) {
//	    if(this.agencia != outra.agencia){
//	        return false;
//	    }
//
//	    if(this.numero != outra.numero){
//	        return false;
//	    }
//
//	    return true;
//	}
	
	@Override
	public boolean equals(Object ref){

	    Conta outra = (Conta) ref;

	    if(this.agencia != outra.agencia){
	        return false;
	    }

	    if(this.numero != outra.numero){
	        return false;
	    }

	    return true;
	}

}
