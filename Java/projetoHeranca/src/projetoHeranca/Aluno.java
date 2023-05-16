package projetoHeranca;
import java.util.Date;
//import projetoHeranca.Pessoa;

public class Aluno extends Pessoa {
	public Aluno(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public String matricula;
	
	public double tirarCopias(int qtd) {//Preço para tirar copias para alunos
		return 0.07 * (double) qtd;
	}

}