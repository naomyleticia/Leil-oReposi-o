package br.edu.ifal.leilao.modelo;

import java.util.ArrayList;
import java.util.List;

public class Leilao {

	private List<Cliente> clientes;
	private Produto produto;
	private List<Lance> lances;
	private double lanceMinimo;

	public Leilao(Produto produto, double lanceMinimo) {

		this.produto = produto;
		this.clientes = new ArrayList<Cliente>();
		this.lances = new ArrayList<Lance>();
		this.lanceMinimo =  lanceMinimo;
	}

	public void addLance(Lance lance) {
		this.lances.add(lance);
	}
	
	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public Produto getProduto() {
		return produto;
	}

	public List<Lance> getLances() {
		return lances;
	}

	public double getLanceMinimo() {
		return lanceMinimo;
	}
	
	
	
}
