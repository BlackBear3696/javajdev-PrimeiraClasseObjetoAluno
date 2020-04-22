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
		aluno1.nome = "Joao";
		aluno1.idade = 50;
		
		System.out.println("Nome do aluno 1 � = " + aluno1.nome);
		System.out.println("Idade do aluno 1 � = " + aluno1.idade);
		
		Aluno aluno2 = new Aluno(); // Pedro
		
		Aluno aluno3 = new Aluno(); // Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jose,50");
		
		sc.close();
	}

}
