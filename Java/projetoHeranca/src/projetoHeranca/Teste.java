package projetoHeranca;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Teste {

	public static void main(String[] args) {
		
		String stringDataAuxiliar = "16/05/2023";
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = null;
		try {
		dataFormatada = formato.parse(stringDataAuxiliar);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Aluno a = new Aluno("FULANO da Silva", "123.456.789-00", new Date());
		double valorPagar = 0;
		a = new Aluno("FULANO da Silva", "123.456.789-00", new Date());
		a.matricula = "12345-0";
		System.out.println("Veja como os atributos foram preenchidos para o ALUNO");
		System.out.println("Nome: " + a.nome);
		System.out.println("CPF: " + a.cpf);
		System.out.println("Data de nascimento: " + a.data_nascimento.toString());
		System.out.println("Matricula: " + a.matricula);
		valorPagar = a.tirarCopias(50);
		System.out.println("Para tirar 50 copias irá pagar: " + valorPagar);
		System.out.println("========================================================");
		
		Professor p = new Professor("Prof Jonny", "999.999.999-00", new Date());
		p.salario = 99999.99d;
		p.disciplina = "Programação";
		System.out.println("Veja como os atributos foram preenchidos para o PROFESSOR ");
		System.out.println("Nome: " + p.nome);
		System.out.println("CPF: " + p.cpf);
		System.out.println("Data de nascimento: " + p.data_nascimento.toString());
		System.out.println("Salario: " + p.salario);
		System.out.println("Disciplina: " + p.disciplina);
		System.out.println("==========================================================");
		
		Funcionario f = new Funcionario("CICLANO da Silva", "888.888.888-00", new Date());
		f.cargo = "Programador WEB";
		f.salario = 100000.00d;
		f.data_admissao = dataFormatada;
		System.out.println("Veja como os atributos foram preenchidos para o FUNCIONARIO ");
		System.out.println("Nome: " + f.nome);
		System.out.println("CPF: " + f.cpf);
		System.out.println("Data de nascimento: " + f.data_nascimento.toString());
		System.out.println("Salario: " + f.salario);
		System.out.println("Cargo: " + f.cargo);
		System.out.println("Data de admissao: " + f.data_admissao);
		System.out.println("==========================================================");
	}	
}
