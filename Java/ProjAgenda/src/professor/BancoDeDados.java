package professor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import java.util.Properties;


public class BancoDeDados {
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;
	private String banco = "programacao_terca";
	private String porta = "3306";
	private String IpHost = "//localhost";
	
	public void conectarMariaDB() {
		String servidor = "jdbc:mariadb:" + this.IpHost + ":" + this.porta + "/" + this.banco;
		String usuario = "root";
		String senha = "";
		try {
			this.connection = DriverManager.getConnection(servidor,usuario,senha);
			this.statement = this.connection.createStatement();
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
			"Ocorreu um erro na tentativa de conectar com o banco de dados !!" +
			"\nErro ocorrido: " + e.getMessage());
		}
	}
	
	public boolean estaConectado() {
		if (this.connection != null) {
			return (true);
		}
		else {
			return (false);
		}
	}
	
	public void desconectar() {
		try {
			this.connection.close();
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
			"Ocorreu um na tentativa de fechar o banco de dados: " +
			e.getMessage());
		}
	}
	
	public void listarContatos()
	{
		String query = "SELECT * FROM contatos ORDER BY Nome";
		try {
			this.resultset = this.statement.executeQuery(query);
			while (this.resultset.next()) {
				System.out.println("Listagem dos contatos ------------------------------------");
				this.resultset = this.statement.executeQuery(query);
				
				while (this.resultset.next()) {
					System.out.println( " " + this.resultset.getString("Id") +
					" " + this.resultset.getString("Nome") +
					" " + this.resultset.getString("Telefone")
					);
				}
				System.out.println("Fim da listagem dos contatos -----------------------------");
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
			"Ocorreu um erro na tentativa de listar contatos: " +
			e.getMessage());
		}
	}
	
	public void inserirContato(String nome, String telefone) {
		String query = "INSERT INTO contatos (Nome,Telefone) VALUES ('" +
		nome +
		"','" +
		telefone +
		"');";
		try {
			this.statement.executeUpdate(query);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
			"Ocorreu um erro na tentativa de inserir contato: " + e.getMessage());
		}
	}
	
	public void editarContato(int id, String nome, String telefone) {
		String query = "UPTADE contatos SET Nome = '" + nome +
				"', Telefone = '" + telefone + 
				"' WHERE Id = " + id + ";";
		try {
			this.statement.executeUpdate(query);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
			"Ocorreu um erro na tentativa de editar o contato: " +
			e.getMessage());
		}
	}
	
	public void apagarContato(int id)
	{
		String query = "DELETE FROM contatos WHERE Id = " + id + ";";
		try
		{
			this.statement.executeUpdate(query);
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null,
			"Ocorreu um erro na tentativa de deletar o contato: " +
			e.getMessage());
		}
	}

	
}
