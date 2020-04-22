package cursojava.executavel;

import java.util.Locale;
import java.util.Scanner;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		// new Aluno() � uma inst�ncia (cria��o do objeto)
		// aluno1 � uma referencia para o objeto aluno
		Aluno aluno1 = new Aluno(); // Joao
		aluno1.setNome("Joao");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("04/07/1997");
		aluno1.setRegistroGeral("12345");
		aluno1.setNumeroCPF("123456");
		aluno1.setNomeMae("Lia");
		aluno1.setNomePai("Lima");
		aluno1.setDatamatricula("06/07/2019");
		aluno1.setNomeEscola("JDev");
		aluno1.setSerieMatriculado("4");
		
		
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
