package br.edu.ifal.leilao.modelo;

public class Lance {

	private Cliente cliente;
	private double valorDoLance;

	public Lance(Cliente cliente, double valorDoLance) {
		super();
		this.cliente = cliente;
		this.valorDoLance = valorDoLance;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorDoLance() {
		return this.valorDoLance;
	}

	public void setValorDoLance(double valorDoLance) {
		this.valorDoLance = valorDoLance;
	}

}
