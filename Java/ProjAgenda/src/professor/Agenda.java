package professor;

import javax.swing.JOptionPane;

public class Agenda {

	public static void main(String[] args) {
		BancoDeDados bancoAgenda = new BancoDeDados();
		bancoAgenda.conectarMariaDB();
		if (bancoAgenda.estaConectado())
		{
		bancoAgenda.listarContatos();
//		bancoAgenda.inserirContato("Pedro", "(48)9.8830-1234");
//		bancoAgenda.inserirContato("Maria", "(49)9.8817-5678");
//		bancoAgenda.listarContatos();
		bancoAgenda.editarContato(1, "Joaozinho", "(47)9.9999-8888");
		bancoAgenda.listarContatos();
		//bancoAgenda.apagarContato(1);
		//bancoAgenda.listarContatos();
		bancoAgenda.desconectar();
		}
		else
		{
		JOptionPane.showMessageDialog(null,
		"O banco de dados 'programação_terca' não esta conectado");
		}

	}

}
