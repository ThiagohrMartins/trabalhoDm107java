package br.com.thiago.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.thiago.model.EntregaModel;

public class EntregaDAO {
	public void insert(Connection conn, EntregaModel entrega)
			throws SQLException{
		String sql = "insert into entregas (numero_pedido, id_cliente, nome_recebedor, cpf_recebedor, data_entrega) values (?, ?, ?, ?, ?);";
		PreparedStatement pstm;
		pstm = conn.prepareStatement(sql);
		//pstm.setLong(1, entrega.getId());
		pstm.setLong(1, entrega.getNumeroPedido());
		pstm.setLong(2, entrega.getIdCliente());
		pstm.setString(3, entrega.getNomeRecebedor());
		pstm.setString(4, entrega.getCpfRecebedor());
		pstm.setDate(5, entrega.getDataEntrega());
		pstm.execute();
	}
	
	public EntregaModel listEntregaByNumeroPedido(Connection conn, int numeroPedido) throws SQLException{
		String sql = "select * from entregas where numero_pedido = ?";
		PreparedStatement pstm;
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, numeroPedido);
		ResultSet rs = pstm.executeQuery();

		EntregaModel entrega = new EntregaModel();
		while (rs.next())
		{
			Long id = rs.getLong("id");
			Long numero_pedido = rs.getLong("numero_pedido");
			Long id_cliente = rs.getLong("id_cliente");
			String nome_recebedor = rs.getString("nome_recebedor");
			String cpf_recebedor = rs.getString("cpf_recebedor");
			Date data_hora_entrega = rs.getDate("data_entrega");
			entrega = new EntregaModel(id, numero_pedido, id_cliente, nome_recebedor, cpf_recebedor, data_hora_entrega);
		}
		return entrega;
	}

}
