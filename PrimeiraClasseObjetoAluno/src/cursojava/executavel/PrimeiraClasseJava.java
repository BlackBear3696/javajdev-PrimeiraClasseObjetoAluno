package cursojava.executavel;

import java.util.Locale;
import java.util.Scanner;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		Aluno aluno1 = new Aluno(); // Joao
		
		Aluno aluno2 = new Aluno(); // Pedro
		
		Aluno aluno3 = new Aluno(); // Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jose,50");
		
		sc.close();
	}

}
