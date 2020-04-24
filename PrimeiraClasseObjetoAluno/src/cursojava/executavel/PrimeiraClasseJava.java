package cursojava.executavel;


import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		// new Aluno() � uma inst�ncia (cria��o do objeto)
		// aluno1 � uma referencia para o objeto aluno
		
	    String nome = JOptionPane.showInputDialog("Nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Idade do aluno? ");
		/*String DataN=JOptionPane.showInputDialog("Data de nascimento do Aluno? ");
		String RG=JOptionPane.showInputDialog("N�mero de RG do Aluno? ");
		String CPF=JOptionPane.showInputDialog("N�mero do CPF do Aluno? ");
		String Mae=JOptionPane.showInputDialog("Nome da M�e do Aluno?");
		String Pai=JOptionPane.showInputDialog("Nome do Pai do Aluno?");
		String DataM=JOptionPane.showInputDialog("Data da matricula do Aluno? ");
		String NomeE=JOptionPane.showInputDialog("Nome da escola do Aluno?");*/
		String SerieM=JOptionPane.showInputDialog("Serie que o Aluno est� matriculado?");
		
		
		
		
		Aluno aluno1 = new Aluno(); // Joao
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); // Passando de String para Int
		/*aluno1.setDataNascimento(DataN);
		aluno1.setRegistroGeral(RG);
		aluno1.setNumeroCPF(CPF);
		aluno1.setNomeMae(Mae);
		aluno1.setNomePai(Pai);
		aluno1.setDatamatricula(DataM);
		aluno1.setNomeEscola(NomeE);
		aluno1.setSerieMatriculado(SerieM);*/
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("PostgreSQL");
		disciplina1.setNota(9);
		
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new  Disciplina();
		disciplina2.setDisciplina("PHP");
		disciplina2.setNota(8);
		
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Docker");
		disciplina3.setNota(9);
		
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Zabbix");
		disciplina4.setNota(9);
		
		aluno1.getDisciplinas().add(disciplina4);
		
		System.out.println(aluno1); // Descri��o do Objeto na memoria
		System.out.println("Media do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		

		
		sc.close();
	}

}
