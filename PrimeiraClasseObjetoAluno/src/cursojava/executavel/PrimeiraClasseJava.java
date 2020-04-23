package cursojava.executavel;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		// new Aluno() � uma inst�ncia (cria��o do objeto)
		// aluno1 � uma referencia para o objeto aluno
		
		String nome = JOptionPane.showInputDialog("Nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Idade do aluno? ");
		String DataN=JOptionPane.showInputDialog("Data de nascimento do Aluno? ");
		String RG=JOptionPane.showInputDialog("N�mero de RG do Aluno? ");
		String CPF=JOptionPane.showInputDialog("N�mero do CPF do Aluno? ");
		String Mae=JOptionPane.showInputDialog("Nome da M�e do Aluno?");
		String Pai=JOptionPane.showInputDialog("Nome do Pai do Aluno?");
		String DataM=JOptionPane.showInputDialog("Data da matricula do Aluno? ");
		String NomeE=JOptionPane.showInputDialog("Nome da escola do Aluno?");
		String SerieM=JOptionPane.showInputDialog("Serie que o Aluno est� matriculado?");
		String N1=JOptionPane.showInputDialog("Nota1 do Aluno? ");
		String N2=JOptionPane.showInputDialog("Nota2 do Aluno? ");
		String N3=JOptionPane.showInputDialog("Nota3 do Aluno? ");
		String N4=JOptionPane.showInputDialog("Nota4 do Aluno? ");
		
		
		Aluno aluno1 = new Aluno(); // Joao
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); // Passando de String para Int
		aluno1.setDataNascimento(DataN);
		aluno1.setRegistroGeral(RG);
		aluno1.setNumeroCPF(CPF);
		aluno1.setNomeMae(Mae);
		aluno1.setNomePai(Pai);
		aluno1.setDatamatricula(DataM);
		aluno1.setNomeEscola(NomeE);
		aluno1.setSerieMatriculado(SerieM);
		aluno1.setNota1(Double.parseDouble(N1)); // Passando de String para Double
		aluno1.setNota2(Double.parseDouble(N2));
		aluno1.setNota3(Double.parseDouble(N3));
		aluno1.setNota4(Double.parseDouble(N4));
		
		
		
		System.out.println("Nome do aluno 1 � = " + aluno1.getNome());
		System.out.println("Idade do aluno � : " + aluno1.getIdade());
		System.out.println("Data de nascimento do aluno � : " + aluno1.getDataNascimento());
		System.out.println("RG do aluno � : " + aluno1.getRegistroGeral());
		System.out.println("CPF do aluno � : " + aluno1.getNumeroCPF());
		System.out.println("Nome da M�e do aluno � : " + aluno1.getNomeMae());
		System.out.println("Nome do Pai do aluno � : " + aluno1.getNomePai());
		System.out.println("Data da Matricula do aluno � : " + aluno1.getDatamatricula());
		System.out.println("Nome da Escola do aluno � : " + aluno1.getNomeEscola());
		System.out.println("Serie Matriculado do aluno � : " + aluno1.getSerieMatriculado());
		System.out.println("A nota1 do Aluno � : " + aluno1.getNota1());
		System.out.println("A nota2 do Aluno � : " + aluno1.getNota2());
		System.out.println("A nota3 do Aluno � : " + aluno1.getNota3());
		System.out.println("A nota4 do Aluno � : " + aluno1.getNota4());
		System.out.println("A media do aluno1 �: " + aluno1.getMediaNota());
		System.out.println("O resultado do aluno �: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("O aluno est� Aprovado: " + aluno1.getAlunoAprovado2());
		System.out.println("-----------------------------------------------------------------------------");
		
		//------------------------------------------------------------------------------------------------
		
		Aluno aluno2 = new Aluno(); // Pedro
		aluno2.setNome("Pedro");
		aluno2.setIdade(33);
		aluno2.setDataNascimento("10/10/2013");
		
		System.out.println("Nome do aluno  � = " + aluno2.getNome());
		System.out.println("Idade do aluno � : " + aluno2.getIdade());
		System.out.println("Data de nascimento do aluno � : " + aluno2.getDataNascimento());
		
		//------------------------------------------------------------------------------------------------
		
		Aluno aluno3 = new Aluno(); // Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jose,50");
		
		sc.close();
	}

}
