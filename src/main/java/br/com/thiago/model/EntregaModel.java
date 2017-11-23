package br.com.thiago.model;

import java.sql.Date;

public class EntregaModel {
	private Long id;
	private Long numeroPedido;
	private Long idCliente;
	private String nomeRecebedor;
	private String cpfRecebedor;
	private Date dataEntrega;
	public EntregaModel(){}
		
	
	public EntregaModel(Long id,Long numeroPedido, Long idCliente, String nomeRecebedor, String cpfRecebedor, Date dataEntrega) {
		this.id = id;
		this.numeroPedido = numeroPedido;
		this.idCliente = idCliente;
		this.nomeRecebedor = nomeRecebedor;
		this.cpfRecebedor = cpfRecebedor;
		this.dataEntrega = dataEntrega;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(Long numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeRecebedor() {
		return nomeRecebedor;
	}
	public void setNomeRecebedor(String nomeRecebedor) {
		this.nomeRecebedor = nomeRecebedor;
	}
	public String getCpfRecebedor() {
		return cpfRecebedor;
	}
	public void setCpfRecebedor(String cpfRecebedor) {
		this.cpfRecebedor = cpfRecebedor;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	

}
