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
		
	    /*String nome = JOptionPane.showInputDialog("Nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Idade do aluno? ");
		(String DataN=JOptionPane.showInputDialog("Data de nascimento do Aluno? ");
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
		/*9aluno1.setDataNascimento(DataN);
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
		
		
		System.out.println(aluno1.toString()); // Descri��o do Objeto na memoria
		System.out.println("Media do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());*/
		
		
		// Equals e HashCode (Diferenciar Objetos)
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setNumeroCPF("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		aluno2.setNumeroCPF("123");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("S�o iguais");
		}
		else {
			System.out.println("N�o s�o iguais");
		}
		sc.close();
	}

}
